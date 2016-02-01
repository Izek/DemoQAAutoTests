package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class SelectablePageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openSelectablePageTest() { WebPage wPage = new WebPage(wDriver); wPage.sideBar.openSelectablePage();
	}

	@Test
	public void navigateToSelectablePage() {  WebPage wPage = new WebPage(wDriver); wPage.navBar.openHomePage(); wPage.sideBar.navigateToSelectablePage();
	}
}
