package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class CarryoutPage extends TestBase {
	
		@FindBy(name="carryOutZip")
		WebElement zipcode;
		
		@FindBy(id="ph-find-store")
		WebElement findAStore;
	
	
	//Initializing the page objects
	public CarryoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatezipCodeTab() {
		return zipcode.isEnabled();
	}
	
	public FinalOrderPage enterValueInZipCodeLink() {
		zipcode.sendKeys("60107");
		findAStore.click();
		return new FinalOrderPage();
	}
	
	

}
