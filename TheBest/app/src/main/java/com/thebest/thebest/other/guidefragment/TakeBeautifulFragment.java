package com.thebest.thebest.other.guidefragment;

import android.widget.ImageView;

import com.thebest.thebest.R;
import com.thebest.thebest.other.ui.BaseFragment;

/**
 * Created by mao on 2016/2/15.
 */
public class TakeBeautifulFragment extends BaseFragment {
    private ImageView takeImg1,takeImg2,takeImg3,takeImg4,takeImg5,takeImg6,takeImg7,takeImg8,takeImg9,takeImg10;
    @Override
    protected int getLayout() {
        return R.layout.fragment_guide_take;
    }

    @Override
    protected void initViews() {
        takeImg1 = (ImageView) root.findViewById(R.id.guide_beauty_img1);
        takeImg2 = (ImageView) root.findViewById(R.id.guide_beauty_img2);
        takeImg3 = (ImageView) root.findViewById(R.id.guide_beauty_img3);
        takeImg4 = (ImageView) root.findViewById(R.id.guide_beauty_img4);
        takeImg5 = (ImageView) root.findViewById(R.id.guide_beauty_img5);
        takeImg6 = (ImageView) root.findViewById(R.id.guide_beauty_img6);
        takeImg7 = (ImageView) root.findViewById(R.id.guide_beauty_img7);
        takeImg8 = (ImageView) root.findViewById(R.id.guide_beauty_img8);
        takeImg9 = (ImageView) root.findViewById(R.id.guide_beauty_img9);
        takeImg10 = (ImageView) root.findViewById(R.id.guide_beauty_img10);

    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {
        takeImg1.setImageResource(R.drawable.new_graph_flower1);
        takeImg2.setImageResource(R.drawable.new_graph_flower2);
        takeImg3.setImageResource(R.drawable.new_graph_flower3);
        takeImg4.setImageResource(R.drawable.new_graph_flower4);
        takeImg5.setImageResource(R.drawable.new_graph_flower5);
        takeImg6.setImageResource(R.drawable.new_graph_flower6);
        takeImg7.setImageResource(R.drawable.new_graph_flower7);
        takeImg8.setImageResource(R.drawable.new_graph_flower8);
        takeImg9.setImageResource(R.drawable.new_graph_flower9);
        takeImg10.setImageResource(R.drawable.new_graph_flower10);
    }
}
