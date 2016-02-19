package com.thebest.thebest.find.ui;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.thebest.thebest.R;
import com.thebest.thebest.find.bestFriend.ui.BestFriendFragment;
import com.thebest.thebest.find.choiceness.ui.ChoicenessFragment;
import com.thebest.thebest.find.collection.ui.CollectionFragment;
import com.thebest.thebest.find.lastest.ui.LastestFragment;
import com.thebest.thebest.find.ranking.ui.RankingFragment;
import com.thebest.thebest.other.adapter.HomeFragmentPagerAdapter;
import com.thebest.thebest.other.ui.BaseFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yang
 * on 2016/2/16.
 */
public class FindFragment extends BaseFragment
{
    private ViewPager viewPager;

    private TabLayout tabLayout;

    private String[] titleStr = {"精选", "最新", "合辑", "美友", "排行"};

    @Override
    protected int getLayout()
    {
        return R.layout.fragment_find;
    }

    @Override
    protected void initViews()
    {
        viewPager = (ViewPager) root.findViewById(R.id.find_content);

        tabLayout = (TabLayout) root.findViewById(R.id.find_tab);
    }

    @Override
    protected void initEvents()
    {
        //配置tab
        setTab();
    }

    @Override
    protected void initData()
    {

    }

    private void setTab()
    {
        //标题名字
        List<String> titles = Arrays.asList(titleStr);

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new ChoicenessFragment());
        fragments.add(new LastestFragment());
        fragments.add(new CollectionFragment());
        fragments.add(new BestFriendFragment());
        fragments.add(new RankingFragment());

        //设置tab模式
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        for(int i = 0; i < titles.size(); i++)
        {
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }

        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getActivity().getSupportFragmentManager(),
                fragments,
                titles);

        viewPager.setAdapter(adapter);

        //tab关联viewpager
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabsFromPagerAdapter(adapter);
    }

//    public static FindFragment newInstance
}
