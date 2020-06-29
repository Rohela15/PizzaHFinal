package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.FacebookPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzahut.qa.pages.TwitterPage;
import com.pizzhut.qa.base.TestBase;
import com.pizzhut.qa.util.TestUtil;

public class JoinPageTest extends TestBase {

	HomePage homePage;
	JoinPage joinPage;
	FacebookPage facebookPage;
	TwitterPage twitterPage;

	String sheetName = "Join";

	public JoinPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		joinPage = new JoinPage();
		homePage.clickJoinLink();
		facebookPage = new FacebookPage();
		twitterPage = new TwitterPage();

	}

	@Test(priority = 2)
	public void facebookIconTest() {
		facebookPage = joinPage.verifyFBIcon();

	}

	@DataProvider
	public Object[][] getPizzaHuTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test
	public void twitterTest() {
		twitterPage = joinPage.verifyTwitterIcon();
	}

	@Test(priority = 1, dataProvider = "getPizzaHuTestData")
	public void validateCreateNewAccount(String email, String password, String confpwd, String firstName,
			String lastName, String phone, String zipcode) {
		joinPage.createNewAccount(email, password, confpwd, firstName, lastName, phone, zipcode);
	}

	@Test
	public void createAccButtonTest() {
		joinPage.verifyCreateAccButton();
		Assert.assertTrue(true, "Create account button is not displayed");

	}

	@Test
	public void negetiveTest() {
		joinPage.negetiveScenario();
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
