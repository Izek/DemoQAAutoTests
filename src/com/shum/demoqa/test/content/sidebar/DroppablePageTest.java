package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class DroppablePageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openDroppablePageTest() {

		WebPage webPage = new WebPage(wDriver);

		webPage.sideBar.openDroppablePage();
	}

	@Test
	public void navigateToDroppablePageTest() {

		WebPage webPage = new WebPage(wDriver);

		webPage.navBar.openHomePage();
		webPage.sideBar.openDroppablePage();
	}

}
