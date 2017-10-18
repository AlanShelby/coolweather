package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 灾害预警
 * Created by AlanShelby on 2017/10/18.
 */

public class Alarms {

    @SerializedName("stat")
    public String status;

    public String title;

    @SerializedName("txt")
    public String info;

}
