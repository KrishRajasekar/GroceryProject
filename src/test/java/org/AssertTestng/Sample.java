package org.AssertTestng;

import org.BaseClass.Baseclass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample extends Baseclass {
	
	@Test
	private void Tc1() {
		browserlaunch();
		enterurl("https://adactinhotelapp.com/");
		maximizewindow();
		implicitWait(10);		
		
		//Hard Assert
		
		String getCurrentUrl = GetCurrentUrl();
		boolean contains = getCurrentUrl.contains("hotel");
		Assert.assertTrue(contains, "Verify URL");
		String gettitle = gettitle();
		System.out.println(gettitle);
		
		
	
	}
	
	
}




