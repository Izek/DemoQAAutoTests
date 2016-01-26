package com.shum.demoqa.page.content;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.sidebar.SideBar;

public class PageContent extends WebPage {


	private SideBar SideBar;
	
	public PageContent(WebDriver wDriver) {
		super(wDriver);
		
		SideBar = new SideBar(wDriver);

	}

}
