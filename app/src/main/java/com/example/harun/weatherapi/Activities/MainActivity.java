package com.example.harun.weatherapi.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.harun.weatherapi.Models.Post;
import com.example.harun.weatherapi.Models.WeatherModel;
import com.example.harun.weatherapi.Models.WeatherModelList;
import com.example.harun.weatherapi.R;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    public TextView text1;
    @BindView(R.id.city_name)
    public EditText city_name;
    @BindView(R.id.set_city)
    public Button set_city;

    public Double temp2=null;
    private Post post;
    public Integer i=null;

    private WeatherModel weatherModel;
    private List<WeatherModelList> weatherModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



       set_city.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                /*
               String city=city_name.getText().toString();
               postWeather(city);

               */
                getWeatherList();

               getWeather2(i);




           }
       });


    }


     void postWeather(final String city){
         ApiClient.createService(this)
                 .savePost(city)
                 .enqueue(new Callback<Post>() {
                     @Override
                     public void onResponse(Call<Post> call, Response<Post> response) {
                         post=response.body();
                         post.setCity(city);
                     }

                     @Override
                     public void onFailure(Call<Post> call, Throwable t) {

                     }
                 });
     }

     void getWeatherList(){
         ApiClient.createService(this)
                 .getWeatherList("London")
                 .enqueue(new Callback<List<WeatherModelList>>() {
                     @Override
                     public void onResponse(Call<List<WeatherModelList>> call, Response<List<WeatherModelList>> response) {

                         weatherModelList=response.body();
                         i=weatherModelList.get(0).getId();
                     }

                     @Override
                     public void onFailure(Call<List<WeatherModelList>> call, Throwable t) {

                     }
                 });

     }
     void getWeather2(int i){
         ApiClient.createService(this)
                 .getWeather2(i)
                 .enqueue(new Callback<WeatherModel>() {
                     @Override
                     public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                         weatherModel=response.body();
                         temp2=weatherModel.getTemp();
                         text1.setText(String.valueOf(temp2));
                     }

                     @Override
                     public void onFailure(Call<WeatherModel> call, Throwable t) {

                     }
                 });
     }




}
