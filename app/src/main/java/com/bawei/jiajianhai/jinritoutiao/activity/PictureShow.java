package com.bawei.jiajianhai.jinritoutiao.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.utils.ImageUtils;
import com.handmark.view.photoview.PhotoView;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/25
 */

public class PictureShow extends Activity {

    private ViewPager vp;

    private ArrayList<String> list_pic=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_layout);
        ImageView fanhui = (ImageView) findViewById(R.id.pictureshow_fanhui);
        fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent=getIntent();
        int child = intent.getIntExtra("child", 0);

        list_pic = intent.getStringArrayListExtra("list");
        vp = (ViewPager) findViewById(R.id.pictureshow_viewpager);

        vp.setAdapter(new VpAdapter());
        vp.setCurrentItem(child);
    }

    class  VpAdapter extends PagerAdapter{


        @Override
        public int getCount() {

            return list_pic.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            PhotoView photoView = new PhotoView(PictureShow.this);
            ImageLoader.getInstance().displayImage(list_pic.get(position),photoView, ImageUtils.displayImageOptions(R.mipmap.ic_launcher));
            container.addView(photoView);
            return photoView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
           // super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }
}
