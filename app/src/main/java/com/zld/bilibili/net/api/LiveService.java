package com.zld.bilibili.net.api;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lingdong on 2017/4/15.
 */

public interface LiveService {
    /**
     * 首页直播
     */
    @GET("AppIndex/home?_device=android&_hwid=51e96f5f2f54d5f9&_ulv=10000&access_key=563d6046f06289cbdcb472601ce5a761&appkey=c1b107428d337928&build=410000&platform=android&scale=xxhdpi&sign=fbdcfe141853f7e2c84c4d401f6a8758")
    Call<String> getLiveAppIndex();

}
