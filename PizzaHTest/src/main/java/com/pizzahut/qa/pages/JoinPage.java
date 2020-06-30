package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class JoinPage extends TestBase {
	HomePage homepage;
	JoinPage joinPage;
	String sheetName = "Join";

	@FindBy(name = "eMailAddress")
	WebElement email;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(name = "confirmPassword")
	WebElement cpwd;

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phoneNumber")
	WebElement phn;

	@FindBy(id = "zipcode")
	WebElement zipcode;

	@FindBy(xpath = "//div[@class='col-xs-12 f-icon']//a[@class='red-facebook-icon img-circle']")
	WebElement FBicon;

	@FindBy(xpath = "//div[@class='col-xs-12 f-icon']//a[@class='red-twitter-icon img-circle']")
	WebElement twitterIcon;
	
	@FindBy(id ="create-account")
	WebElement createAccButton;

	public JoinPage() {
		PageFactory.initElements(driver, this);
	}

	public void createNewAccount(String eml, String pass, String cfpwd, String fname, String lname, String pno,
			String zip) {
		email.sendKeys(eml);
		pwd.sendKeys(pass);
		cpwd.sendKeys(cfpwd);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		phn.sendKeys(pno);
		zipcode.sendKeys(zip);

	}

	public FacebookPage verifyFBIcon() {
		FBicon.click();
		return new FacebookPage();

	}
	public boolean verifyCreateAccButton() {
		return createAccButton.isDisplayed();
	}

	public TwitterPage verifyTwitterIcon() {
		twitterIcon.click();
		return new TwitterPage();
	}
	public void negetiveScenario() {
		email.sendKeys("shetabhakti@yahoo.com");
		createAccButton.click();
	}
}
