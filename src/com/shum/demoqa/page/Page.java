package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.page.sidebar.pageobjects.SideBarPage;

public class Page extends AbstractPage {

	// Components of the Page: NavigationBar, SideBar, ContentArea
	protected NavigationTabBarPage NavBar;
	protected SideBarPage SideBar;

	// TODO: Add protected Content Area to PageObject

	// TODO: Rename/refactor Page to WebPage object name

	public Page(WebDriver wDriver) {
		this.wDriver = wDriver;

		// Objects of WebPage components are initialized when Page is created
		SideBar = new SideBarPage(wDriver);
		NavBar = new NavigationTabBarPage(wDriver);
	}

}
