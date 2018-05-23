package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by ASUS on 2018/5/15.
 */
public class Registrationcentre implements Serializable {
    private static final long serialVersionUID = 7306508843024901955L;

    @Id
    private Integer baouserid;
    private String baousername;
    private Integer baousersex;
    private String baouserphone;
    private String baouserqq;
    private String baouserweixin;
    private String baousermaxxl;
    private String baousergraduatedate;
    private Integer presentpay;
    private String presentstatus;
    private Integer yncontcat;

    public Integer getBaouserid() {
        return baouserid;
    }

    public void setBaouserid(Integer baouserid) {
        this.baouserid = baouserid;
    }

    public String getBaousername() {
        return baousername;
    }

    public void setBaousername(String baousername) {
        this.baousername = baousername;
    }

    public Integer getBaousersex() {
        return baousersex;
    }

    public void setBaousersex(Integer baousersex) {
        this.baousersex = baousersex;
    }

    public String getBaouserphone() {
        return baouserphone;
    }

    public void setBaouserphone(String baouserphone) {
        this.baouserphone = baouserphone;
    }

    public String getBaouserqq() {
        return baouserqq;
    }

    public void setBaouserqq(String baouserqq) {
        this.baouserqq = baouserqq;
    }

    public String getBaouserweixin() {
        return baouserweixin;
    }

    public void setBaouserweixin(String baouserweixin) {
        this.baouserweixin = baouserweixin;
    }

    public String getBaousermaxxl() {
        return baousermaxxl;
    }

    public void setBaousermaxxl(String baousermaxxl) {
        this.baousermaxxl = baousermaxxl;
    }

    public String getBaousergraduatedate() {
        return baousergraduatedate;
    }

    public void setBaousergraduatedate(String baousergraduatedate) {
        this.baousergraduatedate = baousergraduatedate;
    }

    public Integer getPresentpay() {
        return presentpay;
    }

    public void setPresentpay(Integer presentpay) {
        this.presentpay = presentpay;
    }

    public String getPresentstatus() {
        return presentstatus;
    }

    public void setPresentstatus(String presentstatus) {
        this.presentstatus = presentstatus;
    }

    public Integer getYncontcat() {
        return yncontcat;
    }

    public void setYncontcat(Integer yncontcat) {
        this.yncontcat = yncontcat;
    }

    @Override
    public String toString() {
        return "Registrationcentre{" +
                "baouserid=" + baouserid +
                ", baousername='" + baousername + '\'' +
                ", baousersex=" + baousersex +
                ", baouserphone='" + baouserphone + '\'' +
                ", baouserqq='" + baouserqq + '\'' +
                ", baouserweixin='" + baouserweixin + '\'' +
                ", baousermaxxl='" + baousermaxxl + '\'' +
                ", baousergraduatedate='" + baousergraduatedate + '\'' +
                ", presentpay=" + presentpay +
                ", presentstatus='" + presentstatus + '\'' +
                ", yncontcat=" + yncontcat +
                '}';
    }
}
