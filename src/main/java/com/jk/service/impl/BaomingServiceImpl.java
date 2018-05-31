package com.jk.service.impl;

import com.jk.dao.BaomingDao;
import com.jk.model.People;
import com.jk.model.Registrationcentre;
import com.jk.service.BaomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Service
public class BaomingServiceImpl implements BaomingService{

    @Autowired
    private BaomingDao baomingDao;



    @Override
    public void addBaoUser() {
        baomingDao.addBaoUser();
    }

    @Override
    public List<Registrationcentre> querybaolist() {

        return baomingDao.querybaolist();
    }

    @Override
    public void deletebaoming(String baouserid) {
        baomingDao.deletebaoming(baouserid);
    }

    @Override
    public Registrationcentre selectid(String baouserid) {
        return baomingDao.selectid(baouserid);
    }

    @Override
    public void updatebaoming(Registrationcentre registrationcentre) {
        baomingDao.updatebaoming(registrationcentre);
    }

    @Override
    public void addbaoming(Registrationcentre registrationcentre) {
        baomingDao.addbaoming(registrationcentre);
    }

    @Override
    public void deletevipuser(String peopleid) {
        baomingDao.deletevipuser(peopleid);
    }

    @Override
    public List<People> queryvipuserlist(Integer phone,String peoplenickname,Integer minage,Integer maxage) {
        return baomingDao.queryvipuserlist(phone,peoplenickname,minage,maxage);
    }






    @Override
    public String addpeople(Registrationcentre registrationcentre) {
        String zz = "";
        if(registrationcentre.getBaousername()=="" | registrationcentre.getBaousersex()==null | registrationcentre.getBaouserphone()=="" | registrationcentre.getBaouserweixin()=="" | registrationcentre.getBaousermaxxl()=="" | registrationcentre.getBaousergraduatedate()=="" | registrationcentre.getPresentpay()==null | registrationcentre.getPresentstatus()==null){
            zz = "aaaa";
        }else{
            baomingDao.addpeople(registrationcentre);
            zz = "bbbb";
        }
        return zz;
    }

    @Override
    public String updateVIP(Integer ynvip,Integer peopleid) {
        String qq = "";
        String shijian = "";
        if(ynvip == null){
            qq = "空";
        }else{
            if(ynvip == 1){
                //添加一个月
                Calendar cal = Calendar.getInstance();
                int year =cal.get(Calendar.YEAR)+1;
                int month=cal.get(Calendar.MONTH)+1;
                cal.add(Calendar.MONTH, 1);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date=cal.getTime();
                shijian = sdf.format(date);
            }
            if(ynvip == 2){
                //添加半年
                Calendar cal = Calendar.getInstance();
                int year =cal.get(Calendar.YEAR)+1;
                int month=cal.get(Calendar.MONTH)+1;
                cal.add(Calendar.MONTH, 6);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date=cal.getTime();
                shijian = sdf.format(date);
            }
            if(ynvip == 3){
                //添加一年
                Scanner sc = new Scanner(System.in);
                Calendar curr = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                curr.set(Calendar.YEAR,curr.get(Calendar.YEAR)+1);
                Date date=curr.getTime();
                shijian = sdf.format(date);
            }
            baomingDao.updateVIP(shijian,peopleid);
            qq = "实";
        }
        return qq;
    }

    @Override
    public String lookynVIP(Integer peopleid) {
        String xx = "";
        List list = baomingDao.lookynVIP(peopleid);
        if(list.size()>0){
            xx = "是会员";
        }else{
            xx = "不是会员";
        }
        return xx;
    }

    @Override
    public People daoqi(Integer peopleid) {
        return baomingDao.daoqi(peopleid);
    }

    @Override
    public Integer guoqi(Integer peopleid) throws ParseException {
        Integer i = 0;
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date date = new Date();
        People people = baomingDao.guoqi(peopleid);
        String sha = people.getVipendtime();
        Date xianshi = sim.parse(sha);
        int res = date.compareTo(xianshi);
        /*
        * 例如：比较date1 和 date2的大小
                int res = date1.compareTo(date2)，相等则返回0，date1大返回1，否则返回-1。
        * */
        if(res == 1){
            baomingDao.updatedaoqi(peopleid);
        }
        return i;
    }


}
