package org.grocery;

import java.io.IOException;

import org.BaseClass.Baseclass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit extends Baseclass {
	@BeforeClass
	public static void launchbrowser() {
		browserLaunch("CHROME");
		enterurl("https://omrbranch.com/");
		maximizewindow();
		implicitWait();
	}

	@Test
	public void booking() throws IOException, InterruptedException {

		// LoginPage
		LoginPage loginpage = new LoginPage();
		loginpage.login(getCellData("Grocery", 1, 1), getCellData("Grocery", 1, 2));

		// Search ProductPage
		SearchProduct searchpage = new SearchProduct();
		Assert.assertEquals("verify welcome msg", getCellData("Verification Text", 1, 0), searchpage.welcomeMsg());
		searchpage.clearcart();
		Thread.sleep(3000);
		searchpage.searchProduct(getCellData("Grocery", 1, 3));

		// ProductListPage
		ProductListPage productpage = new ProductListPage();
		Assert.assertEquals("verify search Msg", getCellData("Verification Text", 1, 1),
				productpage.searchResultText());
		productpage.productlist();
		Thread.sleep(4000);

		// My Cart Page
		MyCart mycartpage = new MyCart();
		Assert.assertEquals("verify my cart", getCellData("Verification Text", 1, 2), mycartpage.myCartText());
		Assert.assertEquals("verify address msg", getCellData("Verification Text", 1, 3),
				mycartpage.deliveryAddressText());
		mycartpage.addressmethod(3, getCellData("Grocery", 1, 4), getCellData("Grocery", 1, 5),
				getCellData("Grocery", 1, 6), getCellData("Grocery", 1, 7), getCellData("Grocery", 1, 8), 35, "Salem",
				getCellData("Grocery", 1, 9));

		Thread.sleep(2000);

		Assert.assertEquals("Verify payment Msg", getCellData("Verification Text", 1, 4),
				mycartpage.paymentMethodText());
		mycartpage.paymentMethod(1, getCellData("Grocery", 1, 10), 1, 1, getCellData("Grocery", 1, 11));
		mycartpage.placeOrder();

		// Order Conform Page
		OrderConfirmation orderconfrmpage = new OrderConfirmation();
		Assert.assertEquals("verify orderconfirm msg", getCellData("Verification Text", 1, 5),
				orderconfrmpage.orderDetails());
		orderconfrmpage.orderId("Grocery", 1, 12);

	}

}
