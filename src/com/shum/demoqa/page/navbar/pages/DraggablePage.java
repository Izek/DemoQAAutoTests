package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class DraggablePage extends WebPage {

	public DraggablePage(WebDriver wDriver) {
		super(wDriver);

		if (!isDraggablePageOpened()) {
			throw new PageNotFoundException("'Draggable' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Draggable\"]")
	WebElement draggableHeader;

	private boolean isDraggablePageOpened() {
		return isElementAppeared(draggableHeader, 5);
	}
}
