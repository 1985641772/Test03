package com.thebest.thebest.other.ui;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.lidroid.xutils.HttpUtils;

/**
 * Created by mao on 2016/2/16.
 */
public class MyApplication extends Application {
    public static RequestQueue requestQueue;
    public static HttpUtils httpUtils;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(this);

        httpUtils = new HttpUtils();
    }
}
