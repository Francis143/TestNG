package com.sample;

import org.testng.annotations.*;

public class BasicAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("BeforeGroups");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test(groups="smoke")
	public void Test_001() {
		System.out.println("Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("AfterGroups");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
