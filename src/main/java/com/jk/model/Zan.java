package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Zan implements Serializable{

    private static final long serialVersionUID = -4589467812360545954L;

    @Id
    private   Integer  zanid;
    private   Integer  resultid;
    private   Integer  zannum;
    private   Integer  peopleid;

    public Integer getZanid() {
        return zanid;
    }

    public void setZanid(Integer zanid) {
        this.zanid = zanid;
    }

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public Integer getZannum() {
        return zannum;
    }

    public void setZannum(Integer zannum) {
        this.zannum = zannum;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    @Override
    public String toString() {
        return "Zan{" +
                "zanid=" + zanid +
                ", resultid=" + resultid +
                ", zannum=" + zannum +
                ", peopleid=" + peopleid +
                '}';
    }
}
