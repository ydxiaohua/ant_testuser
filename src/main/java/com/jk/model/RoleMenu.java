package com.jk.model;

import java.io.Serializable;

/**
 * Created by 世龙同学 on 2018/5/18.
 */
public class RoleMenu implements Serializable{


    private static final long serialVersionUID = -2316015745190557469L;
    private Integer rqid;
    private Integer rid;
    private Integer qid;


    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRqid() {
        return rqid;
    }

    public void setRqid(Integer rqid) {
        this.rqid = rqid;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "rqid=" + rqid +
                ", rid=" + rid +
                ", qid=" + qid +
                '}';
    }
}
