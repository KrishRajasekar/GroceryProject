package org.Junit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	static WebDriver driver;
	@BeforeClass
	public  static void BeforeClass() {
		driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterclass() {
		driver.close();
	}
	@Before
	public void beformethod() throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver ;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Users\\HARII\\eclipse-workspace1\\MavenProject1\\Excel\\Beforeclass.png");
		FileUtils.copyFile(screenshotAs, desfile);
		
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@After
	public void aftermethod() throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) driver ;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Users\\HARII\\eclipse-workspace1\\MavenProject1\\Excel\\Afterclass.png");
		FileUtils.copyFile(screenshotAs, desfile);
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@Test
	public void click() {
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("rajasekar@93446@gmail.com");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Raja@2709");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginbtn.click();
}
}
