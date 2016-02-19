package com.thebest.thebest.other.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.thebest.thebest.R;
import com.thebest.thebest.other.adapter.GuideFragmentAdapter;
import com.thebest.thebest.other.guidefragment.DayBeautyFragment;
import com.thebest.thebest.other.guidefragment.FindApplicationFragment;
import com.thebest.thebest.other.guidefragment.TakeBeautifulFragment;
import com.thebest.thebest.other.utils.Contants;
import com.thebest.thebest.other.utils.JumpManger;

import java.util.ArrayList;
import java.util.List;

/** 这是引导页
 * Created by mao on 2016/2/15.
 */
public class GuideActivity extends FragmentActivity {
    private ViewPager viewPager;
    private Button jumpBtn;
    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        viewPager = (ViewPager) findViewById(R.id.guide_vp);
        jumpBtn = (Button) findViewById(R.id.guide_jump_btn);

        List<Fragment> list = new ArrayList<>();

        fragments = new Fragment[]{
                new DayBeautyFragment(),
                new FindApplicationFragment(),
                new TakeBeautifulFragment()
    };

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (int i = 0; i < fragments.length; i++) {
            list.add(fragments[i]);
        }
        fragmentTransaction.commit();

        GuideFragmentAdapter adapter = new GuideFragmentAdapter(fragmentManager,list);
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            /**
             *
             * @param position
             */
            @Override
            public void onPageSelected(int position) {
                //当显示到最后一页时将jump按钮现实出来
                if (position == fragments.length - 1) {
                    jumpBtn.setVisibility(View.VISIBLE);
                } else {
                    jumpBtn.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //点击跳转进入主页面，  并设置标识   使用sharePreference
        jumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取指定的sharedPreference
                SharedPreferences preferences = getSharedPreferences(Contants.PREFERENCE_FIRST_USED, Context.MODE_PRIVATE);

                //获取编辑器
                SharedPreferences.Editor editor = preferences.edit();
                //添加一个标识第一次使用状态结束的标志
                editor.putBoolean(Contants.PREFERENCE_FLAG_USED,false);
                //  提交   此操作为必须
                editor.commit();

                //跳转到主角面
                JumpManger.jumpToHome(GuideActivity.this);
                finish();
            }
        });
    }
}
