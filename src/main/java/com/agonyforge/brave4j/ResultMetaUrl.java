package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultMetaUrl {
    @JsonProperty("scheme") private String scheme;
    @JsonProperty("netloc") private String netloc;
    @JsonProperty("hostname") private String hostname;
    @JsonProperty("favicon") private String favicon;
    @JsonProperty("watch") private String watch;
}
