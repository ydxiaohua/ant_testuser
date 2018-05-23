package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class ProblemType implements Serializable{


    private static final long serialVersionUID = -6846681634658561021L;

    @Id
    private   Integer  questionid;

    private   String   questionname;


    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    @Override
    public String toString() {
        return "ProblemType{" +
                "questionid=" + questionid +
                ", questionname='" + questionname + '\'' +
                '}';
    }
}
