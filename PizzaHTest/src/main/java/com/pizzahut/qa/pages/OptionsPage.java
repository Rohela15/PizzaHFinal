package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class OptionsPage extends TestBase {
	
	
	
	@FindBy(xpath="//h1[@class='ph-margin-bottom-0 ph-margin-left-15 hidden-xs']")
	//@CacheLookup
	WebElement FindStoreText;
	
	@FindBy(id="find-occasion-delivery")
	WebElement DeliveryBtn;
	
	@FindBy(id="syo-address1")
	WebElement address1 ;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="zip-input")
	WebElement zipCode;
	
	@FindBy(id="ph-find-store")
	WebElement findStoreBtn;
	
	@FindBy(id="find-occasion-carryout")
	WebElement carryoutBtn;
	
	@FindBy(xpath="//a[@class='btn ph-ordernow ng-scope btn-primary']")
	WebElement OrderNow;
	@FindBy(id="modal-button-OK")
	WebElement Accept;
	
	//initialising pagefactory using constructor n page factory
	
public OptionsPage() {
	PageFactory.initElements(driver, this);
	
}
//Actions

public boolean verifyOptionPageText() {
 return FindStoreText.isDisplayed();
}

//below action return title,but here title isn't changed
public String ValidateOptionPageTitle() {
	return driver.getTitle();
}

public boolean ValidateDeliverybutton() {
	return DeliveryBtn.isEnabled();
	
}
public boolean ValidateCarryOutButton() {
	return carryoutBtn.isEnabled();
	
}
public ToppingsSelectionPage verifyAddressInputEnterToppingPage(String add,String add2,String cty,String ste,String zip) {
	DeliveryBtn.click();
	address1.sendKeys(add);
	address2.sendKeys(add2);
	city.sendKeys(cty);
	state.sendKeys(ste);
	zipCode.sendKeys(zip);
	findStoreBtn.click();
	OrderNow.click();
	Accept.click();
	return new ToppingsSelectionPage();
	
}


}

