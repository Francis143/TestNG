package com.sample;

import org.testng.annotations.Test;

public class Enabled {
	@Test()
	public void TC_001() {
		System.out.println("TC_001");
	}
	
	@Test()
	public void TC_002() {
		System.out.println("TC_002");
	}
	
	@Test(enabled=false)
	public void TC_003() {
		System.out.println("TC_003");
	}
	
	@Test()
	public void TC_004() {
		System.out.println("TC_004");
	}
	
	@Test()
	public void TC_005() {
		System.out.println("TC_005");
	}
}
