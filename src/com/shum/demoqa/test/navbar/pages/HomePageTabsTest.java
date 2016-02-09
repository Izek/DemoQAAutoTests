package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.HomePage;
import com.shum.demoqa.tests.BaseTest;

public class HomePageTabsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void contentDescriptionHeadersTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);
		
		hPage.clickOnTabOne();
		hPage.clickOnTabTwo();
		hPage.clickOnTabThree();
		hPage.clickOnTabFour();
		hPage.clickOnTabFive();
		

		
		waitForTime(2000);
		
	}
}