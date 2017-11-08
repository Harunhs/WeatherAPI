package com.example.harun.weatherapi.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harun on 8.11.2017.
 */

public class WeatherModelList {

    @SerializedName("id")
    private int id;

    @SerializedName("city")
    private String city;

    @SerializedName("temp")
    private double temp;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
