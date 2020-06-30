package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class FinalOrderPage extends TestBase{
	
	
	@FindBy(xpath="//a[@class='btn ph-ordernow ng-scope btn-primary']")
	WebElement finalOrder;
	
	@FindBy(id="modal-button-OK")
	WebElement ok;
	
	//Initializing the page objects
	
	public FinalOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateFinalOrderLink() {
		return finalOrder.isEnabled();
	}
	
	public void clickOnOrderButton() {
		finalOrder.click();
	}
	
	public void clickOnOk() {
		ok.click();
	}

}
