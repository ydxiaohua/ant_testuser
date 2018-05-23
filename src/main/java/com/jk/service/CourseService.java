package com.jk.service;

import com.jk.model.*;
import com.jk.model.Class;

import java.util.List;

/**
 * Created by wfyf.zx1520 on 2018/5/15.
 */
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



    List<Course> querycourse();
    List<Class> queryclass();
    void addcourse(Course course);
    void deletecourse(String courseid);
    Course querycourseid(String courseid);
    void updatecourse(Course course);




    List<Video> queryvideo();
}
