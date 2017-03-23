package com.bawei.jiajianhai.jinritoutiao.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class ActionListBean {
    /**
     * action : 1
     * extra : {}
     * desc :
     */

    private int action;
    private ExtraBean extra;
    private String desc;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
