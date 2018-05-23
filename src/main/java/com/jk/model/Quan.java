package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * <pre>项目名称：mallsystem    
 * 类名称：Quan    
 * 类描述：    
 * 创建人：苗启鑫 1437712120@qq.com   
 * 创建时间：2018年4月10日 下午4:43:02    
 * 修改人：苗启鑫 1437712120@qq.com  
 * 修改时间：2018年4月10日 下午4:43:02    
 * 修改备注：       
 * @version </pre>
 */

public class Quan implements Serializable{
	private static final long serialVersionUID = 6994322495424117995L;
	@Id
	private String quanid;
	private String text;
	private String url;
	private String pid;
	private List<Quan> nodes;
	private Boolean Checked =false;
	public String getQuanid() {
		return quanid;
	}
	public void setQuanid(String quanid) {
		this.quanid = quanid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public List<Quan> getNodes() {
		return nodes;
	}
	public void setNodes(List<Quan> nodes) {
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
		return "Quan [quanid=" + quanid + ", text=" + text + ", url=" + url + ", pid=" + pid + ", nodes=" + nodes
				+ ", Checked=" + Checked + "]";
	}
	
	
}
