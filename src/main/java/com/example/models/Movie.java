package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
    
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("runtimeInMinutes")
    private Integer runtimeInMinutes;

    @JsonProperty("budgetInMillions")
    private Integer budgetInMillions;

    @JsonProperty("boxOfficeRevenueInMillions")
    private Integer boxOfficeRevenueInMillions;

    @JsonProperty("academyAwardNominations")
    private Integer academyAwardNominations;

    @JsonProperty("academyAwardWins")
    private Integer academyAwardWins;

    @JsonProperty("rottenTomatoesScore")
    private Integer rottenTomatoesScore;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public Integer getBudgetInMillions() {
        return budgetInMillions;
    }

    public Integer getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public Integer getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public Integer getAcademyAwardWins() {
        return academyAwardWins;
    }

    public Integer getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    @Override
    public String toString() {
        return "Movie [getId()=" + getId() + ", getName()=" + getName() + ", getRuntimeInMinutes()="
                + getRuntimeInMinutes() + ", getBudgetInMillions()=" + getBudgetInMillions()
                + ", getBoxOfficeRevenueInMillions()=" + getBoxOfficeRevenueInMillions()
                + ", getAcademyAwardNominations()=" + getAcademyAwardNominations() + ", getAcademyAwardWins()="
                + getAcademyAwardWins() + ", getRottenTomatoesScore()=" + getRottenTomatoesScore() + "]";
    }
    
}
