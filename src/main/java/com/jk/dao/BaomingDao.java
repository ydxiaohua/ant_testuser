package com.jk.dao;

import com.jk.model.People;
import com.jk.model.Registrationcentre;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaomingDao {
    void addBaoUser();

    List<Registrationcentre> querybaolist();

    void deletebaoming(@Param("baouserid") String baouserid);

    Registrationcentre selectid(String baouserid);

    void updatebaoming(Registrationcentre registrationcentre);

    void addbaoming(Registrationcentre registrationcentre);

    void deletevipuser(String peopleid);

    List<People> queryvipuserlist(@Param("phone") Integer phone,@Param("peoplenickname") String peoplenickname,@Param("minage")Integer minage,@Param("maxage")Integer maxage);

    void addpeople(Registrationcentre registrationcentre);

    void updateVIP(Integer peopleid);
}
