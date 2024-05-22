package org.grocery;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyCart extends Baseclass {
	
		public MyCart() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//h5[text()='My Cart']")
		private WebElement txtmycart;
		
		@FindBy(xpath="//div[text()='Delivery Address']")
		private WebElement txtdeliveryaddress;
		
		@FindBy(xpath="//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']")
		private WebElement clkaddress;
		
		@FindBy(xpath="//select[@id='address_type']")
		private WebElement ddnaddresstype;
		
		@FindBy(xpath="(//input[@name='first_name'])[1]")
		private WebElement txtfirstname;
		
		@FindBy(xpath="(//input[@name='last_name'])[1]")
		private WebElement txtlastname;
		
		@FindBy(xpath="//input[@name='mobile']")
		private WebElement txtmobile;
		
		@FindBy(xpath="//input[@name='apartment']")
		private WebElement txthouseno;
		
		@FindBy(xpath="//input[@name='address']")
		private WebElement txtaddress;
		
		@FindBy(xpath="//select[@name='state']")
		private WebElement state;
		
		@FindBy(xpath="//select[@name='city']")
		private WebElement txtcity;
		
		@FindBy(xpath="//input[@name='zipcode']")
		private WebElement txtpincode;

		@FindBy(xpath="(//button[text()='Save'])[3]")
		private WebElement save;
		
		@FindBy(xpath="//div[text()='  Payment Method ']")
		private WebElement txtpaymentmethod;
		
		@FindBy(xpath="//select[@id='payment_type']")
		private WebElement payementtype;
		
		@FindBy(xpath="//label[text()=' Visa ']")
		private WebElement visa;
		
		@FindBy(xpath="//input[@name='card_no']")
		private WebElement txtcardno;
		
		@FindBy(xpath="//select[@id='month']")
		private WebElement month;
		
		@FindBy(xpath="//select[@id='year']")
		private WebElement year;
		
		@FindBy(xpath="//input[@name='cvv']")
		private WebElement txtcvv;
		
		@FindBy(xpath="//button[@id='placeOrder']")
		private WebElement clkplaceorder;

		public WebElement getTxtmycart() {
			return txtmycart;
		}
		public WebElement getTxtdeleiveryaddress() {
			return txtdeliveryaddress;
		}
		public WebElement getClkaddress() {
			return clkaddress;
		}
		public WebElement getDdnaddresstype() {
			return ddnaddresstype;
		}
		public WebElement getTxtfirstname() {
			return txtfirstname;
		}
		public WebElement getTxtlastname() {
			return txtlastname;
		}
		public WebElement getTxtmobile() {
			return txtmobile;
		}
		public WebElement getTxthouseno() {
			return txthouseno;
		}
		public WebElement getTxtaddress() {
			return txtaddress;
		}
		public WebElement getDdnstate() {
			return state;
		}
		public WebElement getDdncity() {
			return txtcity;
		}
		public WebElement getTxtzipcode() {
			return txtpincode;
		}
		public WebElement getClksave() {
			return save;
		}
		public WebElement getTxtpaymentmethod() {
			return txtpaymentmethod;
		}
		public WebElement getDdnpaymenttype() {
			return txtpaymentmethod;
		}
		public WebElement getClkvisa() {
			return visa;
		}
		public WebElement getTxtcardno() {
			return txtcardno;
		}
		public WebElement getDdnmonth() {
			return month;
		}
		public WebElement getDdnyear() {
			return year;
		}
		public WebElement getTxtcvv() {
			return txtcvv;
		}
		public WebElement getClkplaceorder() {
			return clkplaceorder;
		}
		public String myCartText() {
			String mycart = elementGetText(txtmycart);
	        return mycart;
		}
		public String deliveryAddressText() {
			String elementGetText = elementGetText(txtdeliveryaddress);
			return elementGetText;
		}
		public void addressmethod(int indexaddtype,String firstname,String lastname,String mobile,
				String houseno,String address,int indexstate,String city,String zipcode) {
			elementClick(clkaddress);
			SelectBYIndex(ddnaddresstype, indexaddtype);
			elementsendkeys(txtfirstname, firstname);
			elementsendkeys(txtlastname, lastname);
			elementsendkeys(txtmobile, mobile);
			elementsendkeys(txthouseno, houseno);
			elementsendkeys(txtaddress, address);
			SelectBYIndex(state, indexstate);
			SelectByVisisbilityText(txtcity, city);
			elementsendkeys(txtpincode, zipcode);
			elementClick(save);		
		}
		public String paymentMethodText() {
			String paymentmethod = elementGetText(txtpaymentmethod);
			return paymentmethod;

		}
		public void paymentMethod(int index,String cardno,int indexmonth,int indexyear,String cvv) {
			SelectBYIndex(payementtype, index);
			elementClick(visa);
			elementsendkeys(txtcardno, cardno);
			SelectBYIndex(month, indexmonth);
			SelectBYIndex(year, indexyear);
			elementsendkeys(txtcvv, cvv);
		}	
		public void placeOrder() {
			
			elementClick(clkplaceorder);

		}
		
}