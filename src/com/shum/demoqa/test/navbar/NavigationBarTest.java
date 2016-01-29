package com.shum.demoqa.test.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.NavigationTabBar;
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
		NavigationTabBar NavBar = new NavigationTabBar(wDriver);

		NavBar.openHomePage().getNBar().navigateToAboutUsPage().getNBar().navigateToServicesPage().getNBar().navigateToDraggablePage().getNBar().
				navigateToTabsPage().getNBar().navigateToBlogPage().getNBar().navigateToContactPage().getNBar().navigateToHomePage()
				.isHomePageOpened();
	}

	@Test
	public void navigateToDemoTabsPageTest() {
		WebPage tPage = new WebPage(wDriver);
		tPage.getNBar().openHomePage().getNBar().navigateToDraggablePage();
		tPage.getNBar().openHomePage().getNBar().navigateToTabsPage();
	}
}
