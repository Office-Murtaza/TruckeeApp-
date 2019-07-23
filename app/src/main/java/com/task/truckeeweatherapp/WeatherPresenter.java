package com.task.truckeeweatherapp;

import com.task.truckeeweatherapp.model.Datum;

import java.util.List;

public class WeatherPresenter implements WeatherContract.Presenter, WeatherContract.Model.OnFinishedListener {

    private WeatherContract.View weatherView;

    private WeatherContract.Model weatherModel;

    public WeatherPresenter(WeatherContract.View weatherView) {
        this.weatherView = weatherView;
        weatherModel = new WeatherModel();
    }


    @Override
    public void onFailure(Throwable t) {

    }

    @Override
    public void setWeatherData(List<Datum> data) {
        if(data != null){
            weatherView.setWeatherData(data);
        }
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void getDailyWeatherData(String date) {
        weatherModel.getDailyWeather(this, date);
    }
}