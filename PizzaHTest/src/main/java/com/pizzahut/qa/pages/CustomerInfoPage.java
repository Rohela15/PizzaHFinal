package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class CustomerInfoPage extends TestBase{
	
	@FindBy(id="firstName")
	WebElement Fname;

	@FindBy(id="lastName")
	WebElement Lname;

	
	@FindBy(id="emailAddress")
	WebElement Eaddress;

	
	@FindBy(id="phoneNumber")
	WebElement Pnumber;
	
	@FindBy(id="phoneExtension")
	WebElement Extn;
	
	@FindBy(id="ph-co-2-continue")
	WebElement CtntoPayment;
	
	public CustomerInfoPage() {
		PageFactory.initElements(driver, this);
}
	
	public PaymentPage EntercustinfoEnterPaymentPage() {
		Fname.sendKeys("Tom");
		Lname.sendKeys("Henry");
		Eaddress.sendKeys("tom@abc.com");
		Pnumber.sendKeys("4254569877");
		Extn.sendKeys("1");
		CtntoPayment.click();
		
		return new PaymentPage();
		
	}
}
