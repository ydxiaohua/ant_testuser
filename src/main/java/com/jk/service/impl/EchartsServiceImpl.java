package com.jk.service.impl;

import com.jk.dao.Echartsdao;
import com.jk.model.Course;
import com.jk.model.Liu;
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
}
