package com.boe.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.boe.entity.Adjusting;

@Mapper
public interface AdjustingDao {
	
	public int insertData(Adjusting adjusting);
	
	public int updateDate(Adjusting adjusting);
	
	public Adjusting selectData(long userId);
	//n1
	public int getFrequency(@Param("userId")long userId,@Param("r")double r);
	//获取n1+n2
	public int getSum(long userId);
	
	//重新校准
	public int recalibrate(long userId);
}
