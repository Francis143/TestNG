package com.sample;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=5)
	public void TC_001() {
		System.out.println("TC_001");
	}
	
	@Test(priority=4)
	public void TC_002() {
		System.out.println("TC_002");
	}
	
	@Test(priority=3)
	public void TC_003() {
		System.out.println("TC_003");
	}
	
	@Test(priority=2)
	public void TC_004() {
		System.out.println("TC_004");
	}
	
	@Test(priority=1)
	public void TC_005() {
		System.out.println("TC_005");
	}
	
	
	
	
	
}
