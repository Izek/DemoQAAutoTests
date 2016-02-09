package com.shum.demoqa.page.navbar.data.pages;

public interface HomePageData {

	// public final static String HOME_PAGE_HEADER =
	// "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Home\"]";

	public final static String HOME_PAGE_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/header/h1";
	
	// Description headers
	public final static String HOME_PAGE_UNIQUE_AND_CLEAN_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[1]/h5";
	public final static String HOME_PAGE_CUSTOMER_SUPPORT_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[2]/h5";
	public final static String    HOME_PAGE_VERY_FLEXIBLE_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[3]/h5";		
			
	// Description images
	public final static String HOME_PAGE_UNIQUE_AND_CLEAN_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/a";
	public final static String HOME_PAGE_CUSTOMER_SUPPORT_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/i/a";
	public final static String    HOME_PAGE_VERY_FLEXIBLE_IMG_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/i/a";

	// Description text
	public final static String HOME_PAGE_UNIQUE_AND_CLEAN_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[1]/div/p[2]";
	public final static String HOME_PAGE_CUSTOMER_SUPPORT_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[2]/div/p[2]";
	public final static String    HOME_PAGE_VERY_FLEXIBLE_DESCR_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div[3]/div/p[2]";

	// /html/body/div[@id="page"]/div[@id="content"]/div[@id="primary"]/main[@id="main"]/article/div/div/div[@id="tabs222"]

	// Home page TabBar location xpaths
	public final static String   HOME_PAGE_TABBAR_ACTIVE_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[@aria-selected=\"true\"]/a";
	public final static String HOME_PAGE_TABBAR_INACTIVE_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[@aria-selected=\"false\"]/a";

	public final static String  HOME_PAGE_TABBAR_HOVERED_TAB = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul/li[contains(@class, 'ui-state-hover')]";

	public final static String HOME_PAGE_TABBAR_TAB_ONE = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul[@id=\"tab_ul\"]/li/a[text()=\"Tab 1 \"]";
	public final static String HOME_PAGE_TABBAR_TAB_TWO = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul[@id=\"tab_ul\"]/li/a[text()=\"Tab 2 \"]";
	public final static String HOME_PAGE_TABBAR_TAB_THREE = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul[@id=\"tab_ul\"]/li/a[text()=\"Tab 3 \"]";
	public final static String HOME_PAGE_TABBAR_TAB_FOUR = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul[@id=\"tab_ul\"]/li/a[text()=\"Tab 4 \"]";
	public final static String HOME_PAGE_TABBAR_TAB_FIVE = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/ul[@id=\"tab_ul\"]/li/a[text()=\"Tab 5 \"]";

}