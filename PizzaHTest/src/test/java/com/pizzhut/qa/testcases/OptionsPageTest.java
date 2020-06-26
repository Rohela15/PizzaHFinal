package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;

public class OptionsPageTest extends TestBase {
	OptionsPage optionsPage ;
	DealPage dealPage;
	HomePage homePage;
	
	
	ToppingsSelectionPage toppingpage;
	
	//create optionpage constructor to call parent/super call constructor where properties are initialised
	public OptionsPageTest() {
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
	}
	

	@Test(priority=1)
	public void ValidateOptionPageTitle() {
		String title = optionsPage.ValidateOptionPageTitle();
		Assert.assertEquals(title, "Pizza Hut: Pizza Delivery | Pizza Carryout | Coupons | Wings & More");	}
	
	@Test(priority=2)
	public void ValidateDeliverybutton() {
		boolean flag1=optionsPage.ValidateDeliverybutton();
		Assert.assertTrue(flag1);
		
	}
	
	@Test(priority=3)
	public void ValidateCarryoutbutton() {
		boolean flag=optionsPage.ValidateCarryOutButton();
		Assert.assertTrue(flag);
	}
	
	@Test (priority=4)
	public void ValidateAddressInput() {
		toppingpage=optionsPage.verifyAddressInputEnterToppingPage(prop.getProperty("address1"), prop.getProperty("address2"), prop.getProperty("city"), prop.getProperty("state"), prop.getProperty("zipcode"));
		 
		
	}
	
	@AfterMethod
 public void tearDown() {
		driver.quit();
	}
	
}
