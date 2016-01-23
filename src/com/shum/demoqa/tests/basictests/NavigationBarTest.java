package com.shum.demoqa.tests.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.pages.pageobjects.NavigationTabBarPage;
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
	public void NavigationThroughTabsTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.navigateToAboutUsPage().navigateToHomePage().navigateToAboutUsPage().navigateToHomePage()
				.isHomePageOpened();
	}
}
