package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class ResizablePageTest extends BaseTest {

	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	@Test
	public void openResizablePageTest() {
		WebPage resizablePage = new WebPage(wDriver);

		resizablePage.sideBar.openResizablePage();
	}

	@Test
	public void navigateToResizablePageTest() {
		WebPage wPage = new WebPage(wDriver);

		wPage.navBar.openHomePage().sideBar.navigateToResizablePage();
	}
}
