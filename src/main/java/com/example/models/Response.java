package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Response<T> {
    
    @JsonProperty("docs")
    private List<T> docs;

    @JsonProperty("total")
    private int total;

    
    public List<T> getDocs() {
        return docs;
    }

    public int getTotal() {
        return total;
    }

}
