package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class ToppingsSelectionPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"option-2-P-\"]/div/div[2]/div/div/h4/span[1]")
	WebElement CrustBtn;
	
	@FindBy(xpath="//span[contains(text(),'TOPPINGS')]")
	WebElement ToppingBtn;
	
	@FindBy(xpath="//span[contains(text(),'Veggies')]")
	WebElement VeggiesBtn;
	
	@FindBy(xpath="//div[@id='option-2-M-V']//div[@class='clearfix pb-opleft crust-pb-topping-select pb-opleft-toppings']")
	WebElement MushroomBtn;
	
	@FindBy(xpath="//span[contains(text(),'Roasted Spinach')]")
	WebElement SpinachBtn;
	
	@FindBy(id="pb-primary-cta-deal")
	WebElement ContinueBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-block text-transform-none ng-binding']")
	WebElement AddExtraCheeseBtn;
	
	public ToppingsSelectionPage() {
		PageFactory.initElements(driver, this);
	
		

}

	public AddMoreFoodPage SelectToppingsEnterAddMorePage() {
		CrustBtn.click();
		ToppingBtn.click();
		VeggiesBtn.click();
		MushroomBtn.click();
		SpinachBtn.click();
		ContinueBtn.click();
		AddExtraCheeseBtn.click();
		return new AddMoreFoodPage();
	}
}
