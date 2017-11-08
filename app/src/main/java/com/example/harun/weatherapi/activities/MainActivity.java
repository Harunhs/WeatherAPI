package com.example.harun.weatherapi.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.harun.weatherapi.models.response.WeatherModel;
import com.example.harun.weatherapi.models.response.LocalWeatherModel;
import com.example.harun.weatherapi.R;
import com.example.harun.weatherapi.network.ApiClient;
import com.example.harun.weatherapi.network.ApiService;


import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private ApiService apiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mContext = getApplicationContext();
        apiService = ApiClient.createService(mContext);



    }



    void getLocalWeatherWithID(int id) {

        apiService
                .getLocalWeatherWithID(id)
                .enqueue(new Callback<WeatherModel>() {
                    @Override
                    public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                        int i = 0;
                    }

                    @Override
                    public void onFailure(Call<WeatherModel> call, Throwable t) {

                    }
                });

    }

    void getLocalWeatherWithCityName(String cityName) {

        apiService
                .getLocalWeathers(cityName)
                .enqueue(new Callback<List<LocalWeatherModel>>() {
                    @Override
                    public void onResponse(Call<List<LocalWeatherModel>> call,
                                           Response<List<LocalWeatherModel>> response) {


                    }

                    @Override
                    public void onFailure(Call<List<LocalWeatherModel>> call,
                                          Throwable t) {

                    }
                });

    }


}
