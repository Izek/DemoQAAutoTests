package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.utils.TData;

public class NavigationTabBarPage extends AbstractPage {

	public NavigationTabBarPage(WebDriver wDriver) throws PageNotFoundException {

		this.wDriver = wDriver;

		// PageFactory.initElements(wDriver, this);

		// if (!isNavTabBarIsVisible()) {
		// throw new PageNotFoundException("Navigaion Bar was not opened!..");
		// }
	}

	@FindBy(id = "site_navigation")
	WebElement NavigationTabBar;

	// TabBar buttons
	@FindBy(xpath = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Home\"]")
	WebElement homeTabButton;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"About us\"]")
	WebElement aboutTabButton;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Services\"]")
	WebElement servicesTabButton;

	public boolean isNavTabBarIsVisible() {
		return isElementAppeared(NavigationTabBar, 5);
	}

	// Methods to OPEN to pages by loading pages with exact address
	public HomePage openHomePage() {
		wDriver.get(TData.HOME_PAGE);
		return new HomePage(wDriver);
	}

	public AboutUsPage openAboutUsPage() {
		wDriver.get(TData.ABOUT_US_PAGE);
		return new AboutUsPage(wDriver);
	}

	public ServicesPage openServicesPage() {
		wDriver.get(TData.SERVICES_PAGE);
		return new ServicesPage(wDriver);
	}
	
	public DraggablePage openDraggablePage() {
		wDriver.get(TData.DEMO_DRAGGABLE_PAGE);
		return new DraggablePage(wDriver);
	}
	
	public TabsPage openTabsPage() {
		wDriver.get(TData.DEMO_TABS_PAGE);
		return new TabsPage(wDriver);
	}
	
	public BlogPage openBlogPage() {
		wDriver.get(TData.BLOG_PAGE);
		return new BlogPage(wDriver);
	}
	
	public ContactPage openContactPage() {
		wDriver.get(TData.CONTACT_PAGE);
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
}