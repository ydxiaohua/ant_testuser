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

    private   String   ztid;

    private String xinuserpass;

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

    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }

    public String getXinuserpass() {
        return xinuserpass;
    }

    public void setXinuserpass(String xinuserpass) {
        this.xinuserpass = xinuserpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", ztid='" + ztid + '\'' +
                ", xinuserpass='" + xinuserpass + '\'' +
                '}';
    }
}
