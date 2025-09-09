package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    @JsonProperty("type") private String type;
    @JsonProperty("url") private String url;
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("age") private String age;
    @JsonProperty("page_age") private String pageAge;
    @JsonProperty("video") private Object video; // TODO ???
    @JsonProperty("meta_url") private ResultMetaUrl metaUrl;
    @JsonProperty("thumbnail") private ResultThumbnail thumbnail;
    @JsonProperty("is_source_local") private Boolean isSourceLocal;
    @JsonProperty("is_source_both") private Boolean isSourceBoth;
    @JsonProperty("language") private String language;
    @JsonProperty("family_friendly") private Boolean familyFriendly;
    @JsonProperty("subtype") private String subtype;
    @JsonProperty("extra_snippets") private String[] extraSnippets;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPageAge() {
        return pageAge;
    }

    public void setPageAge(String pageAge) {
        this.pageAge = pageAge;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public ResultMetaUrl getMetaUrl() {
        return metaUrl;
    }

    public void setMetaUrl(ResultMetaUrl metaUrl) {
        this.metaUrl = metaUrl;
    }

    public ResultThumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ResultThumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getSourceLocal() {
        return isSourceLocal;
    }

    public void setSourceLocal(Boolean sourceLocal) {
        isSourceLocal = sourceLocal;
    }

    public Boolean getSourceBoth() {
        return isSourceBoth;
    }

    public void setSourceBoth(Boolean sourceBoth) {
        isSourceBoth = sourceBoth;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(Boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String[] getExtraSnippets() {
        return extraSnippets;
    }

    public void setExtraSnippets(String[] extraSnippets) {
        this.extraSnippets = extraSnippets;
    }
}
