package com.jk.model;

import java.io.Serializable;

/**
 * Created by 世龙同学 on 2018/5/24.
 */
public class Img implements Serializable{


    private Integer imgid;
    private String  img;
    private String  imgdate;
    private String  imgstate;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgdate() {
        return imgdate;
    }

    public void setImgdate(String imgdate) {
        this.imgdate = imgdate;
    }

    public String getImgstate() {
        return imgstate;
    }

    public void setImgstate(String imgstate) {
        this.imgstate = imgstate;
    }

    @Override
    public String toString() {
        return "Img{" +
                "imgid=" + imgid +
                ", img='" + img + '\'' +
                ", imgdate='" + imgdate + '\'' +
                ", imgstate='" + imgstate + '\'' +
                '}';
    }
}
