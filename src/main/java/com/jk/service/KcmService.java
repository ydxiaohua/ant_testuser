package com.jk.service;

import com.jk.model.*;

import java.util.List;
import java.util.Map;

public interface KcmService {
    List listuser();

    Map<String,Object> loginUser(User user);

    List<Quan> queryTree(Integer userid);

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

    void updatenum(Integer questionid);

    Courseproblem tohuifu(Integer questionid);

    List queryhuifu(Integer questionid);

    List<Courseproblem> querywenshow();

    List<Courseproblem> querywenshow1(Integer typeid);


    List<Courseproblem> querybywenid(Integer questionid);

    String updatezan(Integer resultid, Integer peopleid);

    List<Courseproblem> querynew();

    List<Courseproblem> queryhot();


    List<Courseproblem> querytiwen(Integer peopleid);

    List<Courseproblem> querymyhuida(Integer peopleid);
}
