package com.coolweather.android.gson;

/**
 * 天气质量实况
 * Created by AlanShelby on 2017/10/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
