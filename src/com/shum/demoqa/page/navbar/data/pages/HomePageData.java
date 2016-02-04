package com.shum.demoqa.page.navbar.data.pages;

public interface HomePageData {

	// public final static String HOME_PAGE_HEADER =
	// "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Home\"]";

	// TODO: Temp locator
	// /html/body/div[@id="page"]/div[@id="content"]/div[@id="primary"]/main[@id="main"]/article

	public final static String HOME_PAGE_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1";

	public final static String HOME_PAGE_UNIQUE_AND_CLEAN_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/a";
	public final static String HOME_PAGE_CUSTOMER_SUPPORT_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/i/a";
	public final static String HOME_PAGE_VERY_FLEXIBLE_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/i/a";

	//
	public final static String HOME_PAGE_UNIQUE_AND_CLEAN_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[1]/div/p[2]";
	public final static String HOME_PAGE_CUSTOMER_SUPPORT_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[2]/div/p[2]";
	public final static String HOME_PAGE_VERY_FLEXIBLE_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[3]/div/p[2]";

	// /html/body/div[@id="page"]/div[@id="content"]/div[@id="primary"]/main[@id="main"]/article/div/div/div[@id="tabs222"]

	//
	public final static String HOME_PAGE_TABBAR_ACTIVE_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[@aria-selected=\"true\"]/a";
	public final static String HOME_PAGE_TABBAR_INACTIVE_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[@aria-selected=\"false\"]/a";

	public final static String HOME_PAGE_TABBAR_HOVERED_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[contains(@class, 'ui-state-hover')]";
}