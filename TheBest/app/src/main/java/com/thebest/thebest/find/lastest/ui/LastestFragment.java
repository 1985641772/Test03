package com.thebest.thebest.find.lastest.ui;

import android.util.Log;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.thebest.thebest.R;
import com.thebest.thebest.other.ui.BaseFragment;
import com.thebest.thebest.other.ui.MyApplication;

/**
 * Created by Administrator on 2016/2/16.
 */
public class LastestFragment extends BaseFragment {

    private ListView findLastestLv;


    @Override
    protected int getLayout() {
        return R.layout.fragment_find_lastest;
    }

    @Override
    protected void initViews() {
        findLastestLv = (ListView) root.findViewById(R.id.find_lastest_lv);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {
        stringGetResquest();

    }
    public  void stringGetResquest(){
        //发现应用中  最新界面的url接口
        String strLastestUrl = "http://zuimeia.com/api/community/apps/?pos=-1&page_size=20&platform=2&openUDID=555784260647676&appVersion=3.2.4&appVersionCode=30204&systemVersion=17&resolution=800x1280&platform=2&app_client=NiceAppAndroid&phoneModel=AndyWin";

        final StringRequest request = new StringRequest(strLastestUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("qf", response);
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
