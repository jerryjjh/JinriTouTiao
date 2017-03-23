package com.bawei.jiajianhai.jinritoutiao.bean;

import java.util.List;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class ImageListBean {
    private String url;
    private int width;
    private String uri;

    private List<DataBean> url_list;

    public ImageListBean(String url, int width, String uri, List<DataBean> url_list) {
        this.url = url;
        this.width = width;
        this.uri = uri;
        this.url_list = url_list;
    }

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

    public List<DataBean> getUrl_list() {
        return url_list;
    }

    public void setUrl_list(List<DataBean> url_list) {
        this.url_list = url_list;
    }
}
