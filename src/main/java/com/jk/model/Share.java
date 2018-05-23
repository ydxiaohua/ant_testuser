package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/15.
 */
public class Share implements Serializable{

    private static final long serialVersionUID = 1551688508284892336L;
    private  Integer  shareid;

    private  Integer userid;

    private  Integer  comid;

    private  String   shareurl;

    private String  presenttime;


    public String getPresenttime() {
        return presenttime;
    }

    public void setPresenttime(String presenttime) {
        this.presenttime = presenttime;
    }
    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public Integer getShareid() {
        return shareid;
    }

    public void setShareid(Integer shareid) {
        this.shareid = shareid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    @Override
    public String toString() {
        return "Share{" +
                "shareid=" + shareid +
                ", userid=" + userid +
                ", comid=" + comid +
                ", shareurl='" + shareurl + '\'' +
                '}';
    }
}
