package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.HomePage;
import com.shum.demoqa.test.navbar.data.pages.HomePageDataTest;
import com.shum.demoqa.tests.BaseTest;

public class HomePageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void contentImagesDescriptionHeadersTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);

		Assert.assertEquals(hPage.getUniqueDescrHeader(), HomePageDataTest.HOME_PAGE_UNIQUE_AND_CLEAN_DESCR_HEADER,
				"Fail!. 'Unique & Clean' description does not match to expected.");
		Assert.assertEquals(hPage.getCustomerSupportDescrHeader(),
				HomePageDataTest.HOME_PAGE_CUSTOMER_SUPPORT_DESCR_HEADER,
				"Fail!. 'Customer Support' description does not match to expected.");
		Assert.assertEquals(hPage.getVeryFlexibleDescrHeader(), HomePageDataTest.HOME_PAGE_VERY_FLEXIBLE_DESCR_HEADER,
				"Fail!. 'Very Flexible' description does not match to expected.");
	}

	@Test
	public void descriptionContentImagesClickingTest() {

		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);

		hPage.waitForTime(2000);
		hPage.focusOnCustomerSupportImage();
		hPage.focusOnUniqueImage();
		hPage.focusOnVeryFlexibleImage();

		hPage.focusOnCustomerSupportImage();
		wPage = hPage.clickOnCustomerSupportImage();
		wPage.navigateBack();

		hPage.focusOnVeryFlexibleImage();
		wPage = hPage.clickOnVeryFlexibleImage();
		wPage.navigateBack();

		hPage.focusOnUniqueImage();
		wPage = hPage.clickOnUniqueImage();
		wPage.navigateBack();

		Assert.assertTrue(hPage.isHomePageOpened(), "Fail!. HomePage was not opened!");
	}

	@Test
	public void descriptionTextVerificationTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);

		Assert.assertEquals(hPage.getUniqueDescr(), HomePageDataTest.HOME_PAGE_UNIQUE_AND_CLEAN_DESCR_TEXT,
				"Fail!. 'Unique & Clean' description does not match to expected.");

		Assert.assertEquals(hPage.getCustomerSupportDescr(), HomePageDataTest.HOME_PAGE_CUSTOMER_SUPPORT_DESCR_TEXT,
				"Fail!. 'Customer Support' description does not match to expected.");

		Assert.assertEquals(hPage.getVeryFlexibleDescr(), HomePageDataTest.HOME_PAGE_VERY_FLEXIBLE_DESCR_TEXT,
				"Fail!. 'Very Flexible' description does not match to expected.");
	}
}
