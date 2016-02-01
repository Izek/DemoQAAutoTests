package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class MenuPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openMenuPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openMenuPage();
	}

	@Test
	public void navigateToMenuPageTest() {
		WebPage wPage = new WebPage(wDriver);

		wPage.navBar.openHomePage().sideBar.navigateToMenuPage();
	}

}
