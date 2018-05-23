package com.jk.service;

import com.jk.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List listuser();

    Map<String,Object> loginUser(User user);
}
