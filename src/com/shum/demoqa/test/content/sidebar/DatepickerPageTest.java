package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class DatepickerPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openDatepickerPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openDatepickerPage();
	}

	@Test
	public void navigateToDatepickerPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();
		wPage.sideBar.navigateToDatepickerPage();
	}

}
