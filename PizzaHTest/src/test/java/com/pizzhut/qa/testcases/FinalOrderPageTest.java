package com.pizzhut.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.CarryoutPage;
import com.pizzahut.qa.pages.FinalOrderPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzhut.qa.base.TestBase;

import junit.framework.Assert;

public class FinalOrderPageTest extends TestBase{
	HomePage homePage;
	PizzaPage pizzaPage;
	OrderPage orderPage;
	CarryoutPage carryoutPage;
	FinalOrderPage finalOrderPage;
	
	public FinalOrderPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePage();
		pizzaPage = new PizzaPage();
		orderPage = new OrderPage();
		carryoutPage = new CarryoutPage();
		finalOrderPage = new FinalOrderPage();
		
	}
	
	@Test(priority=1)
	public void validateFinalOrderLink() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
		carryoutPage.enterValueInZipCodeLink();
		boolean order = finalOrderPage.validateFinalOrderLink();
		Assert.assertTrue(order);
	}
	
	@Test(priority=2)
	public void clickOnFinalOrderTab() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
		carryoutPage.enterValueInZipCodeLink();
		finalOrderPage.clickOnOrderButton();
		finalOrderPage.clickOnOk();
	}
	
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
