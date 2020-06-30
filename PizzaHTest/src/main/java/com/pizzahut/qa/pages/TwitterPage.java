package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class TwitterPage extends TestBase {

	HomePage homePage;
	JoinPage joinpPage;
	TwitterPage twitterPage;

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement twitterLogo;

	public TwitterPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTitle() {
		return TwitterPage.driver.getTitle();
	}

	public boolean verifytwitterLogo() {
		return twitterLogo.isDisplayed();
	}

	public void verifyURL() {
		String url = TwitterPage.driver.getCurrentUrl();
		System.out.println(url);

	}

}
