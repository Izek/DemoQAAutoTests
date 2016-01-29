package com.shum.demoqa.test.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class ServicesPageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openServicesPageTest() {
		WebPage sPage = new WebPage(wDriver);
		sPage.getNBar().openServicesPage();
	}

	@Test
	public void navigateToServicesPageTest() {
		WebPage sPage = new WebPage(wDriver);
		sPage.getNBar().openHomePage().getNBar().navigateToServicesPage();
	}
}
