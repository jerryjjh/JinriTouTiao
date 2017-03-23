package com.bawei.jiajianhai.jinritoutiao.utils;

import android.media.Image;

import com.nostra13.universalimageloader.core.DisplayImageOptions;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/17
 */

public class ImageUtils  {
    public static DisplayImageOptions displayImageOptions(int ImageId){
        DisplayImageOptions options =new DisplayImageOptions.Builder()
                .showImageForEmptyUri(ImageId)
                .showImageOnLoading(ImageId)
                .showImageOnFail(ImageId)
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .build();


        return options ;
    }
}
