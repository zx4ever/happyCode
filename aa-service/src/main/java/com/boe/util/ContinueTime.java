package com.boe.util;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContinueTime {

	
	public static int getContinueTime(List<Date> list) {
		
		int count = 1;
		Map<String,Integer> map  =new HashMap<String,Integer>();
		map.put("max",0);//初始化map
		for (int i = 0; i < list.size(); i++) {
			if(i == list.size()-1) {
				break;
			}
			long a = list.get(i).getTime();
			long b = list.get(i+1).getTime();
			if((a-b)!=(24*60*60*1000)){
				int c = map.get("max");
				if(c < count) {
					map.put("max", count);
				}
				count = 1;
			}else {
				count++;
			}
		}
		return count;
	}
}
