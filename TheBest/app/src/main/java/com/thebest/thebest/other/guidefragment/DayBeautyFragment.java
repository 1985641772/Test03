package com.thebest.thebest.other.guidefragment;

import android.widget.ImageView;

import com.thebest.thebest.R;
import com.thebest.thebest.other.ui.BaseFragment;

/**
 * Created by mao on 2016/2/15.
 */
public class DayBeautyFragment extends BaseFragment {
    private ImageView imageView;
    @Override
    protected int getLayout() {
        return R.layout.fragment_guide_daybeauty;
    }

    @Override
    protected void initViews() {
        imageView = (ImageView) root.findViewById(R.id.guide_day_img);
        imageView.setImageResource(R.drawable.new_graph_nicedaily);



    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {

    }
}
