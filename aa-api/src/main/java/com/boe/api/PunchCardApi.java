package com.boe.api;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boe.entity.PunchCard;
import com.boe.service.PunchCardService;



@RestController
@RequestMapping("test")
public class PunchCardApi {
	@Autowired
	private PunchCardService punchCardService;
	
	@RequestMapping(path="/get",method= RequestMethod.GET)
	public List<PunchCard>  getDate(@RequestParam(required=true) long userId){
		return punchCardService.getData(userId);
				
	}
}
