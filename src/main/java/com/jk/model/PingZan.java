package com.jk.model;

import java.io.Serializable;

/**
 * Created by 世龙同学 on 2018/5/29.
 */
public class PingZan implements Serializable{

    private Integer pzid;
    private Integer comid;
    private Integer peopleid;


    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public Integer getPzid() {
        return pzid;
    }

    public void setPzid(Integer pzid) {
        this.pzid = pzid;
    }

    @Override
    public String toString() {
        return "PingZan{" +
                "pzid=" + pzid +
                ", comid=" + comid +
                ", peopleid=" + peopleid +
                '}';
    }
}
