package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class AboutUsPage extends NavigationTabBarPage {

	public AboutUsPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);
		
		PageFactory.initElements(wDriver, this);
		
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
