package com.shum.demoqa.page.content.breadcrumbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;

public class BreadCrumbs extends AbstractPage {

	public BreadCrumbs(WebDriver wDriver) {
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

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol[@id=\"breadcrumbs\"]/li[@class=\"active\"]/span")
	public static WebElement breadCrumbsTitle;

	public boolean isBreadCrumbsPresent() {
		return isElementAppeared(breadCrumbsLocator, 5);
	}

	public String getBreadCrumbsTitle() {
		return breadCrumbsTitle.getText();
	}
}
