package com.example.harun.weatherapi.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import com.example.harun.weatherapi.Models.Current;

import com.example.harun.weatherapi.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    public TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ApiClient.createService(this)
                .getWeather("Paris")

                .enqueue(new Callback<Current>() {
                    @Override
                    public void onResponse(Call<Current> call, Response<Current> response) {

                        response.body();
                       Double temp=response.body().getTempC();
                       Toast.makeText(getApplicationContext(),String.valueOf(temp),Toast.LENGTH_LONG).show();


                    }

                    @Override
                    public void onFailure(Call<Current> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"FAİL",Toast.LENGTH_LONG).show();
                    }
                });

     }}
