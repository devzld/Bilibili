package com.zld.bilibili.view;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

import com.zld.bilibili.R;
import com.zld.bilibili.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tl_content)
    TabLayout tlContent;
    @BindView(R.id.vp_content)
    ViewPager vpContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupStatusBar();
        addTab();

    }

    private void setupStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }
    }

    private void addTab() {
        tlContent.addTab(tlContent.newTab().setText("头条"));
        tlContent.addTab(tlContent.newTab().setText("国内"));
        tlContent.addTab(tlContent.newTab().setText("娱乐"));
        tlContent.addTab(tlContent.newTab().setText("体育"));
        tlContent.addTab(tlContent.newTab().setText("头条"));
        tlContent.addTab(tlContent.newTab().setText("国内"));
        tlContent.addTab(tlContent.newTab().setText("娱乐"));
        tlContent.addTab(tlContent.newTab().setText("体育"));
    }
}
