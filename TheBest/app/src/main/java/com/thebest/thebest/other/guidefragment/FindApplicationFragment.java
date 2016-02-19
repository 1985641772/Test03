package com.thebest.thebest.other.guidefragment;

import android.widget.ImageView;

import com.thebest.thebest.R;
import com.thebest.thebest.other.ui.BaseFragment;

/**
 * Created by mao on 2016/2/15.
 */
public class FindApplicationFragment extends BaseFragment {
    private ImageView iconComm,img1,img2,img3,img4,img5,img6,img7;
    @Override
    protected int getLayout() {
        return R.layout.fragment_guide_find;
    }

    @Override
    protected void initViews() {
        iconComm = (ImageView) root.findViewById(R.id.guide_find_iconcomm_img);

        img1 = (ImageView) root.findViewById(R.id.guide_find_img1);
        img2 = (ImageView) root.findViewById(R.id.guide_find_img2);
        img3 = (ImageView) root.findViewById(R.id.guide_find_img3);
        img4 = (ImageView) root.findViewById(R.id.guide_find_img4);
        img5 = (ImageView) root.findViewById(R.id.guide_find_img5);
        img6 = (ImageView) root.findViewById(R.id.guide_find_img6);
        img7 = (ImageView) root.findViewById(R.id.guide_find_img7);

    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {
        iconComm.setImageResource(R.drawable.new_icon_community);
        img1.setImageResource(R.drawable.new_graph_cloud1);
        img2.setImageResource(R.drawable.new_graph_cloud2);
        img3.setImageResource(R.drawable.new_graph_cloud3);
        img4.setImageResource(R.drawable.new_graph_cloud4);
        img5.setImageResource(R.drawable.new_graph_cloud5);
        img6.setImageResource(R.drawable.new_graph_cloud6);
        img7.setImageResource(R.drawable.new_graph_cloud7);

    }
}
