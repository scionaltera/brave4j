package com.agonyforge.brave4j;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Query query;
    private Mixed mixed;
    private Results videos;
    private Results web;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Mixed getMixed() {
        return mixed;
    }

    public void setMixed(Mixed mixed) {
        this.mixed = mixed;
    }

    public Results getVideos() {
        return videos;
    }

    public void setVideos(Results videos) {
        this.videos = videos;
    }

    public Results getWeb() {
        return web;
    }

    public void setWeb(Results web) {
        this.web = web;
    }
}
