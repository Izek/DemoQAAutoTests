package com.shum.demoqa.tests.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;
import com.shum.demoqa.utils.TData;

public class HomePageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openHomePageTest() {
		WebPage hPage = new WebPage(wDriver);
		hPage.getNBar().openHomePage();

		Assert.assertEquals(hPage.getPageTitle(), TData.HOME_PAGE_HEADER);
	}

	@Test
	public void navigateToHomePageTest() {
		WebPage hPage = new WebPage(wDriver);
		hPage.getNBar().openContactPage().getNBar().navigateToHomePage();

		Assert.assertEquals(hPage.getPageTitle(), TData.HOME_PAGE_HEADER);
	}
}