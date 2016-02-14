package com.shum.demoqa.page.navbar.data.pages;

public interface TabsPageData {
	
	public final static String TABS_PAGE_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/header/h1";
	
	public final static String TABS_PAGE_TAB_BUTTON_ONE_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/ul/li[contains(@aria-controls, \"tabs-1\")]";
	public final static String TABS_PAGE_TAB_BUTTON_TWO_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/ul/li[contains(@aria-controls, \"tabs-2\")]";
	public final static String TABS_PAGE_TAB_BUTTON_THREE_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/ul/li[contains(@aria-controls, \"tabs-3\")]";
	
	public final static String TABS_PAGE_TAB_ONE_CONTENT_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/div[@id=\"tabs-1\"]";
	public final static String TABS_PAGE_TAB_TWO_CONTENT_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/div[@id=\"tabs-2\"]";
	public final static String TABS_PAGE_TAB_THREE_CONTENT_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main/article/div/div[@id=\"tabs222\"]/div[@id=\"tabs-3\"]";
}
