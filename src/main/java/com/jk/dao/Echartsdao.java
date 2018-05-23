package com.jk.dao;

import com.jk.model.Course;
import com.jk.model.Liu;
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
}
