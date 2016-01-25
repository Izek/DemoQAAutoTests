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
		
		this.wDriver = wDriver;

		SideBar = PageFactory.initElements(wDriver, SideBarPage.class);// new SideBarPage(this.wDriver);
		NavBar = PageFactory.initElements(wDriver, NavigationTabBarPage.class);//new NavigationTabBarPage(this.wDriver);

		//PageFactory.initElements(this.wDriver, SideBar);
		//PageFactory.initElements(this.wDriver, NavBar);
		PageFactory.initElements(wDriver, this);

//		if (!isHPageOpened()) {
//			throw new PageNotFoundException("'Home' page was not opened!");
//					}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Home\"]")
	WebElement homeHeader;

	public boolean isHPageOpened() {
		return isElementAppeared(homeHeader, 7);
	}
}