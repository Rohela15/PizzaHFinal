package com.pizzhut.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzhut.qa.base.TestBase;

public class PizzaPageTest extends TestBase {
	HomePage homePage;
	PizzaPage pizzaPage;
	OrderPage orderPage;
	
	public PizzaPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		homePage=new HomePage();
		pizzaPage=new PizzaPage();
		orderPage=new OrderPage();
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		
		
	}
	
	@Test(priority=1)
	public void validatePizzaTitle() {
		
		boolean title=pizzaPage.validatepizzaTitle();
		Assert.assertTrue(title);
	}
	
	@Test(priority=2)
	public void validateOrderButtonTest() {
		
		boolean orderButton = pizzaPage.validateOrderButton();
		Assert.assertTrue(orderButton);
	}
	
	@Test(priority=3)
	public void clickOnOrderButton() {
		
		orderPage=pizzaPage.clickOnOrderNowButton();
	}
		
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

	
	

}
