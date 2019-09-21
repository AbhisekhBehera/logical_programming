package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterEligibilityTest;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		VoterEligibilityTest voter=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		voter=ctx.getBean("voter", VoterEligibilityTest.class);
		System.out.println("BeanLifeCycleTest.main()");
		System.out.println(voter);
		System.out.println(voter.voterEligiablity());
		((AbstractApplicationContext) ctx).close();

	}

}
