package com.jk.dao;

import com.jk.model.Course;
import com.jk.model.Liu;
import com.jk.model.People;
import com.jk.model.Xia;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/5/17.
 */
public interface Echartsdao {


    List<Course> echarts();

    List<Liu> chaxliu();

    List<Liu> chaxliuyue(@Param("name") String  name);

    void addliulist(Liu liu);

    List<Xia> chaxxiaxia();

    List<Xia> zhexianxia(String name);

    People querylogin(@Param("name") String username);

    List<People> register(@Param("name")String username,@Param("phoe") String phoe);

    void addregister(People people);

    List<People> listuser(@Param("userid")Integer userid);

    void uolistuser(People  people);

    void upuserpass(People  people);
}
