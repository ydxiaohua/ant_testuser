package com.jk.dao;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<User> queryUserName(User user);

    List<User> queryUserPass(User user);

    /*List<Menu> queryMenu(@Param("pid") Integer pid, @Param("userid")Integer userid);*/

    List<User> queryUser();

    List<Role> queryRole();

    void deleteUser(Integer userid);

    void addUser(User user);

    List<Menu> queryMenu(@Param("pid") Integer pid, @Param("userid") Integer userid);

    User huixianUser(Integer userid);

    void updateUser(User user);

    List<UserRole> selectUserRole(Integer userid);

    void deleteRole(Integer roleid);

    void addRole(Role role);

    Role huixianRole(Integer roleid);

    void updateRole(Role role);

    void adduserrole(UserRole ur);

    void deleteUserRole(Integer integer);

    List<Menu> selectRoleMenu();

    List<RoleMenu> queryquands(Integer rid);

    void deleteRoleMenu(Integer roleid);

    void addRoleMenu(RoleMenu rq);

    List<People> queryPeople();

    List<Menu> queryquanxian();

    void deletequanxian(Integer id);

    void addquanxian(Menu menu);

    List<RoleQuan> selectyy(Integer id);

    Menu selectquanxianid(Integer id);

    void updateqx(Menu menu);

    List yzmm(@Param("username") String username,@Param("userpass") String userpass);

    void xiugaimm(@Param("username") String username,@Param("xinuserpass") String xinuserpass);
}
