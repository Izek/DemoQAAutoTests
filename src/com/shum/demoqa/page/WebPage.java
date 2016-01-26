package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.page.sidebar.SideBar;

public class WebPage extends AbstractPage {

	// Components of the Page: NavigationBar, SideBar, ContentArea
	private NavigationTabBar NavBar;
	private SideBar SideBar;


	// TODO: Add protected Content Area to PageObject

	public WebPage(WebDriver wDriver) {
		this.wDriver = wDriver;

		// Objects of WebPage components are initialized when Page is created
		SideBar = new SideBar(wDriver);
		NavBar = new NavigationTabBar(wDriver);
	}

	public NavigationTabBar getNBar() {
		return NavBar;
	}

	protected void setNavBar(NavigationTabBar nBar) {
		NavBar = nBar;
	}

	public SideBar getSBar() {
		return SideBar;
	}

	protected void setSideBar(SideBar sBar) {
		SideBar = sBar;
	}

}
