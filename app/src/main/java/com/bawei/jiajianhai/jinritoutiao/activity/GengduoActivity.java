package com.bawei.jiajianhai.jinritoutiao.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.fragment.Fragmeng_shipin;

import java.util.ArrayList;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/22
 */
public class GengduoActivity extends FragmentActivity {
    private String[] titles = new String[]{"热点视频", "娱乐视频", "搞笑视频", "精品视频"};
    private String[] names = new String[]{"V9LG4B3A0", "V9LG4CHOR", "V9LG4E6VR", "00850FRB"};

    private String[] urls = new String[]{"http://c.3g.163.com/nc/video/list/V9LG4B3A0/n/10-10.html",
            "http://c.3g.163.com/nc/video/list/V9LG4CHOR/n/10-10.html",
            "http://c.3g.163.com/nc/video/list/V9LG4E6VR/n/10-10.html",
            "http://c.3g.163.com/nc/video/list/00850FRB/n/10-10.html"};
    private TabLayout tabLayout;
    private ViewPager vp;
    private ArrayList<Fragment> list_f = new ArrayList<>();
    private Fragmeng_shipin shipin_fragment;
    private int theme = R.style.AppTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int theme = intent.getIntExtra("theme", this.theme);
        setTheme(theme);
        setContentView(R.layout.gengduo_layout);

        initview();
        initdata();
    }

    private void initdata() {

        for (int i = 0; i < titles.length; i++) {
            Bundle bundle = new Bundle();
            bundle.putString("key", urls[i]);
            bundle.putString("name", names[i]);
            shipin_fragment = new Fragmeng_shipin();
            tabLayout.addTab(tabLayout.newTab().setText(titles[i]));
            shipin_fragment.setArguments(bundle);
            list_f.add(shipin_fragment);
        }
        tabLayout.setupWithViewPager(vp);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        tabLayout.setTabsFromPagerAdapter(adapter);
        vp.setAdapter(adapter);
    }

    private void initview() {
      /*  Button xiala = (Button) findViewById(R.id.buttonP);
        xiala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        vp = (ViewPager) findViewById(R.id.gengduo_viewpager_vp);
        tabLayout = (TabLayout) findViewById(R.id.gengduo_tab_dinglan);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

    }

    class MyAdapter extends FragmentPagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list_f.get(position);
        }

        @Override
        public int getCount() {
            return list_f.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
