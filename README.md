# brave4j
## Model objects for Brave Search API

These are just model objects. It's not a full framework for making queries. To use them you will need to write some code.

### Add Brave4j to your project

In `build.gradle` you need to give it the GitHub package repository:

```groovy
repositories {
	mavenCentral()
	maven {
		url = uri("https://maven.pkg.github.com/scionaltera/brave4j")
		credentials {
			username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
			password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
		}
	}
}
```

Unfortunately there is no anonymous access to GitHub packages, so you have to provide your username and token for 
them to let you in.

I find it inconvenient to provide the token via environment variables, so I make a `gradle.properties` file in 
the `.gradle/` directory in my project. You shouldn't be putting that directory in git so it should be safe in there.
Once you have that, it will be provided to Gradle whenever you build and not published to git.

In `.gradle/gradle.properties`:

```properties
USERNAME=your-username-goes-here
TOKEN=your-token-goes-here
```

If you use Maven, I'm sure there must be a way to do the same thing. If you want to share instructions, you may
submit a PR to add to the README. :)

### Compatibility with RestTemplate

To make this work with Spring's `RestTemplate` I had to make it use the Apache HTTP client so that it could
successfully convert the responses into objects.

In `build.gradle`:

```groovy
implementation('org.apache.httpcomponents.client5:httpclient5')
```

In a `@Configuration` annotated class:

```java
@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
    ConnectionConfig connectionConfig = ConnectionConfig
            .custom()
            .setConnectTimeout(30, TimeUnit.SECONDS)
            .setSocketTimeout(30, TimeUnit.SECONDS)
            .build();

    @SuppressWarnings("resource")
    BasicHttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager();

    connectionManager.setConnectionConfig(connectionConfig);

    return builder
            .requestFactory(() -> new HttpComponentsClientHttpRequestFactory(HttpClientBuilder
                    .create()
                    .setConnectionManager(connectionManager)
                    .build()))
            .build();
}
```

### Write some code

Finally, here's how to call the Brave Search API with your new and improved `RestTemplate`:

```java
// takes a search query, sends it to Brave and returns the URLs from the search results
public List<String> getBraveSearchUrls(String query) {
        LOGGER.info("Web search query: {}", query);
        String urlTemplate = UriComponentsBuilder
                .fromUriString("https://api.search.brave.com/res/v1/web/search")
                .queryParam("q", "{keywords}")
                .encode()
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Accept-Encoding", "gzip");
        headers.add("X-Subscription-Token", YOUR_API_KEY_HERE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>("parameters", headers);

        try {
            ResponseEntity<Response> responseEntity = restTemplate.exchange(
                    urlTemplate,
                    HttpMethod.GET,
                    request,
                    Response.class,
                    Map.of("keywords", query));

            Response response = responseEntity.getBody();

            if (response == null || response.getWeb() == null || response.getWeb().getResults() == null) {
                LOGGER.info("Search returned no results");
                return List.of();
            }

            List<String> urls = Arrays.stream(response.getWeb().getResults())
                    .map(Result::getUrl)
                    .toList();

            LOGGER.info("Found {} results: {}", urls.size(), urls);

            return new ArrayList<>(urls);
        } catch (Exception e) {
            LOGGER.error("Error searching for results: {}", e.getMessage());
            return List.of();
        }
    }
```