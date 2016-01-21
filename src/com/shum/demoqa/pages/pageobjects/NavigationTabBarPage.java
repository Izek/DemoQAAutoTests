package com.shum.demoqa.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.pages.AbstractPage;

public class NavigationTabBarPage extends AbstractPage {

	//protected WebDriver wDriver;

	//public NavigationTabBarPage(WebDriver wDriver) {
	//	this.wDriver = wDriver;
	//}

	@FindBy (id = "site_navigation")
	WebElement NavigationTabBar;
	
	public boolean isNavTabBarIsVisible() {
		return NavigationTabBar.isDisplayed();
	}
	
}