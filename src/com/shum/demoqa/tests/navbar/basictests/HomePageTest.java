package com.shum.demoqa.tests.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
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
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openHomePage();

		Assert.assertEquals(NavBar.getPageTitle(), TData.HOME_PAGE_HEADER);
	}

	@Test
	public void navigateToHomePageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openContactPage().navigateToHomePage();

		Assert.assertEquals(NavBar.getPageTitle(), TData.HOME_PAGE_HEADER);
	}
}