package org.grocery;

import java.util.List;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends Baseclass {
	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txtwelcome;

	@FindBy(xpath = "//input[@id='search']")
	private WebElement txtsearch;

	@FindBy(xpath = "//span[@class='cart badge badge-xs badge-danger position-relative mr-0 cart_count']")
	private WebElement cartproductcount;

	@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
	private WebElement clkcart;

	@FindBy(xpath = "//div[@class='scheduleClose']")
	private List<WebElement> clearcart;

	public WebElement getCartproductcount() {
		return cartproductcount;
	}

	public WebElement getClkcart() {
		return clkcart;
	}

	public List<WebElement> getClearcart() {
		return clearcart;
	}

	public WebElement getTxtwelcome() {
		return txtwelcome;
	}

	public WebElement getTxtsearch() {
		return txtsearch;
	}

	public String welcomeMsg() {
		String welcome = elementGetText(txtwelcome);
		return welcome;

	}

	public String clearcart() {
		String count = elementGetText(cartproductcount);
		String a = "0";
		if (count != a) {
			elementClick(clkcart);
			for (WebElement Cancel : clearcart) {
				elementClick(Cancel);
			}
		}
		return count;
	}

	public void searchProduct(String productname) {
		elementsendkeysEnter(txtsearch, productname);

	}

}