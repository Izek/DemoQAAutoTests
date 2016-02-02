package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class SortablePageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openSortablePageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openSortablePage();
	}

	@Test
	public void navigateToSortablePageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage().sideBar.openSortablePage();
	}
}
