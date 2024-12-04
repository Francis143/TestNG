package com.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {

	@Parameters({"username","password"})
	@Test
	public void tc(String s1,String s2) {
		System.out.println("TEST");
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
