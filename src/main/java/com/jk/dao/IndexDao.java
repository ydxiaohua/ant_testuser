package com.jk.dao;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 世龙同学 on 2018/5/24.
 */
public interface IndexDao {

    List<Course> TuiJianCourse();

    List<Course> JingXuanCourse();

    List<Course> NewCourse();

    List<Course> AllCourse();

    List<Img> queryImg();

    void addImg(Img img);

    Course queryCourseAllOrId(Integer courseid);

    List<DaGang> queryDagang(Integer courseid);

    long queryCoursePingCount(int courseid);

    List<Comment> queryCoursePing(@Param("start") int start,@Param("rows") int rows, @Param("courseid")int courseid);

    void addHuiFuPing(Comment comment);

    void updateLookcode(Integer courseid);

    PingZan queryNoOrYesPing(@Param("comid") Integer comid, @Param("peopleid")Integer peopleid);

    void addPingZan(@Param("comid")Integer comid, @Param("peopleid")Integer peopleid);

    void PingLunDianZan(Integer comid);

    Course queryDGinfo(@Param("courseid")Integer courseid, @Param("dgid")Integer dgid);

    Video queryDgidOrVideo(Integer dgid);

    void deleteImg(Integer imgid);

    Img huixianImg(Integer imgid);

    void updateImg(Img img);

    void ShowLunBoImg(Integer imgid);

    void HideLunBoImg(Integer imgid);

    Integer queryShowImgNum();

    List<Img> queryIndexImg();
}
