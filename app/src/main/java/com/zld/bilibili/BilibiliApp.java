package com.zld.bilibili;

import android.app.Application;

/**
 * Created by lingdong on 2017/4/15.
 */

public class BilibiliApp extends Application{

    private static BilibiliApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;


    }

    public static BilibiliApp getInstance(){
        return mInstance;
    }
}
