package com.bawei.jiajianhai.jinritoutiao.bean;

import java.util.List;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class DetailVideoLargeImageBean {
    /**
     * url : http://p2.pstatp.com/video1609/1937000d49480bdd8591
     * width : 580
     * url_list : [{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p4.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p.pstatp.com/video1609/1937000d49480bdd8591"}]
     * uri : video1609/1937000d49480bdd8591
     * height : 326
     */

    private String url;
    private int width;
    private String uri;
    private int height;
    private List<DataBean> url_list;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<DataBean> getUrl_list() {
        return url_list;
    }

    public void setUrl_list(List<DataBean> url_list) {
        this.url_list = url_list;
    }
}
