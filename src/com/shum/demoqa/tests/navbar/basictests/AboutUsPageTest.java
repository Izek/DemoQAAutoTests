package com.shum.demoqa.tests.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class AboutUsPageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openAboutUsPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openAboutUsPage();
	}
	
	@Test
	public void navigateToAboutUsPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openHomePage().navigateToAboutUsPage();
	}
}
