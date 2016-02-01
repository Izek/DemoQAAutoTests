package com.shum.demoqa.page.content.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class ResizablePage extends WebPage {

	public ResizablePage(WebDriver wDriver) {
		super(wDriver);

		if (!isRegistrationPageOpened()) {
			throw new PageNotFoundException("'Resizeble' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Resizable\"]")
	WebElement resizebleHeader;

	public boolean isRegistrationPageOpened() {
		return isElementAppeared(resizebleHeader, 5);
	}
}
