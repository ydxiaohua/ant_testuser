/** 
 * <pre>项目名称:authority_myy 
 * 文件名称:UserRole.java 
 * 包名:com.jk.model 
 * 创建日期:2018年4月5日下午12:58:28 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 
 * <pre>项目名称：mallsystem    
 * 类名称：UserRole    
 * 类描述：    
 * 创建人：苗启鑫 1437712120@qq.com   
 * 创建时间：2018年4月10日 下午4:38:34    
 * 修改人：苗启鑫 1437712120@qq.com  
 * 修改时间：2018年4月10日 下午4:38:34    
 * 修改备注：       
 * @version </pre>
 */


public class UserRole implements Serializable{
	
	private static final long serialVersionUID = -3095506808604269486L;
	private Integer urid;
	private Integer uid;
	private Integer rid;
	
	@Id
	public Integer getUrid() {
		return urid;
	}
	public void setUrid(Integer urid) {
		this.urid = urid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "UserRole [urid=" + urid + ", uid=" + uid + ", rid=" + rid + "]";
	}
	
	

}
