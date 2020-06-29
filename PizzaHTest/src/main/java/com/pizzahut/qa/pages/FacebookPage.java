package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pizzhut.qa.base.TestBase;

public class FacebookPage extends TestBase {

	HomePage homePage;
	JoinPage joinpPage;
	FacebookPage facebookPage;

	@FindBy(xpath = "//a[@class='_2dgj']")
	WebElement logo;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "pass")
	WebElement pwd;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement login;

	@FindBy(xpath = "//div[@id='blueBarDOMInspector']//div//div//div//div//h1//a//i")
	WebElement facebookText;

	public FacebookPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateFBpageTitle() {
		return driver.getTitle();

	}

	public void loginFbPage() {
		email.sendKeys("shetabhakti@yahoo.com");
		pwd.sendKeys("abc123");
		login.click();
	}

	public boolean verifyfacebookLogo() {
		return facebookText.isDisplayed();
	}
}
