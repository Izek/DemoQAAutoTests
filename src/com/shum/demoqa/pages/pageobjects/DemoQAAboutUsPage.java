package com.shum.demoqa.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class DemoQAAboutUsPage extends NavigationTabBarPage {

	public DemoQAAboutUsPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);
		if (!isAboutUsPageOpened()) {
			throw new PageNotFoundException("'About us' Page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"About us\"]")
	WebElement aboutUsHeader;

	public boolean isAboutUsPageOpened() {
		return isElementAppeared(aboutUsHeader, 5);
	}
}
