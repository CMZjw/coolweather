package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cmz22 on 2017/5/7.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("text")
        public String info;
    }
}
