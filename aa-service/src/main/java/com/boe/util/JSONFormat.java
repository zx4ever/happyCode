package com.boe.util;

public class JSONFormat<T> {
	
	private String code;
	private String msg;
	private T data;
	
	public JSONFormat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public JSONFormat(T data) {
		super();
		this.code = "0";
		this.msg = "success";
		this.data = data;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
