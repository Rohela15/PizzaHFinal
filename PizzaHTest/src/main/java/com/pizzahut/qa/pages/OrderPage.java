package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class OrderPage extends TestBase {
	
	@FindBy(id="add-more-food-top-os")
	WebElement addmorefoodbtn;
	
	@FindBy(id="checkout-top-os")
	WebElement CheckoutBtn;
	
	@FindBy(xpath="//span[@class='center-block icon-carryout-default']")
	WebElement checkoutButton;

	public OrderPage() {
		PageFactory.initElements(driver, this);
}
	
	public SignInPage SelectCheckoutbuttonEnterSignInPage() {
		CheckoutBtn.click();
		return new SignInPage();
	}
	
	public boolean validateCheckoutButton() {
		return checkoutButton.isDisplayed();
	}
}


