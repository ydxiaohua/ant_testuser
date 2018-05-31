package com.jk.service;

import com.jk.model.*;

import java.util.List;

public interface UserService {

    List<User> queryUserName(User user);

    List<User> queryUserPass(User user);

    List<Menu> queryMenu(Integer userid);

    List<User> queryUser();

    List<Role> queryRole();

    void deleteUser(Integer userid);

    void addUser(User user);

    User huixianUser(Integer userid);

    void updateUser(User user);

    List  selectUserRole(Integer userid);

    void deleteRole(Integer roleid);

    void addRole(Role role);

    Role huixianRole(Integer roleid);

    void updateRole(Role role);

    void SetupRole(String ids, Integer userid);

    List selectRoleMenu(Integer rid);

    void addRoleMenu(Integer roleid, String idsStr);

    List<People> queryPeople();


    List<Menu> queryquanxian();

    String deletequanxian(Integer id);

    void addquanxian(Menu menu);

    Menu selectquanxianid(Integer id);

    void updateqx(Menu menu);

    String yzmm(User user);
}
