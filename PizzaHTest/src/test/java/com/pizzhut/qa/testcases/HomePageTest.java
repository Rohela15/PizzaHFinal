package com.pizzhut.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.DessertPage;
import com.pizzahut.qa.pages.DrinksPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzahut.qa.pages.LoginPage;
import com.pizzahut.qa.pages.PastaPage;
import com.pizzahut.qa.pages.PizzaPage;
import com.pizzahut.qa.pages.PzonePage;
import com.pizzahut.qa.pages.SidesPage;
import com.pizzahut.qa.pages.WingsPage;
import com.pizzhut.qa.base.TestBase;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	DealPage dealPage;
	JoinPage joinPage;
	HutRewardPage hutrewardPage;
	PizzaPage pizzaPage;
	PzonePage pzonePage;
	WingsPage wingsPage;
	SidesPage sidesPage;
	PastaPage pastaPage;
	DessertPage dessertPage;
	DrinksPage drinksPage;

	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();

		homePage = new HomePage();
		pizzaPage = new PizzaPage();
		pzonePage = new PzonePage();
		wingsPage = new WingsPage();
		sidesPage = new SidesPage();
		pastaPage = new PastaPage();
		dessertPage = new DessertPage();
		drinksPage = new DrinksPage();
		loginPage = new LoginPage();
		dealPage = new DealPage();
		joinPage = new JoinPage();
		hutrewardPage = new HutRewardPage();
		dealPage = homePage.clickOnDealsLinks();
		

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
		AssertJUnit.assertTrue(menu);
	}
	
	@Test(priority=2)
	public void menuLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();		
		pizzaPage = homePage.clickOnPizzaLink();		
		
	}
	
	@Test(priority=3)
	public void pzoneLinkTest()throws InterruptedException {
		homePage.clickOnMenuLink();		
		boolean pzone = homePage.validatePzoneLink();
		AssertJUnit.assertTrue(pzone);		
		pzonePage = homePage.clickOnPzoneLink();		
	}
	
	@Test(priority=4)
	public void wingsLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();		
		boolean wings = homePage.validateWingsLink();
		AssertJUnit.assertTrue(wings);		
		wingsPage = homePage.clickOnWingsLink();		
	}
	
	@Test(priority=5)
	public void sidesLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();
		boolean sides = homePage.validateSidesLink();
		AssertJUnit.assertTrue(sides);		
		sidesPage = homePage.clickOnSidesLink();		
	}
	
	@Test(priority=6)
	public void pastaLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();
		boolean pasta = homePage.validatePastaLink();
		AssertJUnit.assertTrue(pasta);		
		pastaPage = homePage.clickOnPastaLink();		
	}
	
	@Test(priority=7)
	public void dessertLinkTest() throws InterruptedException {
		homePage.clickOnMenuLink();
		boolean dessert = homePage.validateDessertsLink();
		AssertJUnit.assertTrue(dessert);
		dessertPage = homePage.clickOnDessertPage();
	}
	
	@Test(priority=8)
	public void drinksLinkTest() {
		homePage.clickOnMenuLink();
		boolean drinks = homePage.validateDrinksLink();
		AssertJUnit.assertTrue(drinks);
		drinksPage = homePage.clickOnDrinksPage();
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
