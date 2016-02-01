package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class AccordionPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openAccordionPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openAccordionPage();
	}

	@Test
	public void navigateToAccordionPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();
		wPage.sideBar.navigateToAccordionPage();
	}

}
