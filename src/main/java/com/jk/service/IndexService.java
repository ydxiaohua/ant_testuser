package com.jk.service;

import com.jk.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 世龙同学 on 2018/5/24.
 */
public interface IndexService {

    List<Course> TuiJianCourse();

    List<Course> JingXuanCourse();

    List<Course> NewCourse();

    List<Course> AllCourse();

    List<Img> queryImg();

    void addImg(Img img);

    Course queryCourseAllOrId(Integer courseid);

    void updateLookcode(Integer courseid);

    List<DaGang> queryDagang(Integer courseid);

    Map<String,Object> queryCoursePing(int page, int rows, int courseid);

    void addHuiFuPing(Comment comment);

    PingZan queryNoOrYesPing(Integer comid, Integer peopleid);

    void PingLunDianZan(Integer comid);

    void addPingZan(Integer comid, Integer peopleid);

    Course queryDGinfo(Integer courseid, Integer dgid);

    String queryDgidOrVideo(Integer dgid);

    void deleteImg(Integer imgid);

    Img huixianImg(Integer imgid);

    void updateImg(Img img);

    void ShowLunBoImg(Integer imgid);

    void HideLunBoImg(Integer imgid);

    Integer queryShowImgNum();

    List<Img> queryIndexImg();


}
