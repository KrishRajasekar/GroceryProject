package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	static WebDriver driver;
	@BeforeClass
	public  static void BeforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterclass() {
		
	}
	@Before
	public void beformethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@After
	public void aftermethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		
	}
	@Test
	public void Login() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Raja@93446");
		
		String actusernametext = txtEmail.getAttribute("value");
		Assert.assertEquals("Verify Username", "Raja@93446",actusernametext);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Sekar@02315");
		
		String actpasswordtext = txtpass.getAttribute("Value");
		Assert.assertEquals("Verify Password", "Sekar@02315",actpasswordtext);
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
		String actloginbtn = loginbtn.getAttribute("Value");
		Assert.assertEquals("Verify After login error msg", actloginbtn);
		
	}
}