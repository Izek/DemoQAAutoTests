package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.ContactPage;
import com.shum.demoqa.test.navbar.data.pages.ContactPageDataTest;
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

	//@Test
	public void openContactsPageTest() {
		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();
		
		
		ContactPage contactPage = webPage.navBar.navigateToContactPage();
		
		contactPage.maximizeWindow();
		
		contactPage.navigateBack();
		contactPage.navigateForward();
		
		System.out.println(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_MESSAGE);
		
	}
	
	@Test
	public void sendMessageTest() {
		
		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();
		
		
		ContactPage contactPage = webPage.navBar.navigateToContactPage();
		
		contactPage.clickOnElement(contactPage.getContactPageNameInput());
		
		waitForTime(3000);
		
		
		contactPage.clickOnElement(contactPage.getContactPageSendButton());
		
		waitForTime(3000);
	}

}
