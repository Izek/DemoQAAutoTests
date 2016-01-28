package com.shum.demoqa.page.content;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.page.WebPage;

public class PageContent extends WebPage {

	//public static SideBar SideBar;
	//public BreadCrumbs BCrumps;

	public PageContent(WebDriver wDriver) {
		super(wDriver);
		this.wDriver  = wDriver;

		//SideBar = PageFactory.initElements(wDriver, SideBar.class);//new SideBar(wDriver);
		//BCrumps = PageFactory.initElements(wDriver, BreadCrumbs.class);//new PageBreadCrumbs(wDriver);
	}

}
