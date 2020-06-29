package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class DealPage extends TestBase {
	HomePage homepage;

	@FindBy(xpath = "//div[@class='col-xs-12 f-icon']//a[@class='red-facebook-icon img-circle']")
	WebElement facebookIcon;

	@FindBy(xpath = "//div[@class='col-xs-12 f-icon']//a[@class='red-twitter-icon img-circle']")
	WebElement twitterIcon;

	@FindBy(id = "productATO0")
	WebElement deal1option;
<<<<<<< HEAD

	public DealPage() {
=======
	
	@FindBy(id="productATO1")
	WebElement deal2option;
	
	@FindBy(id="productATO2")
	WebElement deal3option;
	
	@FindBy(id="productATO3")
	WebElement deal4option;
	
	@FindBy(id="productATO4")
	WebElement deal5option;
	
	@FindBy(id="productATO5")
	WebElement deal6option;
	
	@FindBy(id="productATO6")
	WebElement deal7option;
	
	
	
	
public DealPage() {
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
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

	public void checkDealOptions() {
		checkdealoptionbuttonsenabled(deal1option);
		checkdealoptionbuttonsenabled(deal2option);
		checkdealoptionbuttonsenabled(deal3option);
		checkdealoptionbuttonsenabled(deal4option);
		checkdealoptionbuttonsenabled(deal5option);
		checkdealoptionbuttonsenabled(deal6option);
		checkdealoptionbuttonsenabled(deal7option);
	}
	
	public void checkdealoptionbuttonsenabled(WebElement element) {
		System.out.println("********" + element + " in Deal ********");
        System.out.println("Displayed : " + element.isDisplayed());
        System.out.println("Enabled : " + element.isEnabled());
        System.out.println("Selected : " + element.isSelected());
	}

}
