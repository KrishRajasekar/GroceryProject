package org.JunitCore;


import org.junit.Assert;
import org.junit.Test;

public class Sample1 {
	@Test
	public void Tc1() {
		Assert.assertTrue(false);
		System.out.println("TC1");
		
	}
	@Test
	public void TC2() {
		System.out.println("TC2");
	}
	@Test
	public void TC3() {
		System.out.println("TC3");
	}
	

}
