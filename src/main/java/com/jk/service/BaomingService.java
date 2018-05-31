package com.jk.service;

import com.jk.model.People;
import com.jk.model.Registrationcentre;

import java.text.ParseException;
import java.util.List;

public interface BaomingService {
    void addBaoUser();

    List<Registrationcentre> querybaolist();

    void deletebaoming(String baouserid);

    Registrationcentre selectid(String baouserid);

    void updatebaoming(Registrationcentre registrationcentre);

    void addbaoming(Registrationcentre registrationcentre);

    void deletevipuser(String peopleid);

    List<People> queryvipuserlist(Integer phone,String peoplenickname,Integer minage,Integer maxage);





    String addpeople(Registrationcentre registrationcentre);

    String updateVIP(Integer ynvip,Integer peopleid);

    String lookynVIP(Integer peopleid);

    People daoqi(Integer peopleid);

    Integer guoqi(Integer peopleid) throws ParseException;

}
