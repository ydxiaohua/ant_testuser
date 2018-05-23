package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List listuser();

    List<User> loginUser(@Param("username") String username);
}
