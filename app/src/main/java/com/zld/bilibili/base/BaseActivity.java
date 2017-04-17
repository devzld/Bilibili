package com.zld.bilibili.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by lingdong on 2017/4/15.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        initView(savedInstanceState);

    }

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract int getLayoutId() ;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
