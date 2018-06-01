package com.jk.model;

import java.io.Serializable;

/**
 * Created by wfyf.zx1520 on 2018/5/16.
 */
public class Course implements Serializable{

    private static final long serialVersionUID = -7721867552181405919L;
     private int courseid;          //主键id

     private int teacherid;         //讲师id

     private String  coursename;    //课程名称

     private int xianprice;         //最新价格

     private int yuanprice;         //原价

     private  String  dazhe;             // 是否打折

     private String  jieshao;       //课程介绍

     private  int  classid;         //班型id

     private int ynvip;             //免费/会员

     private int  coursecode;       //课时数

     private int  downcode;         //下载数量

     private int  lookcode;         //浏览数量

     private String lunbotustate;   //推广状态 前台的轮播图

     private String  tuiguangphoto; //推广图片 oss服务器

    private String  coursedate; //推广图片 oss服务器

     private int  ynjingpin;        //是否精品

    private String showphoto;

    //业务字段
    private String   classname;
    private String  teachername;
    private String videotv;
    private Integer dgid;
    private Integer xiaojie;
    private Integer dgids;


    public String getCoursedate() {
        return coursedate;
    }

    public void setCoursedate(String coursedate) {
        this.coursedate = coursedate;
    }

    public String getShowphoto() {
        return showphoto;
    }

    public void setShowphoto(String showphoto) {
        this.showphoto = showphoto;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getXianprice() {
        return xianprice;
    }

    public void setXianprice(int xianprice) {
        this.xianprice = xianprice;
    }

    public int getYuanprice() {
        return yuanprice;
    }

    public void setYuanprice(int yuanprice) {
        this.yuanprice = yuanprice;
    }

    public String getDazhe() {
        return dazhe;
    }

    public void setDazhe(String dazhe) {
        this.dazhe = dazhe;
    }

    public String getJieshao() {
        return jieshao;
    }

    public void setJieshao(String jieshao) {
        this.jieshao = jieshao;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getYnvip() {
        return ynvip;
    }

    public void setYnvip(int ynvip) {
        this.ynvip = ynvip;
    }

    public int getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(int coursecode) {
        this.coursecode = coursecode;
    }

    public int getDowncode() {
        return downcode;
    }

    public void setDowncode(int downcode) {
        this.downcode = downcode;
    }

    public int getLookcode() {
        return lookcode;
    }

    public void setLookcode(int lookcode) {
        this.lookcode = lookcode;
    }

    public String getLunbotustate() {
        return lunbotustate;
    }

    public void setLunbotustate(String lunbotustate) {
        this.lunbotustate = lunbotustate;
    }

    public String getTuiguangphoto() {
        return tuiguangphoto;
    }

    public void setTuiguangphoto(String tuiguangphoto) {
        this.tuiguangphoto = tuiguangphoto;
    }

    public int getYnjingpin() {
        return ynjingpin;
    }

    public void setYnjingpin(int ynjingpin) {
        this.ynjingpin = ynjingpin;
    }

    public String getVideotv() {
        return videotv;
    }

    public void setVideotv(String videotv) {
        this.videotv = videotv;
    }

    public Integer getDgid() {
        return dgid;
    }

    public void setDgid(Integer dgid) {
        this.dgid = dgid;
    }

    public Integer getXiaojie() {
        return xiaojie;
    }

    public void setXiaojie(Integer xiaojie) {
        this.xiaojie = xiaojie;
    }

    public Integer getDgids() {
        return dgids;
    }

    public void setDgids(Integer dgids) {
        this.dgids = dgids;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", teacherid=" + teacherid +
                ", coursename='" + coursename + '\'' +
                ", xianprice=" + xianprice +
                ", yuanprice=" + yuanprice +
                ", dazhe='" + dazhe + '\'' +
                ", jieshao='" + jieshao + '\'' +
                ", classid=" + classid +
                ", ynvip=" + ynvip +
                ", coursecode=" + coursecode +
                ", downcode=" + downcode +
                ", lookcode=" + lookcode +
                ", lunbotustate='" + lunbotustate + '\'' +
                ", tuiguangphoto='" + tuiguangphoto + '\'' +
                ", coursedate='" + coursedate + '\'' +
                ", ynjingpin=" + ynjingpin +
                ", showphoto='" + showphoto + '\'' +
                ", classname='" + classname + '\'' +
                ", teachername='" + teachername + '\'' +
                ", videotv='" + videotv + '\'' +
                ", dgid=" + dgid +
                ", xiaojie=" + xiaojie +
                ", dgids=" + dgids +
                '}';
    }
}
