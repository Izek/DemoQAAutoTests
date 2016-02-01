package com.shum.demoqa.page.content.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class AccordionPage extends WebPage {

	public AccordionPage(WebDriver wDriver) {
		super(wDriver);

		if (!isAccordionPageOpened()) {
			throw new PageNotFoundException("'Accordion' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1[text()=\"Accordion\"]")
	WebElement accordionHeader;

	public boolean isAccordionPageOpened() {
		return isElementAppeared(accordionHeader, 5);
	}
}