package com.thebest.thebest.other.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.thebest.thebest.R;
import com.thebest.thebest.other.utils.Contants;
import com.thebest.thebest.other.utils.JumpManger;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 第一次进入应用时跳到引导页，不是就跳入主页面
         */
        if (isFirstUsed()) {
            JumpManger.jumpToGuide(MainActivity.this);
            finish();
        } else {
            setContentView(R.layout.activity_main);
            JumpManger.jumpToHome(MainActivity.this);
            finish();
        }


    }






    /**
     * 判断是否第一次进入
     * @return
     */
        private boolean isFirstUsed(){
            SharedPreferences preferences = getSharedPreferences(Contants.PREFERENCE_FIRST_USED, Context.MODE_PRIVATE);
            return preferences.getBoolean(Contants.PREFERENCE_FLAG_USED,true);

        }
}
