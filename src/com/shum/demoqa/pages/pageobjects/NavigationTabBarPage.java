package com.shum.demoqa.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.pages.AbstractPage;

public class NavigationTabBarPage extends AbstractPage {

	public NavigationTabBarPage(WebDriver wDriver) throws PageNotFoundException {
	
		this.wDriver = wDriver;
		
		PageFactory.initElements(wDriver, this);
		
		if (!isNavTabBarIsVisible()) { throw new PageNotFoundException("Navigaion Bar was not opened!..");}
	}
	
	@FindBy (id = "site_navigation")
	WebElement NavigationTabBar;
	
	public boolean isNavTabBarIsVisible() {
		return isElementAppeared(NavigationTabBar, 5);
	}
	
}