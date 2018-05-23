package com.jk.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


/**
 * Created by Administrator on 2018/4/27.
 */
@Document(collection="userlogin2")
public class Userlogin implements Serializable {
    private static final long serialVersionUID = 2486604356577995963L;
    @Id
    private   Integer   userid;
    private   String    username;
    private   String    datauser;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDatauser() {
        return datauser;
    }

    public void setDatauser(String datauser) {
        this.datauser = datauser;
    }

}
