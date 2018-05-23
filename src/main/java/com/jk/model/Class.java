package com.jk.model;

import java.io.Serializable;

/**
 * Created by wfyf.zx1520 on 2018/5/18.
 */
public class Class implements Serializable {

    private static final long serialVersionUID = -6311462282818184212L;
    private Integer classid;
    private String  classname;


    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classid=" + classid +
                ", classname='" + classname + '\'' +
                '}';
    }
}
