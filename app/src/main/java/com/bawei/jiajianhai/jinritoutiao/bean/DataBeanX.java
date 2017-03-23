package com.bawei.jiajianhai.jinritoutiao.bean;

import android.widget.ImageButton;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class DataBeanX {
    /**
     * read_count : 1652785
     * video_id : 894c05881447413abff3633061c662ab
     * media_name : 央视新闻
     * ban_comment : 0
     * abstract : 初心·梁家河篇在陕北，他“看到了人民群众的根本，真正理解了老百姓”；在正定，他实现了改善农民生活的承诺；在80年代末的宁德，他说“当官不要想发财”。跟随央视原创微视频，一起追寻习近平总书记的初心。
     * video_detail_info : {"show_pgc_subscribe":1,"video_preloading_flag":0,"video_third_monitor_url":"","group_flags":32832,"direct_play":1,"detail_video_large_image":{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591","width":580,"url_list":[{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p4.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p.pstatp.com/video1609/1937000d49480bdd8591"}],"uri":"video1609/1937000d49480bdd8591","height":326},"video_id":"894c05881447413abff3633061c662ab","video_watch_count":692873,"video_type":0,"video_watching_count":0}
     * image_list : []
     * has_video : true
     * article_type : 0
     * tag : news_politics
     * has_m3u8_video : 0
     * keywords : 微视频,梁家河,习近平总书记
     * video_duration : 410
     * label : 置顶
     * show_portrait_article : false
     * user_verified : 1
     * aggr_type : 1
     * cell_type : 0
     * article_sub_type : 0
     * group_flags : 32832
     * bury_count : 0
     * title : 央视原创系列微视频《初心》追寻习近平总书记的初心 梁家河篇
     * ignore_web_transform : 1
     * source_icon_style : 6
     * tip : 0
     * hot : 0
     * share_url : http://toutiao.com/a6398877569621983490/?iid=3642583580&app=news_article
     * has_mp4_video : 0
     * source : 央视新闻
     * comment_count : 72
     * article_url : http://toutiao.com/group/6398877569621983490/
     * filter_words : []
     * rid : 201703192054181720170750072710FE
     * publish_time : 1489887045
     * action_list : [{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}]
     * has_image : false
     * cell_layout_style : 1
     * tag_id : 6398877569621983490
     * video_style : 0
     * verified_content : 中央电视台新闻中心官方帐号
     * display_url : http://toutiao.com/group/6398877569621983490/
     * is_stick : true
     * large_image_list : [{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591","width":580,"url_list":[{"url":"http://p2.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p4.pstatp.com/video1609/1937000d49480bdd8591"},{"url":"http://p.pstatp.com/video1609/1937000d49480bdd8591"}],"uri":"video1609/1937000d49480bdd8591","height":326}]
     * item_id : 6399015919732916737
     * is_subject : false
     * show_portrait : false
     * repin_count : 15110
     * cell_flag : 11
     * user_info : {"verified_content":"中央电视台新闻中心官方帐号","avatar_url":"http://p3.pstatp.com/thumb/4306/2602403105","user_id":4492956276,"name":"央视新闻","follower_count":0,"follow":false,"user_auth_info":"{\"auth_type\": \"0\", \"auth_info\": \"中央电视台新闻中心官方帐号\"}","user_verified":true,"description":""}
     * source_open_url : sslocal://profile?refer=video&uid=4492956276
     * level : 0
     * like_count : 5478
     * digg_count : 5478
     * behot_time : 1489928058
     * cursor : 1489928058999
     * url : http://toutiao.com/group/6398877569621983490/
     * preload_web : 0
     * user_repin : 0
     * label_style : 6
     * item_version : 0
     * media_info : {"user_id":4492956276,"verified_content":"","avatar_url":"http://p2.pstatp.com/large/4306/2602403105","media_id":4492956276,"name":"央视新闻","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":true}
     * group_id : 6398877569621983490
     * middle_image : {"url":"http://p2.pstatp.com/list/1937000d49480bdd8591","width":480,"url_list":[{"url":"http://p2.pstatp.com/list/1937000d49480bdd8591"},{"url":"http://p4.pstatp.com/list/1937000d49480bdd8591"},{"url":"http://p.pstatp.com/list/1937000d49480bdd8591"}],"uri":"list/1937000d49480bdd8591","height":270}
     * gallary_image_count : 9
     * video_source : ugc_video
     * video_proportion_article : 1.7647058823529411
     * source_desc : 红乞仗va...
     * info_desc : 5回答
     * source_desc_open_url : sslocal://profile?uid=58231056263
     * source_avatar : http://p0.pstatp.com/origin/405001332c12565e073
     */

    private int read_count;
    private String video_id;
    private String media_name;
    private int ban_comment;
    @SerializedName("abstract")
    private String abstractX;
    private VideoDetailInfoBean video_detail_info;
    private boolean has_video;
    private int article_type;
    private String tag;
    private int has_m3u8_video;
    private String keywords;
    private int video_duration;
    private String label;
    private boolean show_portrait_article;
    private int user_verified;
    private int aggr_type;
    private int cell_type;
    private int article_sub_type;
    private int group_flags;
    private int bury_count;
    private String title;
    private int ignore_web_transform;
    private int source_icon_style;
    private int tip;
    private int hot;
    private String share_url;
    private int has_mp4_video;
    private String source;
    private int comment_count;
    private String article_url;
    private String rid;
    private int publish_time;
    private boolean has_image;
    private int cell_layout_style;
    private long tag_id;
    private int video_style;
    private String verified_content;
    private String display_url;
    private boolean is_stick;
    private long item_id;
    private boolean is_subject;
    private boolean show_portrait;
    private int repin_count;
    private int cell_flag;
    private UserInfoBean user_info;
    private String source_open_url;
    private int level;
    private int like_count;
    private int digg_count;
    private int behot_time;
    private long cursor;
    private String url;
    private int preload_web;
    private int user_repin;
    private int label_style;
    private int item_version;
    private MediaInfoBean media_info;
    private long group_id;
    private MiddleImageBean middle_image;
    private int gallary_image_count;
    private String video_source;
    private double video_proportion_article;
    private String source_desc;
    private String info_desc;
    private String source_desc_open_url;
    private String source_avatar;



    private List<ImageListBean> image_list;
    private List<?> filter_words;
    private List<ActionListBean> action_list;
    private List<LargeImageListBean> large_image_list;

    public boolean is_stick() {
        return is_stick;
    }

    public boolean is_subject() {
        return is_subject;
    }

    public void setImage_list(List<ImageListBean> image_list) {
        this.image_list = image_list;
    }
    public int getRead_count() {
        return read_count;
    }

    public void setRead_count(int read_count) {
        this.read_count = read_count;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public int getBan_comment() {
        return ban_comment;
    }

    public void setBan_comment(int ban_comment) {
        this.ban_comment = ban_comment;
    }

    public String getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(String abstractX) {
        this.abstractX = abstractX;
    }

    public VideoDetailInfoBean getVideo_detail_info() {
        return video_detail_info;
    }

    public void setVideo_detail_info(VideoDetailInfoBean video_detail_info) {
        this.video_detail_info = video_detail_info;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public int getArticle_type() {
        return article_type;
    }

    public void setArticle_type(int article_type) {
        this.article_type = article_type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getHas_m3u8_video() {
        return has_m3u8_video;
    }

    public void setHas_m3u8_video(int has_m3u8_video) {
        this.has_m3u8_video = has_m3u8_video;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(int video_duration) {
        this.video_duration = video_duration;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isShow_portrait_article() {
        return show_portrait_article;
    }

    public void setShow_portrait_article(boolean show_portrait_article) {
        this.show_portrait_article = show_portrait_article;
    }

    public int getUser_verified() {
        return user_verified;
    }

    public void setUser_verified(int user_verified) {
        this.user_verified = user_verified;
    }

    public int getAggr_type() {
        return aggr_type;
    }

    public void setAggr_type(int aggr_type) {
        this.aggr_type = aggr_type;
    }

    public int getCell_type() {
        return cell_type;
    }

    public void setCell_type(int cell_type) {
        this.cell_type = cell_type;
    }

    public int getArticle_sub_type() {
        return article_sub_type;
    }

    public void setArticle_sub_type(int article_sub_type) {
        this.article_sub_type = article_sub_type;
    }

    public int getGroup_flags() {
        return group_flags;
    }

    public void setGroup_flags(int group_flags) {
        this.group_flags = group_flags;
    }

    public int getBury_count() {
        return bury_count;
    }

    public void setBury_count(int bury_count) {
        this.bury_count = bury_count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIgnore_web_transform() {
        return ignore_web_transform;
    }

    public void setIgnore_web_transform(int ignore_web_transform) {
        this.ignore_web_transform = ignore_web_transform;
    }

    public int getSource_icon_style() {
        return source_icon_style;
    }

    public void setSource_icon_style(int source_icon_style) {
        this.source_icon_style = source_icon_style;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public int getHas_mp4_video() {
        return has_mp4_video;
    }

    public void setHas_mp4_video(int has_mp4_video) {
        this.has_mp4_video = has_mp4_video;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public int getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(int publish_time) {
        this.publish_time = publish_time;
    }

    public boolean isHas_image() {
        return has_image;
    }

    public void setHas_image(boolean has_image) {
        this.has_image = has_image;
    }

    public int getCell_layout_style() {
        return cell_layout_style;
    }

    public void setCell_layout_style(int cell_layout_style) {
        this.cell_layout_style = cell_layout_style;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    public int getVideo_style() {
        return video_style;
    }

    public void setVideo_style(int video_style) {
        this.video_style = video_style;
    }

    public String getVerified_content() {
        return verified_content;
    }

    public void setVerified_content(String verified_content) {
        this.verified_content = verified_content;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public boolean isIs_stick() {
        return is_stick;
    }

    public void setIs_stick(boolean is_stick) {
        this.is_stick = is_stick;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public boolean isIs_subject() {
        return is_subject;
    }

    public void setIs_subject(boolean is_subject) {
        this.is_subject = is_subject;
    }

    public boolean isShow_portrait() {
        return show_portrait;
    }

    public void setShow_portrait(boolean show_portrait) {
        this.show_portrait = show_portrait;
    }

    public int getRepin_count() {
        return repin_count;
    }

    public void setRepin_count(int repin_count) {
        this.repin_count = repin_count;
    }

    public int getCell_flag() {
        return cell_flag;
    }

    public void setCell_flag(int cell_flag) {
        this.cell_flag = cell_flag;
    }

    public UserInfoBean getUser_info() {
        return user_info;
    }

    public void setUser_info(UserInfoBean user_info) {
        this.user_info = user_info;
    }

    public String getSource_open_url() {
        return source_open_url;
    }

    public void setSource_open_url(String source_open_url) {
        this.source_open_url = source_open_url;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getDigg_count() {
        return digg_count;
    }

    public void setDigg_count(int digg_count) {
        this.digg_count = digg_count;
    }

    public int getBehot_time() {
        return behot_time;
    }

    public void setBehot_time(int behot_time) {
        this.behot_time = behot_time;
    }

    public long getCursor() {
        return cursor;
    }

    public void setCursor(long cursor) {
        this.cursor = cursor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPreload_web() {
        return preload_web;
    }

    public void setPreload_web(int preload_web) {
        this.preload_web = preload_web;
    }

    public int getUser_repin() {
        return user_repin;
    }

    public void setUser_repin(int user_repin) {
        this.user_repin = user_repin;
    }

    public int getLabel_style() {
        return label_style;
    }

    public void setLabel_style(int label_style) {
        this.label_style = label_style;
    }

    public int getItem_version() {
        return item_version;
    }

    public void setItem_version(int item_version) {
        this.item_version = item_version;
    }

    public MediaInfoBean getMedia_info() {
        return media_info;
    }

    public void setMedia_info(MediaInfoBean media_info) {
        this.media_info = media_info;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public MiddleImageBean getMiddle_image() {
        return middle_image;
    }

    public void setMiddle_image(MiddleImageBean middle_image) {
        this.middle_image = middle_image;
    }

    public int getGallary_image_count() {
        return gallary_image_count;
    }

    public void setGallary_image_count(int gallary_image_count) {
        this.gallary_image_count = gallary_image_count;
    }

    public String getVideo_source() {
        return video_source;
    }

    public void setVideo_source(String video_source) {
        this.video_source = video_source;
    }

    public double getVideo_proportion_article() {
        return video_proportion_article;
    }

    public void setVideo_proportion_article(double video_proportion_article) {
        this.video_proportion_article = video_proportion_article;
    }

    public String getSource_desc() {
        return source_desc;
    }

    public void setSource_desc(String source_desc) {
        this.source_desc = source_desc;
    }

    public String getInfo_desc() {
        return info_desc;
    }

    public void setInfo_desc(String info_desc) {
        this.info_desc = info_desc;
    }

    public String getSource_desc_open_url() {
        return source_desc_open_url;
    }

    public void setSource_desc_open_url(String source_desc_open_url) {
        this.source_desc_open_url = source_desc_open_url;
    }

    public String getSource_avatar() {
        return source_avatar;
    }

    public void setSource_avatar(String source_avatar) {
        this.source_avatar = source_avatar;
    }

    public List<ImageListBean> getImage_list() {
        return image_list;
    }



    public List<?> getFilter_words() {
        return filter_words;
    }

    public void setFilter_words(List<?> filter_words) {
        this.filter_words = filter_words;
    }

    public List<ActionListBean> getAction_list() {
        return action_list;
    }

    public void setAction_list(List<ActionListBean> action_list) {
        this.action_list = action_list;
    }

    public List<LargeImageListBean> getLarge_image_list() {
        return large_image_list;
    }

    public void setLarge_image_list(List<LargeImageListBean> large_image_list) {
        this.large_image_list = large_image_list;
    }
}
