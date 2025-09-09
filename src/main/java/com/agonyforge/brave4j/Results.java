package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private String type;
    private Result[] results;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }
}
