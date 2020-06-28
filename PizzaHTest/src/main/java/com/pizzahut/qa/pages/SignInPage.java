package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class SignInPage extends TestBase {
	@FindBy(id="co-guest-login")
	WebElement CtnAsGuestBtn;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);

}
	
	public CustomerInfoPage SelectCtnAsGuestBtnEnterCustomerInfoPagee() {
		CtnAsGuestBtn.click();
		return new CustomerInfoPage();
}
}
