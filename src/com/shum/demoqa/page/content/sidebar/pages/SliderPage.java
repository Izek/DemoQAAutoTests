package com.shum.demoqa.page.content.sidebar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;

public class SliderPage extends WebPage {

	public SliderPage(WebDriver wDriver) {
		super(wDriver);

		if (!isSliderPageOpened()) {
			throw new PageNotFoundException("'Slider' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Slider\"]")
	WebElement sliderPageHeader;

	public boolean isSliderPageOpened() {
		return isElementAppeared(sliderPageHeader, 5);
	}
}
