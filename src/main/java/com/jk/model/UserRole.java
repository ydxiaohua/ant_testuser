package com.jk.model;

import java.io.Serializable;

/**
 * Created by 世龙同学 on 2018/5/16.
 */
public class UserRole implements Serializable{
    private static final long serialVersionUID = 3903450423650632244L;

    private Integer urid;
    private Integer userid;
    private Integer roleid;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }



    @Override
    public String toString() {
        return "UserRole{" +
                "urid=" + urid +
                ", userid=" + userid +
                ", roleid=" + roleid +
                '}';
    }
}
