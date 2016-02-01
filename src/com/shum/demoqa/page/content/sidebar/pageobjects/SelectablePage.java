package com.shum.demoqa.page.content.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class SelectablePage extends WebPage {

	public SelectablePage(WebDriver wDriver) {
		super(wDriver);

		if (!isSelectablePageOpened()) {
			throw new PageNotFoundException("'Selectable' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Selectable\"]")
	WebElement selectablePageHeader;

	public boolean isSelectablePageOpened() {
		return isElementAppeared(selectablePageHeader, 5);
	}
}
