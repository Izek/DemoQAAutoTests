package com.shum.demoqa.page;

import org.junit.Test;

import com.shum.demoqa.tests.BaseTest;

public class HPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openHPageTest() {
		Page hPage = new Page(wDriver);

		hPage.NavBar.openHPage();

		hPage.NavBar.openHPage();

		hPage.SideBar.openRegistrationPage();

		hPage.NavBar.openHPage().SideBar.navigateToRegistrationPage();

		hPage.NavBar.openHPage().SideBar.isSideBarPresentOnPage();

	}

}
