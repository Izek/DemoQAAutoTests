package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class AutocompletePage extends WebPage {

	public AutocompletePage(WebDriver wDriver) {
		super(wDriver);

		if (!isAutocompletePageOpened()) {
			throw new PageNotFoundException("'Autocomplete' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1[text()=\"Autocomplete\"]")
	WebElement autocompleteHeader;

	public boolean isAutocompletePageOpened() {
		return isElementAppeared(autocompleteHeader, 5);
	}
}
