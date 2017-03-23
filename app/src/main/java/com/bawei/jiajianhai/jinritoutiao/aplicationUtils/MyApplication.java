package com.bawei.jiajianhai.jinritoutiao.aplicationUtils;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

import org.xutils.x;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/17
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
        imageDisplay();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }

    private void imageDisplay() {
        ImageLoaderConfiguration configuration=new ImageLoaderConfiguration
                .Builder(getApplicationContext())
                .memoryCacheExtraOptions(480,800)
                .build();

        ImageLoader.getInstance().init(configuration);
    }

    {

        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    }
}
