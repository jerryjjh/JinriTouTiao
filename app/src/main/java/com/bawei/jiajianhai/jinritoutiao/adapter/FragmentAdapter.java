package com.bawei.jiajianhai.jinritoutiao.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bawei.jiajianhai.jinritoutiao.bean.DataBeanX;

import java.util.ArrayList;


/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/18
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    FragmentActivity activity;
    ArrayList<DataBeanX> dataBeen;

    public FragmentAdapter(FragmentManager fm, ArrayList<DataBeanX> dataBeen,FragmentActivity activity) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
