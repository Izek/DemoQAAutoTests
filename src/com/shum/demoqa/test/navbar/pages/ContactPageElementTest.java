package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.ContactPage;
import com.shum.demoqa.tests.BaseTest;

public class ContactPageElementTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openContactsPageTest() {
		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();
		
		
		ContactPage contactPage = webPage.navBar.navigateToContactPage();
		
		contactPage.maximizeWindow();
		
		contactPage.navigateBack();
		contactPage.navigateForward();
		
	}

}
