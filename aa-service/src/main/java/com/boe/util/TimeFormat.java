package com.boe.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {

	
	public static  String format(Date date) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(new Date());
		return format;
	}
}
