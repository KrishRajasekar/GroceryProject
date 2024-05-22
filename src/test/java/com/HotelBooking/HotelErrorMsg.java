package com.HotelBooking;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;

public class HotelErrorMsg extends Baseclass {
	private void Login() throws InterruptedException {
		browserlaunch();
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait();

		findlocaterbyID("email").sendKeys("Rajasekar93446@gmail.com");
		findlocaterbyID("pass").sendKeys("Raja@2709");
		Findlocaterbyxpath("//button[text()='Login']").click();
		Findlocaterbyxpath("//h3[text()='Hotel Booking']").click();
		FrameByName("hotelsearch_iframe");
		Findlocaterbyxpath("//button[@class='btn filter_btn']").click();
		ParentFrame();

		Thread.sleep(4000);
		WebElement PrintErrorstate = Findlocaterbyxpath("(//div[@class='invalid-feedback animated fadeInDown'])[1]");
		System.out.println(PrintErrorstate.getText());

		WebElement PrintErrorCity = Findlocaterbyxpath("//div[text()='Please select city']");
		System.out.println(PrintErrorCity.getText());

		WebElement PrintErrorCheckin = Findlocaterbyxpath("//div[text()='Please select Check-in date']");
		System.out.println(PrintErrorCheckin.getText());

		WebElement PrintErrorCheckOut = Findlocaterbyxpath("//div[text()='Please select Check-out date']");
		System.out.println(PrintErrorCheckOut.getText());

		WebElement PrintErrorSelectRooms = Findlocaterbyxpath("//div[text()='Please select no. of rooms']");
		System.out.println(PrintErrorSelectRooms.getText());

		WebElement PrintErrorAdults = Findlocaterbyxpath("//div[text()='Please select no. of adults']");
		System.out.println(PrintErrorAdults.getText());

	}

	public static void main(String[] args) throws InterruptedException {
		HotelErrorMsg errorMsg = new HotelErrorMsg();
		errorMsg.Login();
	}
}
