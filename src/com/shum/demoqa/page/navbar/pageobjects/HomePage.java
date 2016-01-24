package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class HomePage extends NavigationTabBarPage {

	public HomePage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

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