package com.bawei.jiajianhai.jinritoutiao.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class MediaInfoBean {
    /**
     * user_id : 4492956276
     * verified_content :
     * avatar_url : http://p2.pstatp.com/large/4306/2602403105
     * media_id : 4492956276
     * name : 央视新闻
     * recommend_type : 0
     * follow : false
     * recommend_reason :
     * is_star_user : false
     * user_verified : true
     */

    private long user_id;
    private String verified_content;
    private String avatar_url;
    private long media_id;
    private String name;
    private int recommend_type;
    private boolean follow;
    private String recommend_reason;
    private boolean is_star_user;
    private boolean user_verified;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getVerified_content() {
        return verified_content;
    }

    public void setVerified_content(String verified_content) {
        this.verified_content = verified_content;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public long getMedia_id() {
        return media_id;
    }

    public void setMedia_id(long media_id) {
        this.media_id = media_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecommend_type() {
        return recommend_type;
    }

    public void setRecommend_type(int recommend_type) {
        this.recommend_type = recommend_type;
    }

    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
    }

    public String getRecommend_reason() {
        return recommend_reason;
    }

    public void setRecommend_reason(String recommend_reason) {
        this.recommend_reason = recommend_reason;
    }

    public boolean isIs_star_user() {
        return is_star_user;
    }

    public void setIs_star_user(boolean is_star_user) {
        this.is_star_user = is_star_user;
    }

    public boolean isUser_verified() {
        return user_verified;
    }

    public void setUser_verified(boolean user_verified) {
        this.user_verified = user_verified;
    }
}
