package com.jk.model;

import java.io.Serializable;

public class Comment implements Serializable {
    private static final long serialVersionUID = -8003500683852308690L;

    private Integer  comid;
    private String   comcontent;
    private String   comdate;
    private Integer  comcode;
    private Integer  courseid;
    private Integer  peopleid;


    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    public String getComdate() {
        return comdate;
    }

    public void setComdate(String comdate) {
        this.comdate = comdate;
    }

    public Integer getComcode() {
        return comcode;
    }

    public void setComcode(Integer comcode) {
        this.comcode = comcode;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comid=" + comid +
                ", comcontent='" + comcontent + '\'' +
                ", comdate='" + comdate + '\'' +
                ", comcode=" + comcode +
                ", courseid=" + courseid +
                ", peopleid=" + peopleid +
                '}';
    }
}
