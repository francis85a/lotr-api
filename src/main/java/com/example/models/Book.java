package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    
    @JsonProperty("_id")
    private String id;

    @JsonProperty("name")
    private String name;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book [getId()=" + getId() + ", getName()=" + getName() + "]";
    }

}
