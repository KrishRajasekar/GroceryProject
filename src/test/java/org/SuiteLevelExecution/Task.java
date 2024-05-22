package org.SuiteLevelExecution;

import org.BaseClass.Baseclass;
import org.Testng.Login;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Task extends Baseclass {
	
	@BeforeClass
	private void beforeclass() {
		browserlaunch();
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait(10);
	}
	@AfterClass
	private void afterClass() {
//		CloseCurrentWIndow();

	}
	@BeforeMethod
	private void beforemethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	@AfterMethod
	private void afterMethod() {
		long EndTime = System.currentTimeMillis();
		System.out.println(EndTime);
	}

	
	@Parameters({"userName","password"})
	@Test
		private void login (@Optional("Rajasekar@2709")String userName,String password) {
		Login loginPage = new Login();
		loginPage.LoginPage(userName,password);
		}
	
	}
	


