package com.boe.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.boe.entity.PunchCard;


@Mapper
public interface  PunchCardDao {
	//获取用户打卡信息	
	public List<PunchCard> selectData(long userId);
	//获取X,Y
	public Map<String,Integer> getXY(long userId);
	//插入数据
	public int insterData(PunchCard punchCard);
	//更新数据
	public int updateData(PunchCard punchCard);
	//更新打卡频率
	public int updatFrequency(Map params);
	//重新校准
	public int updateState(long userId);
	//获取术语
	public Map<String,String> getWords(long id);
	public int getObj(@Param("userId")long userId,@Param("date") Date date);
}
