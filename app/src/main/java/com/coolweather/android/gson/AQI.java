package com.coolweather.android.gson;

/**
 * Created by cmz22 on 2017/5/7.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
