package com.pizzhut.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.CarryoutPage;
import com.pizzahut.qa.pages.FinalOrderPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzhut.qa.base.TestBase;

public class PizzaPageTest extends TestBase {
	HomePage homePage;
	PizzaPage pizzaPage;
	OrderPage orderPage;
	CarryoutPage carryoutPage;
	FinalOrderPage finalOrderPage;
	
	public PizzaPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		homePage=new HomePage();
		pizzaPage=new PizzaPage();
		orderPage=new OrderPage();
		carryoutPage = new CarryoutPage();
		finalOrderPage = new FinalOrderPage();
		
	}
	
	@Test(priority=1)
	public void validatePizzaTitle() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		boolean title=pizzaPage.validatepizzaTitle();
		Assert.assertTrue(title);
	}
	
	@Test(priority=2)
	public void validateOrderButtonTest() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		boolean orderButton = pizzaPage.validateOrderButton();
		Assert.assertTrue(orderButton);
	}
	
	@Test(priority=3)
	public void clickOnOrderButton() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
	}
	
	@Test
	public void clickOnAddOrderButton() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
		carryoutPage.enterValueInZipCodeLink();
		finalOrderPage.clickOnOrderButton();
		finalOrderPage.clickOnOk();
		pizzaPage.clickOnAddOrder();
	}
		
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

	
	

}
