package com.shum.demoqa.page.navbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.navbar.data.NavBarData;
import com.shum.demoqa.page.navbar.pages.AboutUsPage;
import com.shum.demoqa.page.navbar.pages.BlogPage;
import com.shum.demoqa.page.navbar.pages.ContactPage;
import com.shum.demoqa.page.navbar.pages.DraggablePage;
import com.shum.demoqa.page.navbar.pages.HomePage;
import com.shum.demoqa.page.navbar.pages.ServicesPage;
import com.shum.demoqa.page.navbar.pages.TabsPage;

public class NavigationTabBar extends AbstractPage {

	public NavigationTabBar(WebDriver wDriver) {
		this.wDriver = wDriver;
	}

	@FindBy(id = "site_navigation")
	WebElement NavigationTabBar;

	// TabBar buttons
	@FindBy(xpath = NavBarData.NAVBAR_HOME_TAB_BUTTON)
	WebElement homeTabButton;

	@FindBy(xpath = NavBarData.NAVBAR_ABOUT_TAB_BUTTON)
	WebElement aboutTabButton;

	@FindBy(xpath = NavBarData.NAVBAR_SERVICES_TAB_BUTTON)
	WebElement servicesTabButton;

	@FindBy(xpath = NavBarData.NAVBAR_DEMO_TAB_BUTTON)
	WebElement demoTabButton;
	@FindBy(xpath = NavBarData.NAVBAR_DRAGGABLE_TAB_BUTTON)
	WebElement draggableTabButton;
	@FindBy(xpath = NavBarData.NAVBAR_TABS_TAB_BUTTON)
	WebElement tabsTabButton;

	@FindBy(xpath = NavBarData.NAVBAR_BLOG_TAB_BUTTON)
	WebElement blogTabButton;

	@FindBy(xpath = NavBarData.NAVBAR_CONTACT_TAB_BUTTON)
	WebElement contactTabButton;

	public boolean isNavTabBarIsVisible() {
		return isElementAppeared(NavigationTabBar, 5);
	}

	// Methods to OPEN to pages by loading pages with exact address
	public HomePage openHomePage() {
		wDriver.get(NavBarData.HOME_PAGE_ADDRESS);
		return new HomePage(wDriver);
	}

	public AboutUsPage openAboutUsPage() {
		wDriver.get(NavBarData.ABOUT_US_PAGE_ADDRESS);
		return new AboutUsPage(wDriver);
	}

	public ServicesPage openServicesPage() {
		wDriver.get(NavBarData.SERVICES_PAGE_ADDRESS);
		return new ServicesPage(wDriver);
	}

	public DraggablePage openDraggablePage() {
		wDriver.get(NavBarData.DEMO_DRAGGABLE_PAGE_ADDRESS);
		return new DraggablePage(wDriver);
	}

	public TabsPage openTabsPage() {
		wDriver.get(NavBarData.DEMO_TABS_PAGE_ADDRESS);
		return new TabsPage(wDriver);
	}

	public BlogPage openBlogPage() {
		wDriver.get(NavBarData.BLOG_PAGE_ADDRESS);
		return new BlogPage(wDriver);
	}

	public ContactPage openContactPage() {
		wDriver.get(NavBarData.CONTACT_PAGE_ADDRESS);
		return new ContactPage(wDriver);
	}

	// Methods to NAVIGATE to pages by clicking on tab buttons
	public HomePage navigateToHomePage() {
		homeTabButton.click();
		return new HomePage(wDriver);
	}

	public AboutUsPage navigateToAboutUsPage() {
		aboutTabButton.click();
		return new AboutUsPage(wDriver);
	}

	public ServicesPage navigateToServicesPage() {
		servicesTabButton.click();
		return new ServicesPage(wDriver);
	}

	public DraggablePage navigateToDraggablePage() {
		demoTabButton.click();
		draggableTabButton.click();
		return new DraggablePage(wDriver);
	}

	public TabsPage navigateToTabsPage() {
		demoTabButton.click();
		tabsTabButton.click();
		return new TabsPage(wDriver);
	}

	public BlogPage navigateToBlogPage() {
		blogTabButton.click();
		return new BlogPage(wDriver);
	}

	public ContactPage navigateToContactPage() {
		contactTabButton.click();
		return new ContactPage(wDriver);
	}
}