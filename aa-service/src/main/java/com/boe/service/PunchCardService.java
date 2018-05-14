package com.boe.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boe.dao.AdjustingDao;
import com.boe.dao.PunchCardDao;
import com.boe.entity.Adjusting;
import com.boe.entity.PunchCard;
import com.boe.util.ContinueTime;
import com.boe.util.MathRandom;
import com.boe.util.TimeFormat;

@Service
public class PunchCardService{

	@Autowired
	private PunchCardDao punchCardDao;
	@Autowired
	private AdjustingDao adjustingDao;
	
	public List<PunchCard> getData(long userId) {
		List<PunchCard> list = punchCardDao.selectData(userId);
		return list;
	}
	
	public String punch(PunchCard params,Date time) {
		String now = TimeFormat.format(new Date());
		List<Date> dateList = new ArrayList<Date>();
		Map<String,String> term = punchCardDao.getWords(1);
		Map<String, Integer> map = punchCardDao.getXY(params.getUserId());
		int flag= punchCardDao.getObj(params.getUserId(), params.getDate());//判断是否有数据
		int counts = 0 ;
		String word1 = term.get("word1");
		String word2 = term.get("word2");
		String[] strs = word1.split(";");
		String[] str2 = word2.split(";");
		if(flag == 1) {
			punchCardDao.updateData(params);
		}else {
			params.setState("1");
			punchCardDao.insterData(params);
		}
		List<PunchCard> punchData = punchCardDao.selectData(params.getUserId());
		int days = punchData.size();
		for (PunchCard punchCard : punchData) {
			counts+=punchCard.getCount();
			dateList.add(punchCard.getDate());
		}
		double r = counts/(8*days);
		Adjusting adjusting  = adjustingDao.selectData(params.getUserId());
		int n1 =  adjustingDao.getFrequency(params.getUserId(),r);
		int n2 = adjustingDao.getSum(params.getUserId());
		int z =n1/(n2)*100;
		if(adjusting==null) {
			adjusting.setState("1");
			adjusting.setR(r);
			adjusting.setUserId(params.getUserId());
			adjusting.setTimes(counts);
			adjustingDao.insertData(adjusting);
		}else {
			adjusting.setR(r);
			adjusting.setTimes(counts);
			adjustingDao.updateDate(adjusting);
		}
		String newWords =strs[0].replaceAll("X", days+"")+strs[0].replaceAll("Y", counts+"")+strs[0].replaceAll("Z",z+"");
		//连续时间
		int continueTimes = ContinueTime.getContinueTime(dateList);
		if(0 <= days && days <= 15) {
			if(continueTimes>=3) {
				int random = MathRandom.random(0,1);
				return newWords+str2[random];
			}else {
				int random = MathRandom.random(2,4);
				return newWords+str2[random];
			}
		}
		if(15 < days && days <= 30) {
			if(continueTimes>=3) {
				int random = MathRandom.random(5,6);
				return newWords+str2[random];
			}else {
				int random = MathRandom.random(7,8);
				return newWords+str2[random];
			}
		}
		if(30 < days && days <= 60) {
			return newWords+strs[strs.length];
		}
		if(60 < days ) {
			return strs[1];
		}
		//判断时间是否为当前时间
		if(now.equals(time)) {
			//判断是添加还是修改
			if(map != null) {
				Map<String,String> term2 = punchCardDao.getWords(2);
				String str3 = term2.get("word1");
				String newWords2 =str3.replaceAll("X", days+"")+str3.replaceAll("Y", counts+"")+str3.replaceAll("Z",z+"");
				return newWords2;
			}else {
				punchCardDao.insterData(params);
			}
		}
		return null;
	}



}