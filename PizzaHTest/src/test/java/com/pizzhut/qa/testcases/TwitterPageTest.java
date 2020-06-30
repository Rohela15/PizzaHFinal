package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzahut.qa.pages.TwitterPage;
import com.pizzhut.qa.base.TestBase;

public class TwitterPageTest extends TestBase {
	HomePage homePage;
	JoinPage joinPage;
	TwitterPage twitterPage;

	@BeforeMethod
	public void setUp() {
		initialization();

		joinPage = new JoinPage();
		homePage = new HomePage();
		twitterPage = new TwitterPage();
		twitterPage = joinPage.verifyTwitterIcon();
	}

	@Test
	public void verifyTwitterTitleTest() {
		String title = twitterPage.verifyTitle();
		Assert.assertNotEquals(title, "pizzahut Twitter");
	}

	@Test
	public void verifyUrlTest() {
		twitterPage.verifyURL();
	}
}
