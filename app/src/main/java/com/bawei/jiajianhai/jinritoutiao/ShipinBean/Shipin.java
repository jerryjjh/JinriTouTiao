package com.bawei.jiajianhai.jinritoutiao.ShipinBean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/23
 */
public class Shipin {
    private String cover;
    private String title;
    private String mp4Hd_url;

    public Shipin(String cover, String title, String mp4Hd_url) {
        this.cover = cover;
        this.title = title;
        this.mp4Hd_url = mp4Hd_url;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMp4Hd_url() {
        return mp4Hd_url;
    }

    public void setMp4Hd_url(String mp4Hd_url) {
        this.mp4Hd_url = mp4Hd_url;
    }
}
