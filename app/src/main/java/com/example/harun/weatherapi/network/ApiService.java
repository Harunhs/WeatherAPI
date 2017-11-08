package com.example.harun.weatherapi.network;



import com.example.harun.weatherapi.models.request.WeatherRequest;
import com.example.harun.weatherapi.models.response.WeatherModel;

import com.example.harun.weatherapi.models.response.LocalWeatherModel;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Harun on 30.10.2017.
 */

public interface ApiService {


    /*
    @POST("/hava/current-weather/")
    Call<WeatherRequest> savePost(@Field("city") String city);

    @GET("hava/weathers")
    Call<List<LocalWeatherModel>> getWeatherList(@Query("city_name") String city);

    @GET("hava/weathers/{id}")
    Call<WeatherModel> getWeather2(@Path("id") int id);
    */

    @GET("hava/weathers/{id}")
    Call<WeatherModel> getLocalWeatherWithID(@Path("id") int id);

    @GET("hava/weathers")
    Call<List<LocalWeatherModel>> getLocalWeathers(@Query("city_name") String cityName);


}
