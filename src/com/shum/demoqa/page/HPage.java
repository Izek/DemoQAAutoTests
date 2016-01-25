package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.page.sidebar.pageobjects.SideBarPage;

public class HPage extends Page {

	public HPage(WebDriver wDriver) {
		super(wDriver);

		SideBar = new SideBarPage(wDriver);
		NavBar = new NavigationTabBarPage(wDriver);

	//	PageFactory.initElements(wDriver, SideBar);
	//	PageFactory.initElements(wDriver, NavBar);
		PageFactory.initElements(wDriver, this);

	//	if (!isHomePageOpened()) {
	//		throw new PageNotFoundException("'Home' page was not opened!");
	//	}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Home\"]")
	WebElement homeHeader;

	public boolean isHomePageOpened() {
		return isElementAppeared(homeHeader, 5);
	}
}