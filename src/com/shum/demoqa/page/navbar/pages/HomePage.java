package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.HomePageData;

public class HomePage extends WebPage {

	public HomePage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isHomePageOpened()) {
			throw new PageNotFoundException("'Home' page was not opened!");
		}
	}

	@FindBy(xpath = HomePageData.HOME_PAGE_HEADER_XPATH)
	WebElement homeHeader;

	// Description section
	@FindBy(xpath = HomePageData.HOME_PAGE_UNIQUE_AND_CLEAN_IMG_XPATH)
	WebElement hPageUniqueAndCleanIMG;
	@FindBy(xpath = HomePageData.HOME_PAGE_CUSTOMER_SUPPORT_IMG_XPATH)
	WebElement hPageCustomerSupportIMG;
	@FindBy(xpath = HomePageData.HOME_PAGE_VERY_FLEXIBLE_IMG_XPATH)
	WebElement hPageVeryFlexibleIMG;

	@FindBy(xpath = HomePageData.HOME_PAGE_UNIQUE_AND_CLEAN_DESCR_XPATH)
	WebElement hPageUniqueAndCleanDescr;
	@FindBy(xpath = HomePageData.HOME_PAGE_CUSTOMER_SUPPORT_DESCR_XPATH)
	WebElement hPageCustomerSupportDescr;
	@FindBy(xpath = HomePageData.HOME_PAGE_VERY_FLEXIBLE_DESCR_XPATH)
	WebElement hPageVeryFlexibleDescr;

	// TabBar buttons section
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_ONE)
	WebElement tabButtonOne;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_TWO)
	WebElement tabButtonTwo;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_THREE)
	WebElement tabButtonThree;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_FOUR)
	WebElement tabButtonFour;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_FIVE)
	WebElement tabButtonFive;

	public boolean isHomePageOpened() {
		return isElementAppeared(homeHeader, 5);
	}

	public void focusOnUniqueImage() {
		focusOnElement(hPageUniqueAndCleanIMG);
		this.waitForTime(500);
	}

	public void focusOnCustomerSupportImage() {
		focusOnElement(hPageCustomerSupportIMG);
		this.waitForTime(500);
	}

	public void focusOnVeryFlexibleImage() {
		focusOnElement(hPageVeryFlexibleIMG);
		this.waitForTime(500);
	}

	public WebPage clickOnUniqueImage() {
		hPageUniqueAndCleanIMG.click();
		return new WebPage(wDriver);
	}

	public WebPage clickOnCustomerSupportImage() {
		hPageCustomerSupportIMG.click();
		return new WebPage(wDriver);
	}

	public WebPage clickOnVeryFlexibleImage() {
		hPageVeryFlexibleIMG.click();
		return new WebPage(wDriver);
	}

}
