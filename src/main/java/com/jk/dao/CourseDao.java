package com.jk.dao;

import com.jk.model.*;
import com.jk.model.Class;
import org.apache.ibatis.annotations.Param;


import java.util.List;



 


public interface CourseDao {
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

    List<Course> querycourse(@Param("coursename") String coursename, @Param("classid") String classid, @Param("minprice") String minprice, @Param("maxprice") String maxprice, @Param("ynvip") String ynvip);

    List<Class> queryclass();

    void addcourse(Course course);

    void deletecourse(String courseid);

    Course querycourseid(String courseid);

    void updatecourse(Course course);

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

    void updatetuig(String courseid);
}
