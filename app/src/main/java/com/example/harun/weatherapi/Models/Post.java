package com.example.harun.weatherapi.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harun on 7.11.2017.
 */

public class Post {
    @SerializedName("city")
    public String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
