package com.jk.service.impl;

import com.jk.dao.Echartsdao;
import com.jk.model.Course;
import com.jk.model.Liu;
import com.jk.model.People;
import com.jk.model.Xia;
import com.jk.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/17.
 */
public class EchartsServiceImpl implements EchartsService {

    @Autowired
    private Echartsdao echartsdao;
    @Override
    public Map<String, Object> echarts() {

        Map<String , Object> map=new HashMap<String, Object>();

        List<Course> xiao=echartsdao.echarts();
        if (xiao!=null&&xiao.size()>0) {
            Integer  ind=xiao.size();
            String[]    setarr=new   String[ind];
            Integer[]   intarr=new   Integer[ind];
            for (int i = 0; i < xiao.size(); i++) {
                Course   x=xiao.get(i);
                String  a=x.getClassname();
                setarr[i]=a;
                Integer  b=x.getDowncode();
                intarr[i]=b;
            }
            map.put("succ", true);
            map.put("leg", "['销量']");
            map.put("xax", setarr);
            map.put("ser", intarr);
        }else{

            map.put("succ", false);
        }
        return map;
    }

    @Override
    public List<Liu> chaxliu() {


        return echartsdao.chaxliu();
    }

    @Override
    public List<Liu> chaxliuyue(String  name) {


        return echartsdao.chaxliuyue(name);
    }

    @Override
    public void addliulist(Liu liu) {

        echartsdao.addliulist(liu);

    }

    @Override
    public List<Xia> chaxxiaxia() {


        return echartsdao.chaxxiaxia();
    }

    @Override
    public List<Xia> zhexianxia(String name) {

        return echartsdao.zhexianxia(name);
    }

    @Override
    public Map<String, Object> querylogin(String username, String userpass) {
        Map<String, Object> map = new HashMap<String, Object>();
        String   login= "";
        People user=echartsdao.querylogin(username);
        if(user!=null){
            if(userpass.equals(user.getPeoplepass())){
                map.put("user", user);
                login="success";
            }else{
                //密码错误
                login="erroruserpas";
            }
        }else{
            //用户名或手机号不存在
            login="error";
        }
        map.put("login", login);
        return map;
    }

    @Override
    public Map<String, Object> register(String username, String password, String phoe) {
        Map<String, Object> map = new HashMap<String, Object>();

        String   login= "";
        List<People> user=echartsdao.register(username,phoe);
        People   people ;
        if(user.size()==0){
            people  =new  People();
            people.setEmail(username);
            people.setPeoplepass(password);
            people.setPhone(phoe);
            people.setYnvip(0);
            echartsdao.addregister(people);
            People list=echartsdao.querylogin(username);
            map.put("list",list);
            login="ok";
        }else{
            login="no";
        }
        map.put("login",login);
        return map;
    }

    @Override
    public List<People> listuser(Integer userid) {

        List<People>  people =echartsdao.listuser(userid);

        return people;
    }

    @Override
    public String uolistuser(Integer  peopleid,String  peoplenickname,Integer  peoplesex,Integer   peopleage) {

          String  list="ok";
           People  people  =new  People();
          people.setPeopleage(peopleage);
          people.setPeoplenickname(peoplenickname);
          people.setPeopleid(peopleid);
          people.setPeoplesex(peoplesex);
          echartsdao.uolistuser(people);
          return list;
    }

    @Override
    public void upuserpass(String peoplepass, Integer peopleid) {
        People  people  =new  People();
        people.setPeopleid(peopleid);
        people.setPeoplepass(peoplepass);
        echartsdao.upuserpass(people);
    }
}
