package com.jk.model;

import java.io.Serializable;

/**
 * Created by 世龙同学 on 2018/5/15.
 */
public class Role implements Serializable{


    private static final long serialVersionUID = -4731916138161923017L;

    private Integer roleid;
    private String rolename;
    private  Integer ro;//业务字段


    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getRo() {
        return ro;
    }

    public void setRo(Integer ro) {
        this.ro = ro;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", ro=" + ro +
                '}';
    }
}
