package com.jk.service.impl;

import com.jk.dao.IndexDao;
import com.jk.model.*;
import com.jk.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 世龙同学 on 2018/5/24.
 */
@Service
public class IndexServiceImpl implements IndexService{

    @Autowired
    private IndexDao indexDao;

    @Override
    public List<Course> TuiJianCourse() {

        return indexDao.TuiJianCourse();
    }

    @Override
    public List<Course> JingXuanCourse() {
        return indexDao.JingXuanCourse();
    }

    @Override
    public List<Course> NewCourse() {
        return indexDao.NewCourse();
    }

    @Override
    public List<Course> AllCourse() {
        return indexDao.AllCourse();
    }

    @Override
    public List<Img> queryImg() {
        return indexDao.queryImg();
    }

    @Override
    public void addImg(Img img) {
        indexDao.addImg(img);
    }

    @Override
    public Course queryCourseAllOrId(Integer courseid) {
        return indexDao.queryCourseAllOrId(courseid);
    }

    @Override
    public void updateLookcode(Integer courseid) {
        indexDao.updateLookcode(courseid);
    }

    @Override
    public List<DaGang> queryDagang(Integer courseid) {
        return indexDao.queryDagang(courseid);
    }

    @Override
    public Map<String, Object> queryCoursePing(int page, int rows, int courseid) {
        long tot = indexDao.queryCoursePingCount(courseid);
        List<Comment> uss = indexDao.queryCoursePing((page-1)*rows,rows,courseid);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", tot);
        map.put("rows", uss);
        return map;
    }

    @Override
    public void addHuiFuPing(Comment comment) {
        indexDao.addHuiFuPing(comment);
    }

    @Override
    public PingZan queryNoOrYesPing(Integer comid, Integer peopleid) {
        return indexDao.queryNoOrYesPing(comid,peopleid);
    }

    @Override
    public void PingLunDianZan(Integer comid) {
        indexDao.PingLunDianZan(comid);
    }

    @Override
    public void addPingZan(Integer comid, Integer peopleid) {
        indexDao.addPingZan(comid,peopleid);
    }


}
