package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.OptionsPage;
import com.pizzahut.qa.pages.ToppingsSelectionPage;
import com.pizzhut.qa.base.TestBase;
import com.pizzhut.qa.util.TestUtil;

public class OptionsPageTest extends TestBase {
	OptionsPage optionsPage ;
	DealPage dealPage;
	HomePage homePage;
	ToppingsSelectionPage toppingpage;
	
	String sheetName="address";
	
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
	
	@DataProvider
	public Object[][] getPizzaHuTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	@Test (priority=4, dataProvider="getPizzaHuTestData")
	public void ValidateAddressInput(String address1, String address2, String city, String state,String zipcode) {
		//toppingpage=optionsPage.verifyAddressInputEnterToppingPage(prop.getProperty("address1"), prop.getProperty("address2"), prop.getProperty("city"), prop.getProperty("state"), prop.getProperty("zipcode"));
		toppingpage= optionsPage.verifyAddressInputEnterToppingPage(address1, address2, city, state, zipcode);
		
	}
	
	@AfterMethod
 public void tearDown() {
		driver.quit();
	}
	
}
