package com.shum.demoqa.page.navbar.data;

public interface NavBarData {

	public static final String HOME_PAGE = "http://demoqa.com/";

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
}
