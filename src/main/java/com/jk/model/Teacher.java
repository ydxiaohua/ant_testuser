package com.jk.model;

import java.io.Serializable;

/**
 * Created by wfyf.zx1520 on 2018/5/15.
 */
public class  Teacher implements Serializable{

    private static final long serialVersionUID = 6011478099919589796L;
    private  int   teacherid;
    private  String teachername;
    private String  teacherdate;
    private Integer teacherstate;
    private String  teachernote;

    public Integer getTeacherstate() {
        return teacherstate;
    }

    public void setTeacherstate(Integer teacherstate) {
        this.teacherstate = teacherstate;
    }

    public String getTeachernote() {
        return teachernote;
    }

    public void setTeachernote(String teachernote) {
        this.teachernote = teachernote;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeacherdate() {
        return teacherdate;
    }

    public void setTeacherdate(String teacherdate) {
        this.teacherdate = teacherdate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid=" + teacherid +
                ", teachername='" + teachername + '\'' +
                ", teacherdate='" + teacherdate + '\'' +
                ", teacherstate=" + teacherstate +
                ", teachernote='" + teachernote + '\'' +
                '}';
    }
}
