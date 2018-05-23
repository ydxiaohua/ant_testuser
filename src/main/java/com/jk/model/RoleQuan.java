/** 
 * <pre>项目名称:authority_myy 
 * 文件名称:RoleQuan.java 
 * 包名:com.jk.model 
 * 创建日期:2018年4月5日下午2:53:36 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 
 * <pre>项目名称：mallsystem    
 * 类名称：RoleQuan    
 * 类描述：    
 * 创建人：苗启鑫 1437712120@qq.com   
 * 创建时间：2018年4月10日 下午4:40:43    
 * 修改人：苗启鑫 1437712120@qq.com  
 * 修改时间：2018年4月10日 下午4:40:43    
 * 修改备注：       
 * @version </pre>
 */

public class RoleQuan  implements Serializable{
	private static final long serialVersionUID = -3095506808604269486L;

	private Integer rqid;
	private Integer rid;
	private Integer qid;
	@Id
	public Integer getRqid() {
		return rqid;
	}
	public void setRqid(Integer rqid) {
		this.rqid = rqid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "RoleQuan [rqid=" + rqid + ", rid=" + rid + ", qid=" + qid + "]";
	}
	

}
