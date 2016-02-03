package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class TooltipPage extends WebPage {

	public TooltipPage(WebDriver wDriver) {
		super(wDriver);

		if (!isTooltipPageOpened()) {
			throw new PageNotFoundException("'Tooltip' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Tooltip\"]")
	WebElement tooltipHeader;

	private boolean isTooltipPageOpened() {
		return isElementAppeared(tooltipHeader, 5);
	}
}