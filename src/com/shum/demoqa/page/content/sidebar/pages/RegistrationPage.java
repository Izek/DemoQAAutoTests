package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class RegistrationPage extends WebPage {

	public RegistrationPage(WebDriver wDriver) {
		super(wDriver);

		if (!isRegistrationPageOpened()) {
			throw new PageNotFoundException("'Registration' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Registration\"]")
	WebElement registrationHeader;

	public boolean isRegistrationPageOpened() {
		return isElementAppeared(registrationHeader, 5);
	}
}
