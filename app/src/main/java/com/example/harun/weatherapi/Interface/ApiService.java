package com.example.harun.weatherapi.Interface;



import com.example.harun.weatherapi.Models.Post;
import com.example.harun.weatherapi.Models.WeatherModel;

import com.example.harun.weatherapi.Models.WeatherModelList;


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


    @POST("/hava/current-weather/")
    @FormUrlEncoded
    Call<Post> savePost(@Field("city") String city);

    @GET("hava/weathers")
    Call<List<WeatherModelList>> getWeatherList(@Query("city_name") String city);

    @GET("hava/weathers/{id}")
    Call<WeatherModel> getWeather2(@Path("id") int id);


}
