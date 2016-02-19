package com.thebest.thebest.other.utils;

import android.app.Activity;
import android.content.Intent;

import com.thebest.thebest.other.ui.GuideActivity;
import com.thebest.thebest.other.ui.HomeActivity;

/**
 * 跳转管理工具类
 * Created by mao on 2016/2/16.
 */
public class JumpManger {

    /**
     * 跳转到主页面
     * @param activity  当前页
     */
    public static void jumpToHome(Activity activity){

        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
    }


    /**
     * 跳转到引导页
     * @param activity 当前页
     */
    public static void jumpToGuide(Activity activity){
        Intent intent = new Intent(activity, GuideActivity.class);
        activity.startActivity(intent);
    }

}
