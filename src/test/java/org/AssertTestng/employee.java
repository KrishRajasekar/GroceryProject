package org.AssertTestng;


import org.BaseClass.Baseclass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class employee extends Baseclass {

	@Test
	private void Tc1() {
		browserlaunch();
		enterurl("http://adactinhotelapp.com/");
		maximizewindow();
		implicitWait(10);
		
		SoftAssert s = new SoftAssert();
		
	}
}
