package com.boe.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PunchCard {
	
	private long id;
	private long userId;
	private String morning;
	private String empty;
	private String afterBreakfast;
	private String beforeLunch;
	private String afterLunch;
	private String beforeDinner;
	private String afterDinner;
	private String sleep;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	private String state;
	private Integer count;
	public PunchCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PunchCard(long id, long userId, String morning, String empty, String afterBreakfast, String beforeLunch,
			String afterLunch, String beforeDinner, String afterDinner, String sleep, Date date, String state,
			Integer count) {
		super();
		this.id = id;
		this.userId = userId;
		this.morning = morning;
		this.empty = empty;
		this.afterBreakfast = afterBreakfast;
		this.beforeLunch = beforeLunch;
		this.afterLunch = afterLunch;
		this.beforeDinner = beforeDinner;
		this.afterDinner = afterDinner;
		this.sleep = sleep;
		this.date = date;
		this.state = state;
		this.count = count;
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
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getEmpty() {
		return empty;
	}
	public void setEmpty(String empty) {
		this.empty = empty;
	}
	public String getAfterBreakfast() {
		return afterBreakfast;
	}
	public void setAfterBreakfast(String afterBreakfast) {
		this.afterBreakfast = afterBreakfast;
	}
	public String getBeforeLunch() {
		return beforeLunch;
	}
	public void setBeforeLunch(String beforeLunch) {
		this.beforeLunch = beforeLunch;
	}
	public String getAfterLunch() {
		return afterLunch;
	}
	public void setAfterLunch(String afterLunch) {
		this.afterLunch = afterLunch;
	}
	public String getBeforeDinner() {
		return beforeDinner;
	}
	public void setBeforeDinner(String beforeDinner) {
		this.beforeDinner = beforeDinner;
	}
	public String getAfterDinner() {
		return afterDinner;
	}
	public void setAfterDinner(String afterDinner) {
		this.afterDinner = afterDinner;
	}
	public String getSleep() {
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
}
