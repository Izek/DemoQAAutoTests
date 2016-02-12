package com.shum.demoqa.test.navbar.pages;


import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.ServicesPage;
import com.shum.demoqa.test.navbar.data.pages.ServicesPageDataTest;
import com.shum.demoqa.tests.BaseTest;

public class ServicesPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void getTitleTest() {
		WebPage wPage = new WebPage(wDriver);
		ServicesPage sPage = wPage.navBar.openServicesPage();

		Assert.assertEquals(sPage.getPageTitle(), ServicesPageDataTest.SERVICES_PAGE_TITLE,
				"Fail!. Page title does not match...");

		Assert.assertEquals(sPage.breadCrumbs.getBreadCrumbsTitle(), ServicesPageDataTest.SERVICES_PAGE_BREADCRUMBS,
				"Fail!. Page breadcrumbs do not match...");

		Assert.assertEquals(sPage.getServicesPageHeader().getText(), ServicesPageDataTest.SERVICES_PAGE_HEADER,
				"Fail!. Page title does not match...");

		Assert.assertEquals(sPage.getServicesPageText().getText(), ServicesPageDataTest.SERVICES_PAGE_TEXT,
				"Fail!. Page text does not match...");

	}

}
