package com.shum.demoqa.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.pages.AbstractPage;
import com.shum.demoqa.utils.TData;

public class NavigationTabBarPage extends AbstractPage {

	public NavigationTabBarPage(WebDriver wDriver) throws PageNotFoundException {

		this.wDriver = wDriver;

		PageFactory.initElements(wDriver, this);

		if (!isNavTabBarIsVisible()) {
			throw new PageNotFoundException("Navigaion Bar was not opened!..");
		}
	}

	@FindBy(id = "site_navigation")
	WebElement NavigationTabBar;

	// TabBar buttons
	@FindBy(xpath = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Home\"]")
	WebElement homeTabButton;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"About us\"]")
	WebElement aboutTabButton;

	public boolean isNavTabBarIsVisible() {
		return isElementAppeared(NavigationTabBar, 5);
	}

	public DemoQAHomePage openDemoQAHomePage() {
		wDriver.navigate().to(TData.HOME_PAGE);
		return new DemoQAHomePage(wDriver);
	}

	public DemoQAHomePage navigateToHomePage() {
		homeTabButton.click();
		return new DemoQAHomePage(wDriver);
	}

	public DemoQAAboutUsPage navigateToAboutUsPage() {
		aboutTabButton.click();
		return new DemoQAAboutUsPage(wDriver);
	}
}