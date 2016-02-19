package com.thebest.thebest.other.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.thebest.thebest.R;
import com.thebest.thebest.dayBeautiful.ui.DayBeautifulFragment;
import com.thebest.thebest.find.ui.FindFragment;
import com.thebest.thebest.gameRecommend.ui.GameRecommendFragment;
import com.thebest.thebest.sort.ui.SortFragment;

/**
 * Created by yang on 2016/2/15.
 */
public class HomeActivity extends AppCompatActivity
{
    private Toolbar toolbar;

    private DrawerLayout drawerLayout;

    private NavigationView navigationView;

    private int selected;

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //初始化控件
        initView();

        //设置toolbar
        toolbar.setTitle("最美应用");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        //设置toolbar中抽屉的开关
        setToggle();

        //设置menu的监听
        setNavigationItemSelectedListener();
    }

    private void setToggle()
    {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.open,
                R.string.close);

        //初始化
        toggle.syncState();

        drawerLayout.setDrawerListener(toggle);
    }

    private void setNavigationItemSelectedListener()
    {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem item)
            {
                int id = item.getItemId();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();

                switch (id)
                {
                    case R.id.home_menu_find:
                        //判断当前页面是否为所选项，不是的话才new
                        if(selected != R.id.home_menu_find)
                        {
                            fragmentTransaction.replace(R.id.home_content_ll, new FindFragment());
                            fragmentTransaction.commit();
                        }
                        //标记当前选中的项
                        selected = R.id.home_menu_find;
                        break;
                    case R.id.home_menu_dayBest:

                        if(selected != R.id.home_menu_dayBest)
                        {
                            fragmentTransaction.replace(R.id.home_content_ll, new DayBeautifulFragment());
                            fragmentTransaction.commit();
                        }
                        selected = R.id.home_menu_dayBest;
                        break;

                    case R.id.home_menu_sort:

                        if(selected != R.id.home_menu_sort)
                        {
                            fragmentTransaction.replace(R.id.home_content_ll, new SortFragment());
                            fragmentTransaction.commit();
                        }
                        selected = R.id.home_menu_sort;
                        break;

                    case R.id.home_menu_gameRecommend:

                        if(selected != R.id.home_menu_gameRecommend)
                        {
                            fragmentTransaction.replace(R.id.home_content_ll, new GameRecommendFragment());
                            fragmentTransaction.commit();
                        }
                        selected = R.id.home_menu_gameRecommend;
                        break;
                }

                drawerLayout.closeDrawers();

                return false;
            }
        });
    }



    private void initView()
    {
        navigationView = (NavigationView) findViewById(R.id.home_navigationView);

        drawerLayout = (DrawerLayout) findViewById(R.id.home_drawerLayout);

        toolbar = (Toolbar) findViewById(R.id.home_toolbar);
    }
}
