package com.pizzhut.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.AddMoreFoodPage;
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
	
	
	
}
