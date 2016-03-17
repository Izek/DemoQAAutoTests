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

	// @Test
	public void openContactsPageTest() {
		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();

		ContactPage contactPage = webPage.navBar.navigateToContactPage();

		contactPage.maximizeWindow();

		contactPage.navigateBack();
		contactPage.navigateForward();

		System.out.println(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_MESSAGE);

	}

	// @Test
	public void sendMessageTest() {

		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();

		ContactPage contactPage = webPage.navBar.navigateToContactPage();
		contactPage.maximizeWindow();

		contactPage.clickOn(contactPage.getContactPageNameInput());

		waitForTime(3000);

		contactPage.enterText(contactPage.getContactPageEmailInput(), "test");

		waitForTime(3000);
		contactPage.enterText(contactPage.getContactPageMessageTextArea(),
				ContactPageDataTest.CONTACT_PAGE_TEST_TWO_MESSAGE);
		waitForTime(3000);
		contactPage.clickOn(contactPage.getContactPageSendButton());

		waitForTime(3000);
		waitForTime(3000);
	}

	@Test
	public void sendMessageOneTest() {
		WebPage webPage = new WebPage(wDriver);
		webPage.navBar.openHomePage();

		ContactPage contactPage = webPage.navBar.navigateToContactPage();
		contactPage.maximizeWindow();

		contactPage.enterName(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_NAME);
		contactPage.enterEmail(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_EMAIL);
		contactPage.enterSubject(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_SUBJECT);
		
		contactPage.enterMessage(ContactPageDataTest.CONTACT_PAGE_TEST_ONE_MESSAGE);
		
		waitForTime(3000);
		
		
		contactPage.clickOnSendButton();

	}
}
