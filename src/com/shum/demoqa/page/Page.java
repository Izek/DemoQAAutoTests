package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.page.sidebar.pageobjects.SideBarPage;

public class Page extends AbstractPage {
	
	protected NavigationTabBarPage NavBar;
	protected SideBarPage SideBar;
	
	public Page(WebDriver wDriver) {
		this.wDriver = wDriver;
		
	//	SideBar = new SideBarPage(wDriver);				
	//	NavBar = new NavigationTabBarPage(wDriver);
		
		
	//	PageFactory.initElements(wDriver, SideBar);
	//	PageFactory.initElements(wDriver, NavBar);
		//PageFactory.initElements(this.wDriver, this);
	}

}
