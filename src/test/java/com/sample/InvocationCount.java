package com.sample;

import org.testng.annotations.*;

public class InvocationCount {
	
@BeforeMethod	
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test(invocationCount=5)
	public void tc() {
		System.out.println("Test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	

}
