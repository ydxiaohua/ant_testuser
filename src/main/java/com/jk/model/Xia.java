package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/24.
 */
public class Xia implements Serializable {

    private static final long serialVersionUID = -5389563686170781920L;
    private   Integer  id;

    private   String   xiadata;

    private   Integer  shulian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShulian() {
        return shulian;
    }

    public void setShulian(Integer shulian) {
        this.shulian = shulian;
    }

    public String getXiadata() {
        return xiadata;
    }

    public void setXiadata(String xiadata) {
        this.xiadata = xiadata;
    }
}
