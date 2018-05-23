package com.jk.service;

import com.jk.model.Liu;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/17.
 */
public interface EchartsService {


    Map<String,Object> echarts();
    List<Liu> chaxliu();
    List<Liu> chaxliuyue(String name);
    void addliulist(Liu liu);

}
