package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class DealPage extends TestBase{
	HomePage homepage;
	
	@FindBy(xpath="//div[@class='col-xs-12 f-icon']//a[@class='red-facebook-icon img-circle']")
	WebElement facebookIcon;
	
	@FindBy(xpath="//div[@class='col-xs-12 f-icon']//a[@class='red-twitter-icon img-circle']")
	WebElement twitterIcon;
	
	@FindBy(id="productATO0")
	WebElement deal1option;
	
	
	
public DealPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyFBIcon() {
		 facebookIcon.click();
		
	}
	public boolean verifyTwitterIcon() {
		return twitterIcon.isDisplayed();
		
	}
	
	public OptionsPage clickOnDealsOption() {
		deal1option.click();
		return new OptionsPage();
	}
	
}
