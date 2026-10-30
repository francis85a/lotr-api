package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chapter {
    
    @JsonProperty("_id")
    private String id;

    @JsonProperty("chapterName")
    private String chapterName;

    @JsonProperty("book")
    private String book;

    public String getId() {
        return id;
    }

    public String getChapterName() {
        return chapterName;
    }

    public String getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Chapter [getId()=" + getId() + ", getChapterName()=" + getChapterName() + ", getBook()=" + getBook()
                + "]";
    }

}
