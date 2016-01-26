package com.shum.demoqa.tests.sidebar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class RegistrationPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void navigateToRegistrtaionPageTest() {
		WebPage rPage = new WebPage(wDriver);
		rPage.getNBar().openHomePage().getSBar().openRegistrationPage();
	}

	@Test
	public void openRegistrtaionPageTest() {
		WebPage rPage = new WebPage(wDriver);
		rPage.getSBar().openRegistrationPage();
	}
}
