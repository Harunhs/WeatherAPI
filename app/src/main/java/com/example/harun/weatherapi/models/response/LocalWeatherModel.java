package com.example.harun.weatherapi.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harun on 8.11.2017.
 */

public class LocalWeatherModel {

    @SerializedName("id")
    private int id;

    @SerializedName("city")
    private String city;

    @SerializedName("temp")
    private double temp;

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public double getTemp() {
        return temp;
    }
}
