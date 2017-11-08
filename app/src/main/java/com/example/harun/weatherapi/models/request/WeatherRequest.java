package com.example.harun.weatherapi.models.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harun on 7.11.2017.
 */

public class WeatherRequest {

    @SerializedName("city")
    public String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
