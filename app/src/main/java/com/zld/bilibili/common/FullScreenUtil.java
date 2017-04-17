package com.zld.bilibili.common;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by lingdong on 2017/4/16.
 */

public class FullScreenUtil {

    public static void fullScreen(Activity activity){
         /*set it to be no title*/
        activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
       /*set it to be full screen*/
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
