package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class ServicesPage extends WebPage {

	public ServicesPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isServicesPageOpened()) {
			throw new PageNotFoundException("'Services' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Services\"]")
	WebElement sericesHeader;

	private boolean isServicesPageOpened() {
		return isElementAppeared(sericesHeader, 5);
	}

}
