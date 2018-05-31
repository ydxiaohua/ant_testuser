package com.jk.service;

import com.jk.model.*;
import com.jk.model.Class;

import java.util.List;



public interface CourseService {


    List<Teacher> queryteacher();
    void addTeacher(Teacher teacher);
    void deleteteacher(String teacherid);
    Teacher queryteacherid(String teacherid);
    void updateteacher(Teacher teacher);


    List<Teacher> querydagang();
    void adddagang(DaGang dagang);
    void deletedagang(String dgid);
    DaGang querydgid(String dgid);
    void updatedagang(DaGang dagang);



    List<Course> querycourse(String coursename,String classid,String minprice,String maxprice,String ynvip);
    List<Class> queryclass();
    void addcourse(Course course);
    void deletecourse(String courseid);
    Course querycourseid(String courseid);
    void updatecourse(Course course);
    void updatetuig(String courseid);



    List<Video> queryvideo();
    List<Teacher> queryshenhe();
    void updatetongguo(String teacherid);
    List<Teacher> queryshenheteacherid(String teacherid);
    void addvideo(Video video);


    List<Course> queryteachertj(String teacherid);
    List<Course> querybanxing(String classid);
    List<Course> mianfei();
    List<Course> huiyuan();
    List<Course> querycoursezuixing();
    List<Course> querycourseguanzhudu();
}
