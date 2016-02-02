package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.homepage.HomePageData;

public class HomePage extends WebPage {

	public HomePage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isHomePageOpened()) {
			throw new PageNotFoundException("'Home' page was not opened!");
		}
	}

	@FindBy(xpath = HomePageData.HOME_PAGE_HEADER_XPATH)
	WebElement homeHeader;

	public boolean isHomePageOpened() {
		return isElementAppeared(homeHeader, 5);
	}

}
