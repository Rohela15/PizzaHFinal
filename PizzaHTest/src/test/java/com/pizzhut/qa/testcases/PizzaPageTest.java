package com.pizzhut.qa.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzhut.qa.base.TestBase;

public class PizzaPageTest extends TestBase {
	HomePage homePage;
	PizzaPage pizzaPage;
	
	public PizzaPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		homePage=new HomePage();
		pizzaPage=new PizzaPage();
	}
	
	
	
	
	
	
	
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

	
	

}
