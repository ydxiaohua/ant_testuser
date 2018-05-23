package com.jk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection="rizhi")
public class Logs implements Serializable {
	private static final long serialVersionUID = -3399534377412935988L;
	@Id
	private String logId;
	private String URL;            //请求路径
	private String HTTP_METHOD;   //请求方式
	private String IP;            //请求人的ip地址
	private String CLASS_METHOD;  //请求的方法
	private String ARGS;          //请求参数
	private String logindata;    //请求时间
	public String getLogindata() {
		return logindata;
	}

	public void setLogindata(String logindata) {
		this.logindata = logindata;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getARGS() {
		return ARGS;
	}

	public void setARGS(String ARGS) {
		this.ARGS = ARGS;
	}

	public String getCLASS_METHOD() {

		return CLASS_METHOD;
	}

	public void setCLASS_METHOD(String CLASS_METHOD) {
		this.CLASS_METHOD = CLASS_METHOD;
	}

	public String getIP() {

		return IP;
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

	public String getHTTP_METHOD() {

		return HTTP_METHOD;
	}

	public void setHTTP_METHOD(String HTTP_METHOD) {
		this.HTTP_METHOD = HTTP_METHOD;
	}

	public String getURL() {

		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	@Override
	public String toString() {
		return "Logs{" +
				"logId='" + logId + '\'' +
				", URL='" + URL + '\'' +
				", HTTP_METHOD='" + HTTP_METHOD + '\'' +
				", IP='" + IP + '\'' +
				", CLASS_METHOD='" + CLASS_METHOD + '\'' +
				", ARGS='" + ARGS + '\'' +
				'}';
	}
}
