package com.bawei.jiajianhai.jinritoutiao.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class VideoDetailInfoBean {
    /**
     * show_pgc_subscribe : 1
     * video_preloading_flag : 0
     * video_third_monitor_url :
     * group_flags : 32832
     * direct_play : 1
     * detail_video_large_image : {"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591","width":580,"url_list":[{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p4.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p.pstatp.com/video1609/1937000d49480bdd8591"}],"uri":"video1609/1937000d49480bdd8591","height":326}
     * video_id : 894c05881447413abff3633061c662ab
     * video_watch_count : 692873
     * video_type : 0
     * video_watching_count : 0
     */

    private int show_pgc_subscribe;
    private int video_preloading_flag;
    private String video_third_monitor_url;
    private int group_flags;
    private int direct_play;
    private DetailVideoLargeImageBean detail_video_large_image;
    private String video_id;
    private int video_watch_count;
    private int video_type;
    private int video_watching_count;

    public int getShow_pgc_subscribe() {
        return show_pgc_subscribe;
    }

    public void setShow_pgc_subscribe(int show_pgc_subscribe) {
        this.show_pgc_subscribe = show_pgc_subscribe;
    }

    public int getVideo_preloading_flag() {
        return video_preloading_flag;
    }

    public void setVideo_preloading_flag(int video_preloading_flag) {
        this.video_preloading_flag = video_preloading_flag;
    }

    public String getVideo_third_monitor_url() {
        return video_third_monitor_url;
    }

    public void setVideo_third_monitor_url(String video_third_monitor_url) {
        this.video_third_monitor_url = video_third_monitor_url;
    }

    public int getGroup_flags() {
        return group_flags;
    }

    public void setGroup_flags(int group_flags) {
        this.group_flags = group_flags;
    }

    public int getDirect_play() {
        return direct_play;
    }

    public void setDirect_play(int direct_play) {
        this.direct_play = direct_play;
    }

    public DetailVideoLargeImageBean getDetail_video_large_image() {
        return detail_video_large_image;
    }

    public void setDetail_video_large_image(DetailVideoLargeImageBean detail_video_large_image) {
        this.detail_video_large_image = detail_video_large_image;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public int getVideo_watch_count() {
        return video_watch_count;
    }

    public void setVideo_watch_count(int video_watch_count) {
        this.video_watch_count = video_watch_count;
    }

    public int getVideo_type() {
        return video_type;
    }

    public void setVideo_type(int video_type) {
        this.video_type = video_type;
    }

    public int getVideo_watching_count() {
        return video_watching_count;
    }

    public void setVideo_watching_count(int video_watching_count) {
        this.video_watching_count = video_watching_count;
    }
}
