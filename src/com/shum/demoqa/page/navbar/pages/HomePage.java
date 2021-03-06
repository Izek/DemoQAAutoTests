package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class HomePage extends WebPage {

	public HomePage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isHomePageOpened()) {
			throw new PageNotFoundException("'Home' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Home\"]")
	WebElement homeHeader;

	public boolean isHomePageOpened() {
		return isElementAppeared(homeHeader, 5);
	}

}
