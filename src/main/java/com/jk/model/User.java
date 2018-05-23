package com.jk.model;

import java.io.Serializable;


/**
 *
 */
public class User implements Serializable{


    private static final long serialVersionUID = -2041355668909509945L;

    private   Integer  userid;

    private   String   username;

    private   String   usertime;

    private   String   userage;

    private   String   usersex;

    private   String   userpass;

    private String ztid;



    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsertime() {
        return usertime;
    }

    public void setUsertime(String usertime) {
        this.usertime = usertime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usertime='" + usertime + '\'' +
                ", userage='" + userage + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userpass='" + userpass + '\'' +
                ", ztid=" + ztid +
                '}';
    }
}



