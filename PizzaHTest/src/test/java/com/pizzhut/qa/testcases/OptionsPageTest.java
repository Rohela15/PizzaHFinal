package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;

public class OptionsPageTest extends TestBase {
	OptionsPage optionsPage ;
	
	ToppingsSelectionPage toppingpage;
	
	//create optionpage constructor to call parent/super call constructor where properties are initialised
	public OptionsPageTest() {
		super();
	}
	ToppingsSelectionPage toppingsSelectionPage;
	@BeforeMethod
	public void setUp() {
		initialization();
		
		 optionsPage = new OptionsPage();
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
		toppingpage=toppingsSelectionPage=	optionsPage.verifyAddressInput(prop.getProperty("address1"), prop.getProperty("address2"), prop.getProperty("city"), prop.getProperty("state"), prop.getProperty("zipcode"));
		 
		
	}
	
	@AfterMethod
 public void tearDown() {
		driver.quit();
	}
	
}
