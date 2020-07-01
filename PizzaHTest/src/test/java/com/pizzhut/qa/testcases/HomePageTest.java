package com.pizzhut.qa.testcases;


<<<<<<< HEAD
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
=======

>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
<<<<<<< HEAD
import com.pizzahut.qa.pages.LoginPage;
import com.pizzahut.qa.pages.PastaPage;
=======
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
import com.pizzahut.qa.pages.PizzaPage;

import com.pizzhut.qa.base.TestBase;

public class HomePageTest extends TestBase {

<<<<<<< HEAD
	HomePage homePage;
	LoginPage loginPage;
=======
	HomePage homePage;	
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
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
<<<<<<< HEAD
		pizzaPage = new PizzaPage();
		pzonePage = new PzonePage();
		wingsPage = new WingsPage();
		sidesPage = new SidesPage();
		pastaPage = new PastaPage();
		dessertPage = new DessertPage();
		drinksPage = new DrinksPage();
		loginPage = new LoginPage();
=======
		pizzaPage = new PizzaPage();		
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
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
<<<<<<< HEAD
		AssertJUnit.assertTrue(menu);
	}
	
	@Test(priority=2)
	public void menuLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();		
		pizzaPage = homePage.clickOnPizzaLink();		
=======
		Assert.assertTrue(menu);
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
		
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
<<<<<<< HEAD
		AssertJUnit.assertTrue(pzone);		
		pzonePage = homePage.clickOnPzoneLink();		
=======
		Assert.assertTrue(pzone);		
		homePage.clickOnPzoneLink();		
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	
	@Test(priority=4)
	public void wingsLinkTest() {
		homePage.clickOnMenuLink();		
		boolean wings = homePage.validateWingsLink();
<<<<<<< HEAD
		AssertJUnit.assertTrue(wings);		
		wingsPage = homePage.clickOnWingsLink();		
=======
		Assert.assertTrue(wings);		
		homePage.clickOnWingsLink();		
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	
	@Test(priority=5)
	public void sidesLinkTest() {
		homePage.clickOnMenuLink();	
		boolean sides = homePage.validateSidesLink();
<<<<<<< HEAD
		AssertJUnit.assertTrue(sides);		
		sidesPage = homePage.clickOnSidesLink();		
=======
		Assert.assertTrue(sides);		
		homePage.clickOnSidesLink();		
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	
	@Test(priority=6)
	public void pastaLinkTest() {
		homePage.clickOnMenuLink();	
		boolean pasta = homePage.validatePastaLink();
<<<<<<< HEAD
		AssertJUnit.assertTrue(pasta);		
		pastaPage = homePage.clickOnPastaLink();		
=======
		Assert.assertTrue(pasta);		
		homePage.clickOnPastaLink();		
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	
	@Test(priority=7)
	public void dessertLinkTest() {
		homePage.clickOnMenuLink();	
		boolean dessert = homePage.validateDessertsLink();
<<<<<<< HEAD
		AssertJUnit.assertTrue(dessert);
		dessertPage = homePage.clickOnDessertPage();
=======
		Assert.assertTrue(dessert);
		homePage.clickOnDessertPage();
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	
	@Test(priority=8)
	public void drinksLinkTest() {
		homePage.clickOnMenuLink();	
		boolean drinks = homePage.validateDrinksLink();
<<<<<<< HEAD
		AssertJUnit.assertTrue(drinks);
		drinksPage = homePage.clickOnDrinksPage();
=======
		Assert.assertTrue(drinks);
		homePage.clickOnDrinksPage();
>>>>>>> branch 'master' of https://github.com/Rohela15/PizzaHFinal.git
	}
	@Test
	public void clickOnSignInTest() {
		  homePage.clickOnSingInButton();
		Assert.assertTrue(true, "New Login page should be open");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
