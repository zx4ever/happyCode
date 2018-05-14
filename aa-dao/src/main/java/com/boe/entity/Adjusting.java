package com.boe.entity;

public class Adjusting {

	private long id;
	private long userId;
	private Integer times;
	private String state;
	private double r;
	public Adjusting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adjusting(long id, long userId, Integer times, String state, double r) {
		super();
		this.id = id;
		this.userId = userId;
		this.times = times;
		this.state = state;
		this.r = r;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
}
