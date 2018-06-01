package com.jk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "UserLo")
public class User implements Serializable{

    private static final long serialVersionUID = -7567065163375619856L;
    @Id
    private   Integer  userid;

    private   String   username;

    private   String   userpass;

    private   String   usersex;

    private   String   usertime;

    private   String   userage;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUsertime() {
        return usertime;
    }

    public void setUsertime(String usertime) {
        this.usertime = usertime;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", usersex='" + usersex + '\'' +
                ", usertime='" + usertime + '\'' +
                ", userage='" + userage + '\'' +
                '}';
    }
}
