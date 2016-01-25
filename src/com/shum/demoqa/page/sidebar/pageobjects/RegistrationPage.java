package com.shum.demoqa.page.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class RegistrationPage extends SideBarPage {

	public RegistrationPage(WebDriver wDriver) {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

		if (!isRegistrationPageOpened()) {
			throw new PageNotFoundException("'Registration' page was not opened!");
		}
	}
	
	@FindBy (xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Registration\"]")
	WebElement registrationHeader;
	
	public boolean isRegistrationPageOpened() {
		return isElementAppeared(registrationHeader, 5);
	}
}
