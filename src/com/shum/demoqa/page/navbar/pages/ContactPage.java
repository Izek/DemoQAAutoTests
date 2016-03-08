package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.ContactPageData;

public class ContactPage extends WebPage {

	public ContactPage(WebDriver wDriver) {
		super(wDriver);

		if (!isContactPageOpened()) {
			throw new PageNotFoundException("'Contact' page was not opened!");
		}
	}

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_HEADER_XPATH)
	@CacheLookup
	WebElement contactHeader;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_NAME_INPUT_XPATH)
	@CacheLookup
	WebElement contactYourNameInput;
	@FindBy(xpath = ContactPageData.CONTACT_PAGE_NAME_VALIDATION_ERROR_ALERT_XPATH)
	@CacheLookup
	WebElement contactYourNameErrorMessage;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_EMAIL_INPUT_XPATH)
	@CacheLookup
	WebElement contactYourEmailLabel;
	@FindBy(xpath = ContactPageData.CONTACT_PAGE_EMAIL_VALIDATION_ERROR_ALERT_XPATH)
	@CacheLookup
	WebElement contactYourEmailErrorMessage;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_SUBJECT_INPUT_XPATH)
	@CacheLookup
	WebElement contactSubjectInput;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_MESSAGE_TEXTAREA_XPATH)
	@CacheLookup
	WebElement contactMessageTextArea;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_SEND_BUTTON_XPATH)
	@CacheLookup
	WebElement contactSendButton;

	@FindBy(xpath = ContactPageData.CONTACT_PAGE_MESSAGE_VALIDATION_ERROR_ALERT_XPATH)
	@CacheLookup
	WebElement contactSendingValidationAlertError;

	private boolean isContactPageOpened() {
		return isElementAppeared(contactHeader, 5);
	}
}