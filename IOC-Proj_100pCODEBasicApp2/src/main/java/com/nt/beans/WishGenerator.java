package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishGenerator {
	@Autowired
	private Date date;
	public String GenerateWishMessage(String user) {
		int hour=0;
		//get current of the day
		hour=date.getHours();
		//generate wishmsg
		if(hour<=12)
			return "GoodMorning:::"+user;
		else if(hour<=20)
			return "Good Evening:::"+user;
		else 
		return "Good Night::"+user;
		
	}

}
