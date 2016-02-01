package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class SliderPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openSliderPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openSliderPage();
	}

	@Test
	public void navigateToSliderPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();
		wPage.sideBar.navigateToSliderPage();
	}

}
