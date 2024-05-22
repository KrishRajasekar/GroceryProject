package org.dayone;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmrBranchProject {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rajasekar93446@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Raja@2709");

		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginbtn.click();
		Thread.sleep(3000);

		WebElement welcome = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String text = welcome.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.xpath("//span[@class='cart badge badge-xs badge-danger position-relative mr-0 cart_count']"));
		String cartcount = cart.getText();
		String a="0";
		if (cartcount!=a) {
			WebElement txtclick = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
			txtclick.click();
			Thread.sleep(3000);
			List<WebElement> clearcart = driver.findElements(By.xpath("//div[@class='scheduleClose']"));
			Thread.sleep(3000);
			for (WebElement element : clearcart) {
				element.click();
		}
		Thread.sleep(2000);

		WebElement txtsearch = driver.findElement(By.name("search"));
		txtsearch.sendKeys("Nuts", Keys.ENTER);

		WebElement txtnuts = driver.findElement(By.xpath("//h5[@class='sectionTitle font35 font-weight-bold color11']"));
		String nuts = txtnuts.getText();
		System.out.println(nuts);

		WebElement txtadd = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		txtadd.click();
		
		Thread.sleep(2000);
		WebElement txtadd1 = driver.findElement(By.id("cart-21"));
		txtadd1.click();

		WebElement Gotocart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		Thread.sleep(2000);
		Gotocart.click();

		WebElement Mycart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
		String text2 = Mycart.getText();
		System.out.println(text2);

		WebElement txtaddressclick = driver.findElement(By.xpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"));
		txtaddressclick.click();

		WebElement addresstype = driver.findElement(By.xpath("//select[@name='address_type']"));
		Select select = new Select(addresstype);
		Thread.sleep(2000);
		select.selectByIndex(1);

		driver.findElement(By.name("first_name")).sendKeys("Rajasekar");
		driver.findElement(By.name("last_name")).sendKeys("Sekar");
		driver.findElement(By.name("mobile")).sendKeys("8760836156");
		driver.findElement(By.name("apartment")).sendKeys("NO.19");
		driver.findElement(By.name("address")).sendKeys("V.O.C street,Komarapalayam");

		WebElement state = driver.findElement(By.name("state"));
		Select statesel = new Select(state);
		statesel.selectByIndex(35);

		WebElement city = driver.findElement(By.name("city"));
		Select select2 = new Select(city);
		Thread.sleep(5000);
		select2.selectByIndex(45);

		driver.findElement(By.name("zipcode")).sendKeys("638183");

		driver.findElement(By.xpath("(//button[text()='Save'])[3]")).click();
		Thread.sleep(5000);

		WebElement printaddres = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
		String print = printaddres.getText();
		System.out.println(print);

		WebElement element3 = driver.findElement(By.xpath("//div[text()='  Payment Method ']"));
		String text4 = element3.getText();
		System.out.println(text4);

		WebElement payment = driver.findElement(By.id("payment_type"));
		Select selectpayment = new Select(payment);
		Thread.sleep(3000);
		selectpayment.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()=' Visa ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='card_no']")).sendKeys("5555555555552222");

		WebElement month = driver.findElement(By.id("month"));
		Select selectmonth = new Select(month);
		selectmonth.selectByIndex(3);

		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByIndex(5);

		driver.findElement(By.name("cvv")).sendKeys("845");

		WebElement pricedetails = driver.findElement(By.xpath("//div[@class='container borderTop1 mt-sm-5 mt-3 pt-sm-5 pt-3 px-md-0 cart_details']"));
		String priceDet = pricedetails.getText();
		System.out.println(priceDet);

		driver.findElement(By.id("placeOrder")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement placeorder = driver.findElement(By.xpath("//div[@class='orderStatus']"));
		String orderplace = placeorder.getText();
		System.out.println(orderplace);

	}

}
}
