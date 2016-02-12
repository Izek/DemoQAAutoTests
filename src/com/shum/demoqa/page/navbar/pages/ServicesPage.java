package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.ServicesPageData;

public class ServicesPage extends WebPage {

	public ServicesPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isServicesPageOpened()) {
			throw new PageNotFoundException("'Services' page was not opened!");
		}
	}

	@FindBy(xpath = ServicesPageData.SERVICES_PAGE_HEADER_XPATH)
	private WebElement servicesPageHeader;

	@FindBy(xpath = ServicesPageData.SERVICES_PAGE_TEXT_XPATH)
	private WebElement servicesPageText;

	private boolean isServicesPageOpened() {
		return isElementAppeared(servicesPageHeader, 5);
	}

	public WebElement getServicesPageHeader() {
		return servicesPageHeader;
	}

	public WebElement getServicesPageText() {
		return servicesPageText;
	}
}
