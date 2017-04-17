package com.zld.bilibili.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import com.zld.bilibili.R;
import com.zld.bilibili.common.FullScreenUtil;
import com.zld.bilibili.common.PrefConstants;
import com.zld.bilibili.common.PreferencesUtils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreenUtil.fullScreen(this);
        setContentView(R.layout.activity_splash);
        setupSplash();

    }

    private void setupSplash() {
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                finishTask();
            }
        }.start();
    }

    private void finishTask() {
        boolean isLogin = PreferencesUtils.getBoolean(this,PrefConstants.IS_LOGIN,false);
        if(isLogin){
            startActivity(new Intent(this,MainActivity.class));
        }else {
            startActivity(new Intent(this,LoginActivity.class));
        }

        finish();
    }
}
