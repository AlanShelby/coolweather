package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 小时预报
 * Created by AlanShelby on 2017/10/17.
 */

public class HourlyForecast {

    public String date;

    @SerializedName("tmp")
    public String temperature;

    public HourlyForecast(String date, String temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
