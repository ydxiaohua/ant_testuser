package com.jk.model;


import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/17.
 */
public class  Liu  implements Serializable {

    private static final long serialVersionUID = 3923190835995761345L;
    private  Integer  liuid;

    private  String  syllabusid;

    private   Integer    shulian;
    private   Integer    type;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getLiuid() {
        return liuid;
    }

    public void setLiuid(Integer liuid) {
        this.liuid = liuid;
    }

    public String getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(String syllabusid) {
        this.syllabusid = syllabusid;
    }

    public Integer getShulian() {
        return shulian;
    }

    public void setShulian(Integer shulian) {
        this.shulian = shulian;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
