package com.pizzhut.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.AddMoreFoodPage;
import com.pizzahut.qa.pages.CheckOutPage;
import com.pizzahut.qa.pages.CustomerInfoPage;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.OrderPage;
import com.pizzahut.qa.pages.PaymentPage;
import com.pizzahut.qa.pages.SignInPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;


public class CustomerInfoPageTest extends TestBase {
	
	HomePage homePage;
	DealPage dealPage;
	OptionsPage optionsPage ;
	ToppingsSelectionPage toppingpage;
	AddMoreFoodPage addmorefoodpage;
	OrderPage orderpage;
	CheckOutPage checkoutpage;
	SignInPage signinpage;
	CustomerInfoPage customerinfopage;
	PaymentPage paymentpage;

	public CustomerInfoPageTest() {
		super();

}
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		dealPage = new DealPage();
	 optionsPage = new OptionsPage();
	 
	 dealPage=homePage.clickOnDealsLinks();
	 optionsPage=dealPage.clickOnDealsOption();
	 toppingpage= optionsPage.selectcarryoutEnterToppingPage();
	 addmorefoodpage=toppingpage.SelectToppingsEnterAddMorePage();
	orderpage=addmorefoodpage.SelectViewOrderEnterOrderPage() ;
	signinpage=orderpage.SelectCheckoutbuttonEnterSignInPage();
	customerinfopage=signinpage.SelectCtnAsGuestBtnEnterCustomerInfoPagee();
	
}
	
	@Test
	public void EntercustinfoEnterPaymentPageTest() {
		paymentpage=customerinfopage.EntercustinfoEnterPaymentPage();
		

}
}
