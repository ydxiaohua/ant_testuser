package com.jk.service;

import com.jk.model.Liu;
import com.jk.model.People;
import com.jk.model.Xia;

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

    List<Xia> chaxxiaxia();

    List<Xia> zhexianxia(String name);

    Map<String, Object> querylogin(String username, String userpass);

    Map<String,Object> register(String username, String password, String phoe);

    List<People> listuser(Integer userid);

    String uolistuser(Integer  peopleid,String  peoplenickname,Integer  peoplesex,Integer   peopleage);

    void upuserpass(String peoplepass, Integer peopleid);
}
