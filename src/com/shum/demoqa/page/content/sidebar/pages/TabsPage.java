package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class TabsPage extends WebPage {

	public TabsPage(WebDriver wDriver) {
		super(wDriver);

		if (!isTabsPageOpened()) {
			throw new PageNotFoundException("'Tabs' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Tabs\"]")
	WebElement tabsHeader;

	private boolean isTabsPageOpened() {
		return isElementAppeared(tabsHeader, 5);
	}
}