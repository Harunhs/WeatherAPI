package com.example.harun.weatherapi.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harun on 6.11.2017.
 */

public class WeatherModel {

    @SerializedName("id")
    public int id;
    @SerializedName("temp")
    public double temp;
    @SerializedName("city")
    public String city;
    @SerializedName("pressure")
    public int pressure;
    @SerializedName("temp_min")
    public double temp_min;
    @SerializedName("temp_max")
    public double temp_max;
    @SerializedName("humidity")
    public int humidity;
    @SerializedName("date_created")
    public String date_created;

    public int getId() {
        return id;
    }

    public double getTemp() {
        return temp;
    }

    public String getCity() {
        return city;
    }

    public int getPressure() {
        return pressure;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDate_created() {
        return date_created;
    }
}
