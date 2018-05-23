package com.jk.service.impl;


import com.alibaba.dubbo.common.json.JSONObject;
import com.jk.dao.UserDao;
import com.jk.model.*;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> queryUserName(User user) {
        return userDao.queryUserName(user);
    }

    @Override
    public List<User> queryUserPass(User user) {
        return userDao.queryUserPass(user);
    }

    @Override
    public List<Menu> queryMenu(Integer userid) {
        List<Menu> firstMenu = userDao.queryMenu(0,userid);
        // 查询一级菜单的子菜单
        recursionMenu(firstMenu,userid);

        return firstMenu;
    }




    private void recursionMenu(List<Menu> firstMenu, Integer userid) {

        for (Menu menu : firstMenu) {

            // 查询菜单是否有子菜单
            List<Menu> menuList2 = userDao.queryMenu(menu.getId(),userid);

            if (menuList2.size() > 0) {

                menu.setNodes(menuList2);

                recursionMenu(menuList2,userid);
            }
        }
    }

    @Override
    public List<User> queryUser() {

         return   userDao.queryUser();
    }

    @Override
    public List<Role> queryRole() {
        return   userDao.queryRole();
    }

    @Override
    public void deleteUser(Integer userid) {
        userDao.deleteUser(userid);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User huixianUser(Integer userid) {
        return userDao.huixianUser(userid);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List selectUserRole(Integer userid) {
        JSONObject jsonc=new JSONObject();

        //根据用户id查询中间表得到对应的角色id集合
        List<UserRole> listur=userDao.selectUserRole(userid);
        //查询角色表中所有数据
        List<Role> listr=userDao.queryRole();

        for (int i = 0; i < listur.size(); i++) {
            for (int j = 0; j < listr.size(); j++) {
                if(listur.get(i).getRoleid()==listr.get(j).getRoleid()){
                    listr.get(j).setRo(1);
                }
            }
        }
        return listr;
    }

    @Override
    public void deleteRole(Integer roleid) {
        userDao.deleteRole(roleid);
    }

    @Override
    public void addRole(Role role) {
        userDao.addRole(role);
    }

    @Override
    public Role huixianRole(Integer roleid) {
        return userDao.huixianRole(roleid);
    }

    @Override
    public void updateRole(Role role) {
        userDao.updateRole(role);
    }



    @Override
    public void SetupRole(String ids, Integer userid) {
        // 先删除当前员工的·所有角色
        userDao.deleteUserRole(Integer.valueOf(userid));
        //批量添加
        String[] split = ids.split(",");
        for (int i = 0; i < split.length; i++) {
            UserRole ur=new UserRole();
            ur.setRoleid(Integer.valueOf(split[i]));
            ur.setUserid(userid);
            userDao.adduserrole(ur);
        }
    }

    @Override
    public List selectRoleMenu(Integer rid) {
        //查询树权限表
        List<Menu> listq=userDao.selectRoleMenu();
        //中间表
        List<RoleMenu> listz=userDao.queryquands(rid);


        for (int i = 0; i < listz.size(); i++) {
            for (int j = 0; j < listq.size(); j++) {
                if(listz.get(i).getQid()==listq.get(j).getId()){
                    listq.get(j).setChecked(true);
                }


            }
        }

        return listq;
    }

    @Override
    public void addRoleMenu(Integer roleid, String idsStr) {
        // 删除
        userDao.deleteRoleMenu(roleid);

        String[] split = idsStr.split(",");
        for (int i = 0; i < split.length; i++) {
            RoleMenu rq=	new RoleMenu();
            rq.setRid(roleid);
            rq.setQid(Integer.valueOf(split[i]));
            userDao.addRoleMenu(rq);
        }
    }

    @Override
    public List<People> queryPeople() {
        return userDao.queryPeople();
    }


}
