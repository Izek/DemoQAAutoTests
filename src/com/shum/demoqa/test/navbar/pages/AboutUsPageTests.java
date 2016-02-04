package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class AboutUsPageTests extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void titleAboutUsTest() {
		WebPage wPage = new WebPage(wDriver);
		
		wPage.navBar.openAboutUsPage();
		
		System.out.println(wPage.getPageTitle());
	}
}
