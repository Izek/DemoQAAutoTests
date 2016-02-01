package com.shum.demoqa.page.content.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class MenuPage extends WebPage {

	public MenuPage(WebDriver wDriver) {
		super(wDriver);

		if (!isMenuPageOpened()) {
			throw new PageNotFoundException("'Menu' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1[text()=\"Menu\"]")
	WebElement menuHeader;

	public boolean isMenuPageOpened() {
		return isElementAppeared(menuHeader, 5);
	}
}
