package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class AddMoreFoodPage extends TestBase {
	
	@FindBy(id="view-order-top-upsell")
	WebElement ViewOrderBtn;
	
	public AddMoreFoodPage() {
		PageFactory.initElements(driver, this);

}
	public OrderPage SelectViewOrderEnterOrderPage() {
		ViewOrderBtn.click();
		return new OrderPage();
	}
}
