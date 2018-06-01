package com.jk.model;

import java.io.Serializable;

/**
 * Created by wfyf.zx1520 on 2018/5/16.
 */
public class DaGang implements Serializable{

    private static final long serialVersionUID = 7735721794784739544L;
    private int  dgid;
    private String  dgname;
    private String  pdate;
    private int  uid;
    private int  ynvip;
    private String  xiaojie;
    private  int   courseid;

    //业务字段

    private  String  username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDgid() {
        return dgid;
    }

    public void setDgid(int dgid) {
        this.dgid = dgid;
    }

    public String getDgname() {
        return dgname;
    }

    public void setDgname(String dgname) {
        this.dgname = dgname;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getYnvip() {
        return ynvip;
    }

    public void setYnvip(int ynvip) {
        this.ynvip = ynvip;
    }

    public String getXiaojie() {
        return xiaojie;
    }

    public void setXiaojie(String xiaojie) {
        this.xiaojie = xiaojie;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "DaGang{" +
                "dgid=" + dgid +
                ", dgname='" + dgname + '\'' +
                ", pdate='" + pdate + '\'' +
                ", uid=" + uid +
                ", ynvip=" + ynvip +
                ", xiaojie='" + xiaojie + '\'' +
                ", courseid=" + courseid +

                '}';
    }
}
