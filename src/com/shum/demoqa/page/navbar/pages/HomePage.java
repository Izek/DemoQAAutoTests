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

	// Headers description section

	// Description section
	@FindBy(xpath = HomePageData.HOME_PAGE_UNIQUE_AND_CLEAN_HEADER_XPATH)
	WebElement hPageUniqueAndCleanHeader;
	@FindBy(xpath = HomePageData.HOME_PAGE_CUSTOMER_SUPPORT_HEADER_XPATH)
	WebElement hPageCustomerSupportHeader;
	@FindBy(xpath = HomePageData.HOME_PAGE_VERY_FLEXIBLE_HEADER_XPATH)
	WebElement hPageVeryFlexibleHeader;

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
	private WebElement tabButtonTwo;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_THREE)
	private WebElement tabButtonThree;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_FOUR)
	private WebElement tabButtonFour;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_FIVE)
	private WebElement tabButtonFive;

	// TabBar content headers
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_CONTENT_HEADER_ONE)
	private WebElement tabButtonContentHeaderOne;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_CONTENT_HEADER_TWO)
	private WebElement tabButtonContentHeaderTwo;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_CONTENT_HEADER_THREE)
	private WebElement tabButtonContentHeaderThree;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_CONTENT_HEADER_FOUR)
	private WebElement tabButtonContentHeaderFour;
	@FindBy(xpath = HomePageData.HOME_PAGE_TABBAR_TAB_CONTENT_HEADER_FIVE)
	private WebElement tabButtonContentHeaderFive;

	public boolean isHomePageOpened() {
		return isElementAppeared(homeHeader, 5);
	}

	// Get Description headers
	public String getUniqueDescrHeader() {
		return hPageUniqueAndCleanHeader.getText();
	}

	public String getCustomerSupportDescrHeader() {
		return hPageCustomerSupportHeader.getText();
	}

	public String getVeryFlexibleDescrHeader() {
		return hPageVeryFlexibleHeader.getText();
	}

	// Get Description of images
	public String getUniqueDescr() {
		return hPageUniqueAndCleanDescr.getText();
	}

	public String getCustomerSupportDescr() {
		return hPageCustomerSupportDescr.getText();
	}

	public String getVeryFlexibleDescr() {
		return hPageVeryFlexibleDescr.getText();
	}

	// Focus on image methods
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

	// Click on image methods
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

	// Tabs clicking methods
	public HomePage clickOnTabOne() {
		focusOnElement(tabButtonOne);
		tabButtonOne.click();
		return this;
	}

	public HomePage clickOnTabTwo() {
		focusOnElement(tabButtonTwo);
		tabButtonTwo.click();
		return this;
	}

	public HomePage clickOnTabThree() {
		focusOnElement(tabButtonThree);
		tabButtonThree.click();
		return this;
	}

	public HomePage clickOnTabFour() {
		focusOnElement(tabButtonFour);
		tabButtonFour.click();
		return this;
	}

	public HomePage clickOnTabFive() {
		focusOnElement(tabButtonFive);
		tabButtonFive.click();
		return this;
	}

	// Tabs getters
	public WebElement getTabButtonOne() {
		return tabButtonOne;
	}

	public WebElement getTabButtonTwo() {
		return tabButtonTwo;
	}

	public WebElement getTabButtonThree() {
		return tabButtonThree;
	}

	public WebElement getTabButtonFour() {
		return tabButtonFour;
	}

	public WebElement getTabButtonFive() {
		return tabButtonFive;
	}

	// Tab content header's getters
	public WebElement getTabButtonContentHeaderOne() {
		return tabButtonContentHeaderOne;
	}

	public WebElement getTabButtonContentHeaderTwo() {
		return tabButtonContentHeaderTwo;
	}

	public WebElement getTabButtonContentHeaderThree() {
		return tabButtonContentHeaderThree;
	}

	public WebElement getTabButtonContentHeaderFour() {
		return tabButtonContentHeaderFour;
	}

	public WebElement getTabButtonContentHeaderFive() {
		return tabButtonContentHeaderFive;
	}

	public boolean isTabActive(WebElement tabElement) {
		if (tabElement.getAttribute("aria-selected").equals("true")) {
			return true;
		} else {
			return false;
		}
	}

}
