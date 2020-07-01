package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.CarryoutPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzhut.qa.base.TestBase;

public class CarryoutPageTest extends TestBase {
	
	HomePage homePage;
	PizzaPage pizzaPage;
	OrderPage orderPage;
	CarryoutPage carryoutPage;
	
	public CarryoutPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePage();
		pizzaPage = new PizzaPage();
		orderPage = new OrderPage();
		carryoutPage = new CarryoutPage();	
		
	}
	
	@Test(priority=1)
	public void validateZipCodeLink() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
		boolean zipcodetab = carryoutPage.validatezipCodeTab();
		Assert.assertTrue(zipcodetab);
	}
	
	@Test(priority=2)
	public void enterZipCode() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
		carryoutPage.enterValueInZipCodeLink();
	}
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
