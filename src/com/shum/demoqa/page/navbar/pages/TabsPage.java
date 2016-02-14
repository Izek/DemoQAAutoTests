package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.TabsPageData;

public class TabsPage extends WebPage {

	public TabsPage(WebDriver wDriver) {
		super(wDriver);

		if (!isTabsPageOpened()) {
			throw new PageNotFoundException("'Tabs' page was not opened!");
		}
	}

	@FindBy(xpath = TabsPageData.TABS_PAGE_HEADER_XPATH)
	private WebElement tabsHeader;

	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_BUTTON_ONE_XPATH)
	private WebElement tabOne;
	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_BUTTON_TWO_XPATH)
	private WebElement tabTwo;
	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_BUTTON_THREE_XPATH)
	private WebElement tabThree;

	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_ONE_CONTENT_XPATH)
	private WebElement tabOneContent;
	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_TWO_CONTENT_XPATH)
	private WebElement tabTwoContent;
	@FindBy(xpath = TabsPageData.TABS_PAGE_TAB_THREE_CONTENT_XPATH)
	private WebElement tabThreeContent;

	private boolean isTabsPageOpened() {
		return isElementAppeared(tabsHeader, 5);
	}

	public WebElement getTabsPageHeader() {
		return tabsHeader;
	}

	public TabsPage clickOnTabOne() {
		focusOnElement(tabOne);
		tabOne.click();
		return new TabsPage(wDriver);
	}

	public TabsPage clickOnTabTwo() {
		focusOnElement(tabTwo);
		tabTwo.click();
		return new TabsPage(wDriver);
	}

	public TabsPage clickOnTabThree() {
		focusOnElement(tabThree);
		tabThree.click();
		return new TabsPage(wDriver);
	}

	public WebElement getTabOneContent() {
		return tabOneContent;
	}

	public WebElement getTabTwoContent() {
		return tabTwoContent;
	}

	public WebElement getTabThreeContent() {
		return tabThreeContent;
	}
}