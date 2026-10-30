package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
    
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("dialog")
    private String dialog;

    @JsonProperty("movie")
    private String movie;

    @JsonProperty("character")
    private String character;

    @JsonProperty("id")
    private String id;


    public String get_id() {
        return _id;
    }

    public String getDialog() {
        return dialog;
    }

    public String getMovie() {
        return movie;
    }

    public String getCharacter() {
        return character;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Quote [get_id()=" + get_id() + ", getDialog()=" + getDialog() + ", getMovie()=" + getMovie()
                + ", getCharacter()=" + getCharacter() + ", getId()=" + getId() + "]";
    }
    
}
