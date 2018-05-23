package com.jk.model;

import java.io.Serializable;

/**
 * Created by wfyf.zx1520 on 2018/5/23.
 */
public class Video implements Serializable {


    private static final long serialVersionUID = -282752462148162339L;
    private  Integer  vid;
    private  String   vname;
    private  Integer  courseid;
    private  Integer dgid;
    private  String  vdate;
    private  Integer userid;

    // 业务字段
    private String  dgname;
    private String  username;
    private String  coursename;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDgname() {
        return dgname;
    }

    public void setDgname(String dgname) {
        this.dgname = dgname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getDgid() {
        return dgid;
    }

    public void setDgid(Integer dgid) {
        this.dgid = dgid;
    }

    public String getVdate() {
        return vdate;
    }

    public void setVdate(String vdate) {
        this.vdate = vdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Video{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                ", courseid=" + courseid +
                ", dgid=" + dgid +
                ", vdate='" + vdate + '\'' +
                ", userid=" + userid +
                '}';
    }
}
