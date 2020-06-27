package com.pizzhut.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.AddMoreFoodPage;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;

public class ToppingsSelectionPageTest extends TestBase {

	
	
	HomePage homePage;
	DealPage dealPage;
	OptionsPage optionsPage ;
	ToppingsSelectionPage toppingpage;
	AddMoreFoodPage addmorefoodpage;
	
	
	
	public ToppingsSelectionPageTest() {
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
	 toppingpage= optionsPage.verifyAddressInputEnterToppingPage(prop.getProperty("address1"), prop.getProperty("address2"), prop.getProperty("city"), prop.getProperty("state"), prop.getProperty("zipcode"));
	
}
	@Test
	public void SelectToppingsEnterAddMorePageTest() {
		addmorefoodpage=toppingpage.SelectToppingsEnterAddMorePage();
	}
	
	@AfterMethod
	 public void tearDown() {
			driver.quit();
		}
}
