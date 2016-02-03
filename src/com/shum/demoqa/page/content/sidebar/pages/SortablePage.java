package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class SortablePage extends WebPage {

	public SortablePage(WebDriver wDriver) {
		super(wDriver);

		if (!isSortablePageOpened()) {
			throw new PageNotFoundException("'Sortable' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Sortable\"]")
	WebElement sortablePageHeader;

	public boolean isSortablePageOpened() {
		return isElementAppeared(sortablePageHeader, 5);
	}
}
