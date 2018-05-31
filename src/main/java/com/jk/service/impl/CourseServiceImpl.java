package com.jk.service.impl;

import com.jk.dao.CourseDao;
import com.jk.model.*;
import com.jk.model.Class;
import com.jk.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wfyf.zx1520 on 2018/5/15.
 */
@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseDao courseDao;


    @Override
    public List<Teacher> queryteacher() {
        return courseDao.queryteacher();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        courseDao.addTeacher(teacher);
    }

    @Override
    public void deleteteacher(String teacherid) {
        courseDao.deleteteacher(teacherid);
    }

    @Override
    public Teacher queryteacherid(String teacherid) {
        return courseDao.queryteacherid(teacherid);
    }

    @Override
    public void updateteacher(Teacher teacher) {
         courseDao.updateteacher(teacher);
    }

    @Override
    public List<Teacher> querydagang() {
        return courseDao.querydagang();
    }

    @Override
    public void adddagang(DaGang dagang) {
        courseDao.adddagang(dagang);
    }

    @Override
    public void deletedagang(String dgid) {
        courseDao.deletedagang(dgid);
    }

    @Override
    public DaGang querydgid(String dgid) {
        return courseDao.querydgid(dgid);
    }

    @Override
    public void updatedagang(DaGang dagang) {
        courseDao.updatedagang(dagang);
    }

    @Override
    public List<Course> querycourse(String coursename,String classid,String minprice,String maxprice,String ynvip) {
        return courseDao.querycourse(coursename,classid,minprice,maxprice,ynvip);
    }

    @Override
    public List<Class> queryclass() {
        return courseDao.queryclass();
    }

    @Override
    public void addcourse(Course course) {
        courseDao.addcourse(course);
    }

    @Override
    public void deletecourse(String courseid) {
        courseDao.deletecourse(courseid);
    }

    @Override
    public Course querycourseid(String courseid) {
        return courseDao.querycourseid(courseid);
    }

    @Override
    public void updatecourse(Course course) {
        courseDao.updatecourse(course);
    }

    @Override
    public void updatetuig(String courseid) {
        courseDao.updatetuig(courseid);
    }

    @Override
    public List<Video> queryvideo() {
        return courseDao.queryvideo();
    }

    @Override
    public List<Teacher> queryshenhe() {
        return courseDao.queryshenhe();
    }

    @Override
    public void updatetongguo(String teacherid) {
        courseDao.updatetongguo(teacherid);
    }

    @Override
    public List<Teacher> queryshenheteacherid(String teacherid) {
        return courseDao.queryshenheteacherid(teacherid);
    }

    @Override
    public void addvideo(Video video) {
        courseDao.addvideo(video);
    }

    @Override
    public List<Course> queryteachertj(String teacherid) {
        return courseDao.queryteachertj(teacherid);
    }

    @Override
    public List<Course> querybanxing(String classid) {
        return courseDao.querybanxing(classid);
    }

    @Override
    public List<Course> mianfei() {
        return courseDao.mianfei();
    }

    @Override
    public List<Course> huiyuan() {
        return courseDao.huiyuan();
    }

    @Override
    public List<Course> querycoursezuixing() {
        return courseDao.querycoursezuixing();
    }

    @Override
    public List<Course> querycourseguanzhudu() {
        return courseDao.querycourseguanzhudu();
    }


}
