package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cmz22 on 2017/5/7.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        public String updateTime;
    }
}
