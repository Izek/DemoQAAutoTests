package com.shum.demoqa.tests.basictests;

import org.junit.Test;

import com.shum.demoqa.page.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class ContactPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openDemoQAContactPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.openContactPage();
	}

}
