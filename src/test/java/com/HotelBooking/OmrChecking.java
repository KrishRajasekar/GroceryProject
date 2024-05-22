package com.HotelBooking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.BaseClass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OmrChecking extends Baseclass {

	private void Login() throws InterruptedException {
		browserlaunch();
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait();

		findlocaterbyID("email").sendKeys("Rajasekar93446@gmail.com");
		findlocaterbyID("pass").sendKeys("Raja@2709");
		Findlocaterbyxpath("//button[text()='Login']").click();

		WebElement txtwelcome = Findlocaterbyxpath("//a[@data-testid='username']");
		System.out.println(txtwelcome.getText());

		Findlocaterbyxpath("//h3[text()='Hotel Booking']").click();
	}

	private void SearchHotels() throws InterruptedException {
		implicitWait();
		WebElement ddnState = findlocaterbyID("state");
		SelectByVisisbilityText(ddnState, "Tamil Nadu");

		WebElement ddnCity = findlocaterbyID("city");
		SelectByVisisbilityText(ddnCity, "Coimbatore");

		Findlocaterbyxpath("//textarea[@class='select2-search__field']").click();
		for (int i = 0; i < 5; i++) {
			Findlocaterbyxpath("//li[@class='select2-results__option select2-results__option--selectable']").click();
			Findlocaterbyxpath("//textarea[@class='select2-search__field']").click();
		}

		Findlocaterbyxpath("//input[@name='check_in']").click();
		Findlocaterbyxpath("(//a[@class='ui-state-default'])[3]").click();
		Findlocaterbyxpath("//input[@name='check_out']").click();
		Findlocaterbyxpath("//a[text()='30']").click();

		WebElement ddnNoOfRoom = findlocaterbyID("no_rooms");
		SelectByVisisbilityText(ddnNoOfRoom, "1-One");

		WebElement NoOfAdults = findlocaterbyID("no_adults");
		SelectByVisisbilityText(NoOfAdults, "1-One");

		findlocaterbyID("no_child").sendKeys("1");

		FrameByName("hotelsearch_iframe");
		Findlocaterbyxpath("//button[@id='searchBtn']").click();

		WebElement pntSelectHotel = Findlocaterbyxpath("//h5[text()='Select Hotel']");
		Findlocaterbyxpath("//label[text()='Price low to high']").click();
		List<WebElement> TotalHotelPrice = driver.findElements(By.xpath("//strong[@class='total-prize']"));
		for (WebElement element : TotalHotelPrice) {
			String LowToHigh = elementGetText(element);
			System.out.println(LowToHigh);
			List<String> asList = Arrays.asList(LowToHigh);
			Collections.sort(asList);
			List<String> Dev = new ArrayList<String>();
			List<String> Qa = new ArrayList<String>();
			boolean equals = Dev.equals(Qa);
			System.out.println(equals);

		}

	}

	public static void main(String[] args) throws InterruptedException {
		OmrChecking checking = new OmrChecking();
		checking.Login();
		checking.SearchHotels();
	}
}
