package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class TooltipPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openTooltipPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openTooltipPage();
	}

	@Test
	public void navigateToToolTipPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();
		wPage.sideBar.navigateToTooltipPage();
	}
}
