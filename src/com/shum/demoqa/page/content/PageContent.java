package com.shum.demoqa.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.content.breadcrumbs.PageBreadCrumbs;
import com.shum.demoqa.page.content.sidebar.SideBar;

public class PageContent extends WebPage {

	static SideBar SideBar;
	static PageBreadCrumbs BCrumps;

	public PageContent(WebDriver wDriver) {
		super(wDriver);

		SideBar = new SideBar(wDriver);
		BCrumps = PageFactory.initElements(wDriver, PageBreadCrumbs.class);//new PageBreadCrumbs(wDriver);
	}

}
