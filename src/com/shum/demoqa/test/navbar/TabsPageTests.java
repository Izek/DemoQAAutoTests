package com.shum.demoqa.test.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class TabsPageTests extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openTabsPageTest() {
		WebPage tPage = new WebPage(wDriver);
		tPage.getNBar().openTabsPage();
	}

	@Test
	public void navigateToTabsPageTest() {
		WebPage tPage = new WebPage(wDriver);
		tPage.getNBar().openHomePage().getNBar().navigateToTabsPage();
	}
}
