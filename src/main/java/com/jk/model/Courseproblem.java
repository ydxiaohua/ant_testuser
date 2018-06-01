package com.jk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document(collection="wen")
public class Courseproblem implements Serializable{

    private static final long serialVersionUID = 8804767163587112224L;
    @Id
    private   Integer  questionid;
    private   Integer  peopleid;
    private   String   questiontypeid;
    private   String   questioncontent;
    private   String   questionname;
    private   String   questiondate;
    private   Integer  looknum;

    private   String   peoplename;
    private   String   quetypename;
    private   Integer  typeid;
    private   Integer  huidashu;


    public Integer getLooknum() {
        return looknum;
    }

    public void setLooknum(Integer looknum) {
        this.looknum = looknum;
    }

    public Integer getHuidashu() {
        return huidashu;
    }

    public void setHuidashu(Integer huidashu) {
        this.huidashu = huidashu;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
    public String getPeoplename() {
        return peoplename;
    }

    public void setPeoplename(String peoplename) {
        this.peoplename = peoplename;
    }

    public String getQuetypename() {
        return quetypename;
    }

    public void setQuetypename(String quetypename) {
        this.quetypename = quetypename;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public String getQuestiontypeid() {
        return questiontypeid;
    }

    public void setQuestiontypeid(String questiontypeid) {
        this.questiontypeid = questiontypeid;
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    public String getQuestiondate() {
        return questiondate;
    }

    public void setQuestiondate(String questiondate) {
        this.questiondate = questiondate;
    }


    @Override
    public String toString() {
        return "Courseproblem{" +
                "questionid=" + questionid +
                ", peopleid=" + peopleid +
                ", questiontypeid=" + questiontypeid +
                ", questioncontent='" + questioncontent + '\'' +
                ", questionname='" + questionname + '\'' +
                ", questiondate='" + questiondate + '\'' +
                '}';
    }
}
