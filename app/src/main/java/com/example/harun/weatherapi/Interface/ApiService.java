package com.example.harun.weatherapi.Interface;

import com.example.harun.weatherapi.Models.Current;
import com.example.harun.weatherapi.Models.Example;

import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Harun on 30.10.2017.
 */

public interface ApiService {

    @GET("v1/current.json?key=31b38d6b8e2e48b38b8215100173010")
    Call<Current> getWeather(@Query("q") String query);
}
