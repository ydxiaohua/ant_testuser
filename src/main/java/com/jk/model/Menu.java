package com.jk.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 世龙同学 on 2018/5/15.
 */
public class Menu implements Serializable{

    private static final long serialVersionUID = -7483673158317681395L;
    private Integer id;
    private Integer pid;
    private String url;
    private String text;
    private List<Menu> nodes;
    private Boolean Checked =false;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public List<Menu> getNodes() {
        return nodes;
    }

    public void setNodes(List<Menu> nodes) {
        this.nodes = nodes;
    }

    public Boolean getChecked() {
        return Checked;
    }

    public void setChecked(Boolean checked) {
        Checked = checked;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", pid=" + pid +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                ", nodes=" + nodes +
                ", Checked=" + Checked +
                '}';
    }
}
