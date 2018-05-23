package com.jk.service.impl;

import com.jk.dao.Testdao;
import com.jk.model.Share;
import com.jk.model.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private Testdao Testdao;

    @Override
    public List<User> query() {

        return Testdao.query();
    }

    @Override
    public List<Share> sharelist(String qiandata,String  hodata) {



        return  Testdao.sharelist(qiandata,hodata);
    }
}
