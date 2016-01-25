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
		HPage hPage = new HPage(wDriver);
		
		hPage.NavBar.openHomePage(); 
		
		hPage.NavBar.openHomePage();
		
		hPage.SideBar.openRegistrationPage();
		
				hPage.NavBar.openHPage().SideBar.navigateToRegistrationPage();

		hPage.SideBar.isSideBarPresentOnPage();
		
		
	}
	
}
