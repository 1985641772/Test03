package com.thebest.thebest.other.utils;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.thebest.thebest.other.ui.MyApplication;

/**
 * 网络请求
 * Created by mao on 2016/2/17.
 */
public class HttpURLUtils {

    //发现应用中  最新界面的url接口
    private static String strLastestUrl = "http://zuimeia.com/api/community/apps/?pos=-1&page_size=20&platform=2&openUDID=555784260647676&appVersion=3.2.4&appVersionCode=30204&systemVersion=17&resolution=800x1280&platform=2&app_client=NiceAppAndroid&phoneModel=AndyWin";

    public  void stringGetResquest(){
        //发现应用中  最新界面的url接口
        String strLastestUrl = "http://zuimeia.com/api/community/apps/?pos=-1&page_size=20&platform=2&openUDID=555784260647676&appVersion=3.2.4&appVersionCode=30204&systemVersion=17&resolution=800x1280&platform=2&app_client=NiceAppAndroid&phoneModel=AndyWin";

        final StringRequest request = new StringRequest(strLastestUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("qf",response);
                Log.d("qf","123");

            }
        }, new Response.ErrorListener() {
            @Override
                public void onErrorResponse(VolleyError error) {

                }
        });
        MyApplication.requestQueue.add(request);

    }
}
