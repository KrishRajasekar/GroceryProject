package org.Junit;

import java.io.IOException;


import org.BaseClass.Baseclass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Grocery extends Baseclass{

	@BeforeClass
	public static void beforeclass() {
		browserLaunch("CHROME");
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait();
	}
	@AfterClass
	public static void afterclass() {
//		CloseCurrentWIndow();
	}
	@Test
	public void booking() throws IOException, Exception {
		
		
		
		
		
		
		
		
		
		
}
}