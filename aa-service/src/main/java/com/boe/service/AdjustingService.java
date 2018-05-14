package com.boe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boe.dao.AdjustingDao;
import com.boe.entity.Adjusting;

@Service
public class AdjustingService {
	@Autowired
	private AdjustingDao adjustingDao;
	
	public Adjusting getData(long userId) {
		
		return null;
	}
	public int insertData(Adjusting adjusting) {
		return 0 ;
	}
	public int updateData(Adjusting adjusting) {
		return 0;
	}
	public int recalibrate(long userId) {
		return 0;
	}
}
