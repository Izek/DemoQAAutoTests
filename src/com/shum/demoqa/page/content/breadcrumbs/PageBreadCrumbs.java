package com.shum.demoqa.page.content.breadcrumbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;

public class PageBreadCrumbs extends AbstractPage {

	public PageBreadCrumbs(WebDriver wDriver) {
		this.wDriver = wDriver;
	}

	private static final String BREADCRUMBS = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol[@id=\"breadcrumbs\"]";

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol[@id=\"breadcrumbs\"]")
	WebElement breadCrumbsLocator;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol[@id=\"breadcrumbs\"]/li/span[text()=\"Home\"]")
	WebElement breadCrumpHomeText;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol/li/a[text()=\"Home\"][@href=\"http://demoqa.com/\"]")
	WebElement breadCrumpsHomeLink;

	@FindBy(xpath = BREADCRUMBS + "/li/span[text()=\"Services\"]")
	WebElement breadCrumbsServices;

	public boolean isBreadCrumbsPresent() {
		return isElementAppeared(breadCrumbsLocator, 5);
	}
}
