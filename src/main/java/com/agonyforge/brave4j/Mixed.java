package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mixed {
    @JsonProperty("type") private String type;
    @JsonProperty("main") private MixedRegion[] main;
    @JsonProperty("top") private MixedRegion[] top;
    @JsonProperty("side") private MixedRegion[] side;
}
