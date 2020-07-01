package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(id= "lg-nav-menu")
	WebElement menuButton;
	
	@FindBy(xpath= "//div[@class='btn-group btn-group-lg dropdown']")
	WebElement menuLink;
	
	@FindBy(id="lg-nav-pizza")
	WebElement pizzaLink;
	
	@FindBy(id="lg-nav-P'Zone")
	WebElement pzoneLink;
	
	@FindBy(id="lg-nav-wings")
	WebElement wingsLink;
	
	@FindBy(id="lg-nav-sides")
	WebElement sidesLink;
	
	@FindBy(id="lg-nav-pasta")
	WebElement pastaLink;
	
	@FindBy(id="lg-nav-desserts")
	WebElement dessertLink;
	
	@FindBy(id="lg-nav-drinks")
	WebElement drinksLink;
	
	@FindBy(id= "lg-nav-deals")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[text()='join']")
	WebElement joinLink;
	
	@FindBy(xpath="//a[@id='ph-hutrewards-link']")
	WebElement hutRewardLink;
	
	@FindBy(xpath="//span[contains(text(),'sign in')]")
	WebElement Signin;
	
	
	//Initializing the page object
	
	public HomePage() {
		PageFactory.initElements(driver, this); //we can also write this to refer current class object
		}
	
	public HomePage clickOnMenuLink() {
		menuLink.click();
		return new HomePage();
		
	}
	
	public boolean validateMenuLink() {
		return menuLink.isEnabled();
	}
	
	public boolean validatePizzaLink() {
		return pizzaLink.isDisplayed();
	}
	
	public PizzaPage clickOnPizzaLink() {
		pizzaLink.click();
		return new PizzaPage();
	}
	
	public boolean validatePzoneLink() {
		return pzoneLink.isEnabled();
	}
	
	public void clickOnPzoneLink() {
		pzoneLink.click();		
	}
	
	public boolean validateWingsLink() {
		return wingsLink.isEnabled();
	}
	
	public void clickOnWingsLink() {
		wingsLink.click();
		
	}
	
	public boolean validateSidesLink() {
		return sidesLink.isEnabled();
	}
	
	public void clickOnSidesLink() {
		sidesLink.click();
		
	}
	
	public boolean validatePastaLink() {
		return pastaLink.isEnabled();
	}
	
	public void clickOnPastaLink() {
		pastaLink.click();
		
	}
	
	public boolean validateDessertsLink() {
		return dessertLink.isEnabled();
	}
	
	public void clickOnDessertPage() {
		dessertLink.click();
		
	}
	
	public boolean validateDrinksLink() {
		return drinksLink.isEnabled();
	}
	
	public void clickOnDrinksPage() {
		drinksLink.click();
		
	}
		
	
	//no void as it will return new dealpage
	public DealPage clickOnDealsLinks() {
		dealsLink.click();
		return new DealPage();
	}
	
	public JoinPage clickJoinLink() {
		joinLink.click();
		return new JoinPage();
	}
	
	public HutRewardPage clickOnRewardLink() {
		hutRewardLink.click();
		return new HutRewardPage();
	}
	public LoginPage clickOnSingInButton() {
		Signin.click();
		return new LoginPage();
	}
	
	
}
