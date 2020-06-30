package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.AddMoreFoodPage;
import com.pizzahut.qa.pages.CarryoutPage;
//import com.pizzahut.qa.pages.CheckOutPage;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzahut.qa.pages.SignInPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;

public class OrderPageTest extends TestBase {
	HomePage homePage;
	DealPage dealPage;
	OptionsPage optionsPage ;
	ToppingsSelectionPage toppingpage;
	AddMoreFoodPage addmorefoodpage;
	OrderPage orderpage;
	SignInPage signinpage;
	PizzaPage pizzaPage;
	OrderPage orderPage;
	CarryoutPage carryoutPage;
	

	public OrderPageTest() {
		super();

}
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		dealPage = new DealPage();
	 optionsPage = new OptionsPage();
	pizzaPage = new PizzaPage();
	orderPage = new OrderPage();
	carryoutPage = new CarryoutPage();
}
	
	@Test
	public void SelectCheckoutbuttonEnterSignInPageTest() {
		dealPage=homePage.clickOnDealsLinks();
		 optionsPage=dealPage.clickOnDealsOption();
		 toppingpage= optionsPage.selectcarryoutEnterToppingPage();
		 addmorefoodpage=toppingpage.SelectToppingsEnterAddMorePage();
		orderpage=addmorefoodpage.SelectViewOrderEnterOrderPage() ;
		signinpage=orderpage.SelectCheckoutbuttonEnterSignInPage();
	}
	
	
	@Test(priority=1)
	public void verifyFindStoreTitle() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		boolean findStoreTitle = orderPage.verifyFindStoreTitle();
		Assert.assertTrue(findStoreTitle);
	}
	
	@Test(priority=2)
	public void validateCarryoutLink() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		boolean carryout = orderPage.validateCarryoutLink();
		Assert.assertTrue(carryout);
	}
	
	@Test(priority=3)
	public void clickOnCarryoutLink() {
		homePage.clickOnMenuLink();
		pizzaPage=homePage.clickOnPizzaLink();
		orderPage=pizzaPage.clickOnOrderNowButton();
		carryoutPage=orderPage.clickOnCarryoutLink();
	}
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}
	
	
}
