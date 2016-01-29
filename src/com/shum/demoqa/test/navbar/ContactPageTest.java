package com.shum.demoqa.test.navbar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class ContactPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openContactPageTest() {
		WebPage cPage = new WebPage(wDriver);
		cPage.getNBar().openContactPage();
	}

	@Test
	public void navigateToContactPageTest() {
		WebPage cPage = new WebPage(wDriver);
		cPage.getNBar().openHomePage().getNBar().navigateToContactPage();
	}
}
