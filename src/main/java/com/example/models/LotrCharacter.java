package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;

public class LotrCharacter {
    
    @JsonProperty("_id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("wikiUrl")
    private String wikiUrl;

    @JsonProperty("race")
    private String race;

    @JsonProperty("birth")
    private String birth;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("death")
    private String death;

    @JsonProperty("hair")
    private String hair;

    @JsonProperty("height")
    private String height;
    
    @JsonProperty("realm")
    private String realm;

    @JsonProperty("spouse")
    private String spouse;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public String getRace() {
        return race;
    }

    public String getBirth() {
        return birth;
    }

    public String getGender() {
        return gender;
    }

    public String getDeath() {
        return death;
    }

    public String getHair() {
        return hair;
    }

    public String getHeight() {
        return height;
    }

    public String getRealm() {
        return realm;
    }

    public String getSpouse() {
        return spouse;
    }

    @Override
    public String toString() {
        return "LotrCharacter [getId()=" + getId() + ", getName()=" + getName() + ", getWikiURL()=" + getWikiUrl()
                + ", getRace()=" + getRace() + ", getBirth()=" + getBirth() + ", getGender()=" + getGender()
                + ", getDeath()=" + getDeath() + ", getHair()=" + getHair() + ", getHeight()=" + getHeight()
                + ", getRealm()=" + getRealm() + ", getSpouse()=" + getSpouse() + "]";
    }

    

}
