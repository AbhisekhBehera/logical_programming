package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
@Named("voter")
public class VoterEligibilityTest {
	@Value("abhi")
	private String name;
	@Value("26")
	private int age;
	
	private Date sysDate;
	@Value("not sure")
	private String isSingle;
	public VoterEligibilityTest() {
		System.out.println("VoterEligibilityTest.VoterEligibilityTest()");
	}
	@PostConstruct
	public void init() {
		//initialising left one properties
		sysDate=new Date();
		//Bean processor
		if(isSingle==null) {
			isSingle="yes";
		}
		//check ihe bean injection property
		if(name==null || age<=0) {
			throw new IllegalArgumentException("set proper value");
			
		}
	}
	public void myDestory() {
		System.out.println("VoterEligibilityTest.myDestory()");
		sysDate=null;
		name=null;
		isSingle=null;
		
	}
	//bussiness logic
	public String voterEligiablity() {
		if(age<=18)
			return "mr" +name+ "u r not eligiable to vote";
		return "mr" +name+ "u r  eligiable to vote";
	}
	@Override
	public String toString() {
		return "VoterEligibilityTest [name=" + name + ", age=" + age + ", sysDate=" + sysDate + ", isSingle=" + isSingle
				+ "]";
	}
	
	

}
