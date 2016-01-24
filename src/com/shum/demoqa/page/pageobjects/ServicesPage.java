package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class ServicesPage extends NavigationTabBarPage {

	public ServicesPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

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
