package org.grocery;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
	
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="email")
		private WebElement txtusername;
		
		@FindBy(id="pass")
		private WebElement txtpass;
		
		@FindBy(xpath="//button[text()='Login']")
		private WebElement clklogin;

		public WebElement getTxtusername() {
			return txtusername;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getClklogin() {
			return clklogin;
		}
		
		public void login(String username,String password) {
			elementsendkeys(txtusername,username);
			elementsendkeys(txtpass, password);
			elementClick(clklogin);
			
		}
		

	}



