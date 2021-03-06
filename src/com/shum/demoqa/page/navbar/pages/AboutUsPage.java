package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class AboutUsPage extends WebPage {

	public AboutUsPage(WebDriver wDriver) throws PageNotFoundException {
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
