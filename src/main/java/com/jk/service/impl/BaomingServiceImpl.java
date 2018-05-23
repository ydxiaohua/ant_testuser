package com.jk.service.impl;

import com.jk.dao.BaomingDao;
import com.jk.model.People;
import com.jk.model.Registrationcentre;
import com.jk.service.BaomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/5/15.
 */
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
    public void addpeople(Registrationcentre registrationcentre) {
        baomingDao.addpeople(registrationcentre);
    }
}
