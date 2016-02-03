package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class DatepickerPage extends WebPage {

	public DatepickerPage(WebDriver wDriver) {
		super(wDriver);

		if (!isDatepickerPageOpened()) {
			throw new PageNotFoundException("'Datepicker' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1[text()=\"Datepicker\"]")
	WebElement datepickerHeader;

	public boolean isDatepickerPageOpened() {
		return isElementAppeared(datepickerHeader, 5);
	}
}
