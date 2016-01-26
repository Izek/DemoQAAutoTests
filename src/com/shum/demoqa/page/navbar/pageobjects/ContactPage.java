package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class ContactPage extends WebPage {

	public ContactPage(WebDriver wDriver) {
		super(wDriver);

		if (!isContactPageOpened()) {
			throw new PageNotFoundException("'Contact' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Contact\"]")
	WebElement contactHeader;

	private boolean isContactPageOpened() {
		return isElementAppeared(contactHeader, 5);
	}
}