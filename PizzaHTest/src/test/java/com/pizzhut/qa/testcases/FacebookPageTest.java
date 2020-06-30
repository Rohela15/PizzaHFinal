package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.FacebookPage;
import com.pizzahut.qa.pages.HomePage;

import com.pizzahut.qa.pages.JoinPage;
import com.pizzhut.qa.base.TestBase;

public class FacebookPageTest extends TestBase {
	HomePage homePage;
	JoinPage joinPage;
	FacebookPage facebookPage;

	@BeforeMethod
	public void setUp() {
		initialization();

		joinPage = new JoinPage();
		homePage = new HomePage();
		facebookPage = new FacebookPage();
		facebookPage= joinPage.verifyFBIcon();
	}

	@Test(priority = 1)// does not change the page title
	public void facebookPageTitleTest() {
		String title = facebookPage.validateFBpageTitle();
		Assert.assertNotEquals(title, "pizzahut review");
		
	}
	
	//@Test
	public void verifyLoginonFbtest() {
		facebookPage.loginFbPage();
	}
	
	//@Test	
	public void fbLogoTest() {
		facebookPage.verifyfacebookLogo();
		Assert.assertTrue(true);
	}
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}
}
