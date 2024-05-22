package org.BaseClass;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class OmrPage extends Baseclass{
	
	public void Booking() throws IOException, InterruptedException {
		
		browserlaunch();
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait();
		
		WebElement email = findlocaterbyID("email");
		elementsendkeys(email, getCellData("Grocery", 1, 1));
		
		WebElement password = findlocaterbyID("pass");
		elementsendkeys(password, getCellData("Grocery", 1,2));
		
		
		WebElement LoginBtn = Findlocaterbyxpath("//button[@value='login']");
		elementClick(LoginBtn);
	
		WebElement cart = driver.findElement(By.xpath("//span[@class='cart badge badge-xs badge-danger position-relative mr-0 cart_count']"));
		String count = elementGetText(cart);
		String a="0";
		if (count!=a) {
			WebElement CartClick = Findlocaterbyxpath("//i[@class='fa fa-shopping-cart']");
			elementClick(CartClick);
			List<WebElement> list = List_findLocatorByXpath("//div[@class='scheduleClose']");
			implicitWait();
			Thread.sleep(4000);
			for (WebElement element : list) {
				elementClick(element);	
			}
		
		Thread.sleep(5000);
		WebElement SearchPro = findlocaterbyID("search");
		elementsendkeys(SearchPro, getCellData("Grocery", 1, 3)+Keys.ENTER);
		
		WebElement NutsAdd = Findlocaterbyxpath("//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']");
		elementClick(NutsAdd);
		
		WebElement NutsAdd1 = Findlocaterbyxpath("//button[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 variant_btn']");
		elementClick(NutsAdd1);
		
		Thread.sleep(1000);
		WebElement GotoCart = Findlocaterbyxpath("//a[@class='hover1']");
		elementClick(GotoCart);
		
		WebElement AddAddress = Findlocaterbyxpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
		elementClick(AddAddress);
		
		WebElement AddressType = findlocaterbyID("address_type");
		Select select = SelectBYIndex(AddressType, 1);
		elementClick(AddressType);
		
		WebElement Firstname= findlocaterbyName("first_name");
		elementsendkeys(Firstname, getCellData("Grocery", 1, 4));
		
		WebElement lastname = findlocaterbyName("last_name");
		elementsendkeys(lastname, getCellData("Grocery", 1, 5));
		
		WebElement MobileNo = findlocaterbyName("mobile");
		elementsendkeys(MobileNo, getCellData("Grocery", 1, 6));
		
		WebElement HouseNo = findlocaterbyName("apartment");
		elementsendkeys(HouseNo, getCellData("Grocery", 1, 7));
		
		WebElement Address = findlocaterbyName("address");
		elementsendkeys(Address, getCellData("Grocery", 1, 8));
		
		WebElement State = findlocaterbyName("state");
		SelectByVisisbilityText(State, "Tamil Nadu");
		elementClick(State);
		
		WebElement City = findlocaterbyName("city");
		SelectByVisisbilityText(City, "Namakkal");
		elementClick(City);
		
		Thread.sleep(3000);
		WebElement PinCode = findlocaterbyName("zipcode");
		elementsendkeys(PinCode, getCellData("Grocery", 1 ,9));
		
		WebElement Save = Findlocaterbyxpath("//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']");
		elementClick(Save);
		
		Thread.sleep(3000);
		WebElement Payment = findlocaterbyID("payment_type");
		Select Debit = SelectBYIndex(Payment, 1);
		elementClick(Payment);
		WebElement Visa = Findlocaterbyxpath("//label[text()=' Visa ']");
		elementClick(Visa);
		
		WebElement CardNo = Findlocaterbyxpath("//input[@name='card_no']");
		elementsendkeys(CardNo, getCellData("Grocery", 1, 10));
		
		WebElement Month = findlocaterbyID("month");
		SelectBYIndex(Month, 9);
		
		WebElement Year = findlocaterbyID("year");
		SelectBYIndex(Year, 2);
		
		WebElement Cvv = findlocaterbyName("cvv");
		elementsendkeys(Cvv, getCellData("Grocery", 1, 11));
		
		WebElement Placeorder = findlocaterbyID("placeOrder");
		elementClick(Placeorder);
		Thread.sleep(5000);
		WebElement OrderNo = Findlocaterbyxpath("//p[text()='Order No: ']");
		
		CreateCellAndSetCellData("Grocery", 1, 12, elementGetText(OrderNo));
		
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		OmrPage a = new OmrPage();
		a.Booking();
		
	}
}