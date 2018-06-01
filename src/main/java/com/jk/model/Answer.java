package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Answer implements Serializable{
    private static final long serialVersionUID = 310032658883345013L;
    @Id
    private   Integer   resultid;
    private   Integer   questionid;
    private   String    resultcontent;
    private   Integer   userid;
    private   String    resultdate;
    private   String    beizancode;
    private   String    questionname;
    private   String    peoplename;
    private   Integer    zannum;
    private   Integer    peopleid;
    private   Integer    num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public Integer getZannum() {
        return zannum;
    }

    public void setZannum(Integer zannum) {
        this.zannum = zannum;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    public String getPeoplename() {
        return peoplename;
    }

    public void setPeoplename(String peoplename) {
        this.peoplename = peoplename;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getResultcontent() {
        return resultcontent;
    }

    public void setResultcontent(String resultcontent) {
        this.resultcontent = resultcontent;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getResultdate() {
        return resultdate;
    }

    public void setResultdate(String resultdate) {
        this.resultdate = resultdate;
    }

    public String getBeizancode() {
        return beizancode;
    }

    public void setBeizancode(String beizancode) {
        this.beizancode = beizancode;
    }


    @Override
    public String toString() {
        return "Answer{" +
                "resultid=" + resultid +
                ", questionid=" + questionid +
                ", resultcontent='" + resultcontent + '\'' +
                ", userid=" + userid +
                ", resultdate='" + resultdate + '\'' +
                ", beizancode='" + beizancode + '\'' +
                '}';
    }
}
