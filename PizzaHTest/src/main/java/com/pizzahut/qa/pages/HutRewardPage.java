package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class HutRewardPage extends TestBase {

	@FindBy(id = "ph-hutrewards-welcome")
	WebElement text;

	@FindBy(id = "ph-sign-in")
	WebElement signInButton;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpLink;



	public HutRewardPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyRewardPageTitle() {	
		return driver.getTitle();
	}

	public boolean rewardPageText() {
		return text.isEnabled();
	}

	public boolean verifySignInButton() {
		return signInButton.isDisplayed();
	}

	public boolean verifySignUpLink() {
		return signUpLink.isEnabled();
	}


}
