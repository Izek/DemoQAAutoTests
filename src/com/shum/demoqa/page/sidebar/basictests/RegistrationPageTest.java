package com.shum.demoqa.page.sidebar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class RegistrationPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void navigateToRegistrtaionPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		//NavBar.openHomePage().getSideBar().navigateToRegistrationPage();
	}

	@Test
	public void openRegistrtaionPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.getSideBar().openRegistrationPage();

	}
}
