package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class People implements Serializable {

    private static final long serialVersionUID = 6286034585767231268L;
    @Id
    private   Integer  peopleid;
    private   String   email;
    private   String   phone;
    private   String   peoplepass;
    private   Integer  ynvip;
    private   String   vipenddate;
    private   String   peoplename;
    private   String   peoplenickname;
    private   Integer  peoplesex;
    private   Integer  peopleage;

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPeoplepass() {
        return peoplepass;
    }

    public void setPeoplepass(String peoplepass) {
        this.peoplepass = peoplepass;
    }

    public Integer getYnvip() {
        return ynvip;
    }

    public void setYnvip(Integer ynvip) {
        this.ynvip = ynvip;
    }

    public String getVipenddate() {
        return vipenddate;
    }

    public void setVipenddate(String vipenddate) {
        this.vipenddate = vipenddate;
    }

    public String getPeoplename() {
        return peoplename;
    }

    public void setPeoplename(String peoplename) {
        this.peoplename = peoplename;
    }

    public String getPeoplenickname() {
        return peoplenickname;
    }

    public void setPeoplenickname(String peoplenickname) {
        this.peoplenickname = peoplenickname;
    }

    public Integer getPeoplesex() {
        return peoplesex;
    }

    public void setPeoplesex(Integer peoplesex) {
        this.peoplesex = peoplesex;
    }

    public Integer getPeopleage() {
        return peopleage;
    }

    public void setPeopleage(Integer peopleage) {
        this.peopleage = peopleage;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleid=" + peopleid +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", peoplepass='" + peoplepass + '\'' +
                ", ynvip=" + ynvip +
                ", vipenddate='" + vipenddate + '\'' +
                ", peoplename='" + peoplename + '\'' +
                ", peoplenickname='" + peoplenickname + '\'' +
                ", peoplesex=" + peoplesex +
                ", peopleage=" + peopleage +
                '}';
    }
}
