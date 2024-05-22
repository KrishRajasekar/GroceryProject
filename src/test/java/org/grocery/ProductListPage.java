package org.grocery;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends Baseclass {
	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Search Result - Nuts']")
	private WebElement txtSearchResults;
	
	@FindBy(xpath="(//a[text()='Add'])[1]")
	private WebElement clkfirstproduct;
	
	@FindBy(xpath="//button[@id='cart-21']")
	private WebElement clkfirstvariant;
	
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement clkgotocart;

	public WebElement getTxtSearchResults() {
		return txtSearchResults;
	}

	public WebElement getClkfirstproduct() {
		return clkfirstproduct;
	}

	public WebElement getClkfirstvariant() {
		return clkfirstvariant;
	}

	public WebElement getClkgotocart() {
		return clkgotocart;
	}
	
	public String searchResultText() {
		String searchResult = elementGetText(txtSearchResults);
		return searchResult;
	}
	public void firstproduct() {
		elementClick(clkfirstproduct);
	}
	public void firstVariant() {
		elementClick(clkfirstvariant);	
   }
	public void goToCart() {
		elementClick(clkgotocart);
	}	
	
	public void productlist() throws InterruptedException {
		Thread.sleep(3000);
		elementClick(clkfirstproduct);
		elementClick(clkfirstvariant);
		Thread.sleep(3000);
		elementClick(clkgotocart);
}
}
	


