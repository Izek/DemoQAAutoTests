package com.shum.demoqa.page.navbar.data;

import com.shum.demoqa.page.navbar.NavigationTabBar;

/**
 * <code>NavBarData</code> interface stores constant data, which is used in
 * <code>NavigationTabBar</code> class.
 * <p>
 * Here are stores addresses of each web-page, which are accessible from {@link NavigationTabBar}.
 * </p>
 * 
 * @author shum
 *
 */
public interface NavBarData {

	// Web addresses of pages invoked from Navigation Tab Bar
	public static final String HOME_PAGE_ADDRESS = "http://demoqa.com/";

	public static final String ABOUT_US_PAGE_ADDRESS = "http://demoqa.com/about-us/";

	public static final String SERVICES_PAGE_ADDRESS = "http://demoqa.com/services/";

	public static final String DEMO_DRAGGABLE_PAGE_ADDRESS = "http://demoqa.com/draggable/";
	public static final String DEMO_TABS_PAGE_ADDRESS = "http://demoqa.com/tabs/";

	public static final String BLOG_PAGE_ADDRESS = "http://demoqa.com/blog/";

	public static final String CONTACT_PAGE_ADDRESS = "http://demoqa.com/contact/";

	// Navigation Bar locator buttons
	public static final String NAVBAR_SITE_NAVIGATION_ID = "site_navigation";

	public static final String NAVBAR_HOME_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Home\"]";
	public static final String NAVBAR_ABOUT_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"About us\"]";
	public static final String NAVBAR_SERVICES_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Services\"";
	public static final String NAVBAR_DEMO_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Demo\"]";
	public static final String NAVBAR_DRAGGABLE_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//ul/li/a[@title=\"Draggable\"]";
	public static final String NAVBAR_TABS_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//ul/li/a[@title=\"Tabs\"]";
	public static final String NAVBAR_BLOG_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Blog\"]";
	public static final String NAVBAR_CONTACT_TAB_BUTTON = "/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"Contact\"]";

	public static final String HOME_PAGE_HEADER = "Demoqa | Just another WordPress site";
}
