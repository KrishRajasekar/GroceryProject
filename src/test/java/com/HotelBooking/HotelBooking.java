package com.HotelBooking;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;

public class HotelBooking extends Baseclass {

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
		System.out.println(pntSelectHotel.getText());

		WebElement printHotelName = Findlocaterbyxpath("//h5[text()='Hilton Deluxe']");
		System.out.println(printHotelName.getText());

		WebElement print1stHotelName = Findlocaterbyxpath("(//strong[@class='total-prize'])[1]");
		System.out.println(print1stHotelName.getText());

	}

	private void SelectHotel() throws InterruptedException {
		implicitWait();
		Findlocaterbyxpath("(//a[@class='btn filter_btn'])[1]").click();
		AlertClickok();
		WebElement PrintBookHotelName = Findlocaterbyxpath("//h2[@class='px-3 py-2']");
		System.out.println(PrintBookHotelName.getText());
	}

	private void BookHotel() {
		implicitWait();
		findlocaterbyID("own").click();
		WebElement ddnSelectMrs = findlocaterbyID("user_title");
		SelectBYIndex(ddnSelectMrs, 1);
		findlocaterbyID("first_name").sendKeys("Rajasekar");
		findlocaterbyID("last_name").sendKeys("Sekar");
		findlocaterbyID("user_phone").sendKeys("8760836156");
		findlocaterbyID("user_email").sendKeys("Rajasekar93446@gmail.com");
		findlocaterbyID("gst").click();
		findlocaterbyID("gst_registration").sendKeys("9043592058");
		findlocaterbyID("company_name").sendKeys("Greens Tech OMR Branch");
		findlocaterbyID("company_address").sendKeys("Thoraipakkam");
		findlocaterbyID("step1next").click();
		findlocaterbyID("high").click();
		findlocaterbyID("other_request").sendKeys("Hi");
		findlocaterbyID("step2next").click();
		Findlocaterbyxpath("//div[@class='credit-card pm']").click();
		WebElement ddncardType = findlocaterbyID("payment_type");
		SelectBYIndex(ddncardType, 1);
		WebElement ddnCard = findlocaterbyID("card_type");
		SelectBYIndex(ddnCard, 1);
		findlocaterbyID("card_no").sendKeys("5555555555552222");
		findlocaterbyID("card_name").sendKeys("Rajasekar");
		WebElement ddnCardMonth = findlocaterbyID("card_month");
		SelectBYIndex(ddnCardMonth, 5);
		WebElement ddnCardYear = findlocaterbyID("card_year");
		SelectBYIndex(ddnCardYear, 3);
		Findlocaterbyxpath("(//input[@class='form-control'])[5]").sendKeys("425");
		findlocaterbyID("submitBtn").click();

		WebElement printBookConfirm = Findlocaterbyxpath("//h2[text()=' Booking is Confirmed ']");
		System.out.println(printBookConfirm.getText());

		WebElement printHotelName = Findlocaterbyxpath("//p[contains(text(),'Hotel ')]");
		System.out.println(printHotelName.getText());
	}

	private void ModifyTheCheckinDate() {
		Findlocaterbyxpath("//a[@data-testid='username']").click();
		Findlocaterbyxpath("//a[text()='My Account']").click();
		WebElement printBooking = Findlocaterbyxpath("(//div[@class='col-md-5'])[1]");
		System.out.println(printBooking.getText());
		Findlocaterbyxpath("//input[@class='form-control w-50 d-inline-block']").sendKeys("");
		WebElement PrintOrderId = Findlocaterbyxpath("(//div[@class='room-code'])[4]");
		System.out.println(PrintOrderId.getText());
		WebElement PrintBookName = Findlocaterbyxpath("(//h5[text()='Hilton Suite'])[1]");
		System.out.println(PrintBookName.getText());
		WebElement PrintPrice = Findlocaterbyxpath("(//strong[@class='total-prize'])[1]");
		System.out.println(PrintPrice.getText());
		Findlocaterbyxpath("(//button[@class='edit btn filter_btn'])[1]").click();
		Findlocaterbyxpath("//input[@name='check_in']").click();
		Findlocaterbyxpath("//a[@class='ui-state-default ui-state-active']").click();
		Findlocaterbyxpath("//button[text()='Confirm']").click();
		WebElement printUpdateMsg = Findlocaterbyxpath("//li[text()='Booking updated successfully']");
		System.out.println(printUpdateMsg.getText());
	}

	private void CancelOrderId() {

		Findlocaterbyxpath("//a[@data-testid='username']").click();
		Findlocaterbyxpath("//a[text()='My Account']").click();
		WebElement printBooking = Findlocaterbyxpath("(//div[@class='col-md-5'])[1]");
		System.out.println(printBooking.getText());
		Findlocaterbyxpath("//input[@class='form-control w-50 d-inline-block']").sendKeys("");
		WebElement PrintOrderId = Findlocaterbyxpath("(//div[@class='room-code'])[4]");
		System.out.println(PrintOrderId.getText());
		WebElement PrintBookName = Findlocaterbyxpath("(//h5[text()='Hilton Suite'])[1]");
		System.out.println(PrintBookName.getText());
		WebElement PrintPrice = Findlocaterbyxpath("(//strong[@class='total-prize'])[1]");
		System.out.println(PrintPrice.getText());
		Findlocaterbyxpath("(//a[text()='Cancel'])[1]").click();
		AlertClickok();
		WebElement PrintCancel = Findlocaterbyxpath("//li[text()='Your booking cancelled successfully']");
		System.out.println(PrintCancel.getText());
	}

	public static void main(String[] args) throws InterruptedException {
		HotelBooking booking = new HotelBooking();
		booking.Login();
		booking.SearchHotels();
		booking.SelectHotel();
		booking.BookHotel();
		booking.ModifyTheCheckinDate();
		booking.CancelOrderId();
	}

}
