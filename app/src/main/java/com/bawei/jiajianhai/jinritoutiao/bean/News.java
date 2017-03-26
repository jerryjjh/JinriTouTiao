package com.bawei.jiajianhai.jinritoutiao.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/24
 */

public class News {
    /**
     * int _id = cur.getInt(0);
     * int type = cur.getInt(1);
     * String url = cur.getString(2);
     * String title = cur.getString(3);
     * String time = cur.getString(4);
     * String from = cur.getString(5);
     * String image1 = cur.getString(6);
     * String image2 = cur.getString(7);
     * String image3 = cur.getString(8);
     */
    private int _id;
    private int type;
    private String url;
    private String title;
    private String time;
    private String from;
    private String image1;
    private String image2;
    private String image3;

    public News(int _id, int type, String url, String title, String time, String from, String image1, String image2, String image3) {
        this._id = _id;
        this.type = type;
        this.url = url;
        this.title = title;
        this.time = time;
        this.from = from;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }



    public News(int _id, String title) {
        this._id = _id;
        this.title = title;
    }

  /*  public News(int _id, String title, String time, String url, String from, String image1, String image2, String image3) {
        this._id = _id;
        this.title = title;
        this.time = time;
        this.url = url;
        this.from = from;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }*/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

/*    public News(int _id, String title, String time, String from, String image1, String image2, String image3) {
        this._id = _id;
        this.title = title;
        this.time = time;
        this.from = from;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }*/
}
