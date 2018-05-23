package com.jk.service.impl;


import com.jk.dao.UserDao;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



    @Override
    public List listuser() {

        return userDao.listuser();
    }

    @Override
    public Map<String, Object> loginUser(User user) {

        Map<String, Object> map = new HashMap<>();

        String flag = "0"; //0 : 用户名不存在   1： 密码错误  2： 登录成功

        List<User> user2 = userDao.loginUser(user.getUsername());

//		用户名是否真的存在
        if(user2 != null && user2.size() >0){

            flag = "1";

            User userObj = user2.get(0);

//			页面的密码 与 数据库查出来的密码是否一致
            if(userObj.getUserpass().equals(user.getUserpass())){

                flag = "2";

                map.put("user", userObj);
            }

        }

        map.put("flag", flag);

        return map;

    }


}
