package com.pizzahut.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.pizzhut.qa.base.TestBase;

public class PizzaPage extends TestBase {
	
	@FindBy(xpath="//h1[@class='ph-jumbo ph-margin-left ng-binding']")
	WebElement pizzaTitle;
	
	@FindBy(xpath="//div[@id='tile-cheese-pizza']//a[@class='btn btn-primary btnModal']")
	WebElement orderNowButton;
	
	
	//Initializing the Page Objects
	
	public PizzaPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatepizzaTitle() {
		return pizzaTitle.isDisplayed();
		
	}	
	
	public boolean validateOrderButton() {
		return orderNowButton.isDisplayed();
	}
	
	public OrderPage clickOnOrderNowButton() {
		orderNowButton.click();
		return new OrderPage();
	}

}
