package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.HomePage;
import com.shum.demoqa.test.navbar.data.pages.HomePageDataTest;
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

		waitForTime(500);

		hPage.clickOnTabOne();
		Assert.assertEquals(hPage.getTabButtonContentHeaderOne().getText(),
				HomePageDataTest.HOME_PAGE_TABS_CONTENT_TITLE_ONE, "Failed! Content header "
						+ hPage.getTabButtonContentHeaderOne().getText() + " does not match expected...");

		hPage.clickOnTabTwo();
		Assert.assertEquals(hPage.getTabButtonContentHeaderTwo().getText(),
				HomePageDataTest.HOME_PAGE_TABS_CONTENT_TITLE_TWO, "Failed! Content header "
						+ hPage.getTabButtonContentHeaderTwo().getText() + " does not match expected...");

		hPage.clickOnTabThree();
		Assert.assertEquals(hPage.getTabButtonContentHeaderThree().getText(),
				HomePageDataTest.HOME_PAGE_TABS_CONTENT_TITLE_THREE, "Failed! Content header "
						+ hPage.getTabButtonContentHeaderThree().getText() + " does not match expected...");

		hPage.clickOnTabFour();
		Assert.assertEquals(hPage.getTabButtonContentHeaderFour().getText(),
				HomePageDataTest.HOME_PAGE_TABS_CONTENT_TITLE_FOUR, "Failed! Content header "
						+ hPage.getTabButtonContentHeaderFour().getText() + " does not match expected...");

		System.out.println(hPage.getTabButtonContentHeaderOne().getText());

		hPage.clickOnTabFive();
		Assert.assertEquals(hPage.getTabButtonContentHeaderFive().getText(),
				HomePageDataTest.HOME_PAGE_TABS_CONTENT_TITLE_FIVE, "Failed! Content header "
						+ hPage.getTabButtonContentHeaderFive().getText() + " does not match expected...");

	}
}