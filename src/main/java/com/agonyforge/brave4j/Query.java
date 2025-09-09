package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {
    @JsonProperty("original") private String original;
    @JsonProperty("show_strict_warning") private boolean showStrictWarning;
    @JsonProperty("is_navigational") private boolean isNavigational;
    @JsonProperty("local_decision") private String localDecision;
    @JsonProperty("local_locations_idx") private int localLocationsIdx;
    @JsonProperty("is_news_breaking") private boolean isNewsBreaking;
    @JsonProperty("spellcheck_off") private boolean spellcheckOff;
    @JsonProperty("country") private String country;
    @JsonProperty("bad_results") private boolean badResults;
    @JsonProperty("should_fallback") private boolean shouldFallback;
    @JsonProperty("postal_code") private String postalCode;
    @JsonProperty("city") private String city;
    @JsonProperty("header_country") private String headerCountry;
    @JsonProperty("more_results_available") private boolean moreResultsAvailable;
    @JsonProperty("state") private String state;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public boolean isShowStrictWarning() {
        return showStrictWarning;
    }

    public void setShowStrictWarning(boolean showStrictWarning) {
        this.showStrictWarning = showStrictWarning;
    }

    public boolean isNavigational() {
        return isNavigational;
    }

    public void setNavigational(boolean navigational) {
        isNavigational = navigational;
    }

    public String getLocalDecision() {
        return localDecision;
    }

    public void setLocalDecision(String localDecision) {
        this.localDecision = localDecision;
    }

    public int getLocalLocationsIdx() {
        return localLocationsIdx;
    }

    public void setLocalLocationsIdx(int localLocationsIdx) {
        this.localLocationsIdx = localLocationsIdx;
    }

    public boolean isNewsBreaking() {
        return isNewsBreaking;
    }

    public void setNewsBreaking(boolean newsBreaking) {
        isNewsBreaking = newsBreaking;
    }

    public boolean isSpellcheckOff() {
        return spellcheckOff;
    }

    public void setSpellcheckOff(boolean spellcheckOff) {
        this.spellcheckOff = spellcheckOff;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isBadResults() {
        return badResults;
    }

    public void setBadResults(boolean badResults) {
        this.badResults = badResults;
    }

    public boolean isShouldFallback() {
        return shouldFallback;
    }

    public void setShouldFallback(boolean shouldFallback) {
        this.shouldFallback = shouldFallback;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeaderCountry() {
        return headerCountry;
    }

    public void setHeaderCountry(String headerCountry) {
        this.headerCountry = headerCountry;
    }

    public boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    public void setMoreResultsAvailable(boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
