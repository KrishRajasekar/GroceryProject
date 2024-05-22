package org.grocery;

import java.io.IOException;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation extends Baseclass {
	public OrderConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Order Details']")
	private WebElement txtorderdetails;

	@FindBy(xpath = "(//span[@class='font16 fontNormal color36'])[1]")
	private WebElement txtorderid;

	public WebElement getTxtorderdetails() {
		return txtorderdetails;
	}

	public WebElement getTxtorderid() {
		return txtorderid;
	}

	public String orderDetails() {
		String orderdetail = elementGetText(txtorderdetails);
		return orderdetail;

	}

	public String orderId(String sheetname, int rownum, int cellnum) throws IOException {
		String orderid = elementGetText(txtorderid);
		CreateCellAndSetCellData(sheetname, rownum, cellnum, orderid);
		return orderid;

	}
}
