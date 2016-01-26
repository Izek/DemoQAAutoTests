package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.page.sidebar.SideBar;

public class HomePage extends WebPage {

	public HomePage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		// Page components are initialized at moment of page creation
		setSideBar(PageFactory.initElements(wDriver, SideBar.class));
		setNavBar(PageFactory.initElements(wDriver, NavigationTabBar.class));

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
