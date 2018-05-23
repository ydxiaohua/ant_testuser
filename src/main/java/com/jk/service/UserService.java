package com.jk.service;

import com.jk.model.Menu;
import com.jk.model.People;
import com.jk.model.Role;
import com.jk.model.User;

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
}
