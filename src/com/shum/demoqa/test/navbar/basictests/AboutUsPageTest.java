package com.shum.demoqa.test.navbar.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class AboutUsPageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openAboutUsPageTest() {
		WebPage AUPage = new WebPage(wDriver);
		AUPage.getNBar().openAboutUsPage();	
	}
	
	@Test
	public void navigateToAboutUsPageTest() {
		WebPage AUPage = new WebPage(wDriver);
		AUPage.getNBar().openHomePage().getNBar().openAboutUsPage();
	}
}
