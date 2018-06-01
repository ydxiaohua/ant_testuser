package com.jk.dao;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KcmDao {

    List listuser();

    List<User> loginUser(@Param("username") String username);

    List<Quan> queryTreeByPid(@Param("shu") String shu, @Param("userid") Integer userid);

    List<Courseproblem> queryWenList();

    void addWenti(Courseproblem courseproblem);

    List<ProblemType> queryWenType();

    Courseproblem huixianwen(Integer wenid);

    void updatewen(Courseproblem courseproblem);

    void deletewen(Integer id);

    List<Answer> querydaanList();

    void addWentype(ProblemType problemType);

    ProblemType huixianwentype(Integer id);

    void updatewentype(ProblemType problemType);

    void deletewentype(Integer id);

    void adddaan(Answer answer);

    void deletedaan(Integer id);

    Answer huixiandaan(Integer id);

    void updatedaan(Answer answer);

    List<Courseproblem> querypagewen();

    Integer querywenbyid(Integer questionid);

    void updatenum(@Param("questionid") Integer questionid, @Param("num") Integer num);

    Courseproblem tohuifu(Integer questionid);


    List queryhuifu(Integer questionid);

    List<Courseproblem> querywenshow();

    List<Courseproblem> querywenshow1(Integer typeid);


    Integer queryzanbyid(Integer resultid);

    List<Courseproblem> querybywenid(@Param("questionid") Integer questionid);


    void updatezan2(Zan zan);

    List<Zan> ifclick(@Param("peopleid") Integer peopleid, @Param("resultid") Integer resultid);

    List<Courseproblem> querynew();

    List<Courseproblem> queryhot();

    void updatezan1(@Param("peopleid") Integer peopleid, @Param("resultid") Integer resultid);

    void updatezan3(@Param("peopleid") Integer peopleid, @Param("resultid") Integer resultid);

    void addZan(Zan zan);


    List<Courseproblem> querytiwen(Integer peopleid);

    List<Courseproblem> querymyhuida(Integer peopleid);
}
