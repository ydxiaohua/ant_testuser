package com.jk.service;

import com.jk.model.Share;
import com.jk.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/5/10.
 */
public interface TestService {


    List<User> query();
    List<Share> sharelist(String qiandata,String  hodata);
}
