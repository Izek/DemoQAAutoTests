package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class DemoQAContactPage extends NavigationTabBarPage {

	public DemoQAContactPage(WebDriver wDriver) {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

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