package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.AppConfig;
import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		WishGenerator wish=null;
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//getBean
		wish=ctx.getBean("wish", WishGenerator.class);
		System.out.println("ClientApp.main()");
		System.out.println("WishMessage:::"+wish.GenerateWishMessage("abhi"));
		ctx.close();
		
		
		

	}

}
