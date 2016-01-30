package com.shum.demoqa.page.content.sidebar.pageobjects;

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

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1[text()=\"Draggable\"]")
	WebElement draggableHeader;

	public boolean isDraggablePageOpened() {
		return isElementAppeared(draggableHeader, 5);
	}
}
