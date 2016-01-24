package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class DraggablePage extends NavigationTabBarPage {

	public DraggablePage(WebDriver wDriver) {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

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
