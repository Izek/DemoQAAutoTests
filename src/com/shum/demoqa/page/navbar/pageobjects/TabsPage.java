package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.page.sidebar.SideBar;

public class TabsPage extends WebPage {

	public TabsPage(WebDriver wDriver) {
		super(wDriver);

		// Page components are initialized at moment of page creation
		setSideBar(PageFactory.initElements(wDriver, SideBar.class));
		setNavBar(PageFactory.initElements(wDriver, NavigationTabBar.class));

		PageFactory.initElements(wDriver, this);

		if (!isDraggablePageOpened()) {
			throw new PageNotFoundException("'Tabs' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Tabs\"]")
	WebElement tabsHeader;

	private boolean isDraggablePageOpened() {
		return isElementAppeared(tabsHeader, 5);
	}
}