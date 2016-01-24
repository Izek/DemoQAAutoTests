package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class TabsPage extends NavigationTabBarPage {

	public TabsPage(WebDriver wDriver) {
		super(wDriver);

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