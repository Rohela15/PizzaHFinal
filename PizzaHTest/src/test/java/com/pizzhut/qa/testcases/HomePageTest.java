package com.pizzhut.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzahut.qa.pages.PizzaPage;

import com.pizzhut.qa.base.TestBase;

public class HomePageTest extends TestBase {

	HomePage homePage;	
	DealPage dealPage;
	JoinPage joinPage;
	HutRewardPage hutrewardPage;
	PizzaPage pizzaPage;	
	
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		homePage = new HomePage();
		pizzaPage = new PizzaPage();		
		dealPage = new DealPage();
		joinPage = new JoinPage();
		hutrewardPage = new HutRewardPage();	

	}

	@Test

	public void dealsLinkTest() {
		dealPage = homePage.clickOnDealsLinks();
		// Assert.assertTrue(b);
	}

	@Test
	public void joinLinkTest() {
		joinPage = homePage.clickJoinLink();
	}

	@Test
	public void rewardLinkTest() {
		hutrewardPage = homePage.clickOnRewardLink();
	}
	
	@Test(priority=1)
	public void menuValidationTest() {
		boolean menu = homePage.validateMenuLink();
		Assert.assertTrue(menu);
		
	}
	
	@Test(priority=2)
	public void pizzaLinkTest() {
		homePage.clickOnMenuLink();
		boolean pizza = homePage.validatePizzaLink();
		Assert.assertTrue(pizza);
		pizzaPage=homePage.clickOnPizzaLink();
			
	}
	
	@Test(priority=3)
	public void pzoneLinkTest() {
		homePage.clickOnMenuLink();		
		boolean pzone = homePage.validatePzoneLink();
		Assert.assertTrue(pzone);		
		homePage.clickOnPzoneLink();		
	}
	
	@Test(priority=4)
	public void wingsLinkTest() {
		homePage.clickOnMenuLink();		
		boolean wings = homePage.validateWingsLink();
		Assert.assertTrue(wings);		
		homePage.clickOnWingsLink();		
	}
	
	@Test(priority=5)
	public void sidesLinkTest() {
		homePage.clickOnMenuLink();	
		boolean sides = homePage.validateSidesLink();
		Assert.assertTrue(sides);		
		homePage.clickOnSidesLink();		
	}
	
	@Test(priority=6)
	public void pastaLinkTest() {
		homePage.clickOnMenuLink();	
		boolean pasta = homePage.validatePastaLink();
		Assert.assertTrue(pasta);		
		homePage.clickOnPastaLink();		
	}
	
	@Test(priority=7)
	public void dessertLinkTest() {
		homePage.clickOnMenuLink();	
		boolean dessert = homePage.validateDessertsLink();
		Assert.assertTrue(dessert);
		homePage.clickOnDessertPage();
	}
	
	@Test(priority=8)
	public void drinksLinkTest() {
		homePage.clickOnMenuLink();	
		boolean drinks = homePage.validateDrinksLink();
		Assert.assertTrue(drinks);
		homePage.clickOnDrinksPage();
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
