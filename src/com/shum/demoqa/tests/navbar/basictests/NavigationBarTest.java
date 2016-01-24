package com.shum.demoqa.tests.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class NavigationBarTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void navigationThroughTabsTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.openHomePage().navigateToAboutUsPage().navigateToServicesPage().navigateToDraggablePage()
				.navigateToTabsPage().navigateToBlogPage().navigateToContactPage().navigateToHomePage()
				.isHomePageOpened();
	}

	@Test
	public void navigateToDemoTabsPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.openHomePage().navigateToDraggablePage();
		NavBar.openHomePage().navigateToTabsPage();
	}
}
