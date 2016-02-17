package com.shum.demoqa.page.navbar.data.pages;

public interface DraggablePageData {

	public final static String DRAGGABLE_PAGE_HEADER_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/header/h1";
	public final static String DRAGGABLE_PAGE_DESCRIPTION_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/h2";

	public final static String DRAGGABLE_PAGE_TAB_DEF_FUNCTIONALITY_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/div/div[@id=\"tabs\"]/ul/li/a[@href=\"#tabs-1\"]";
	public final static String DRAGGABLE_PAGE_TAB_CONSTRAIN_MOVEMENT_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/div/div[@id=\"tabs\"]/ul/li/a[@href=\"#tabs-3\"]";
	public final static String DRAGGABLE_PAGE_TAB_CURSOR_STYLE_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/div/div[@id=\"tabs\"]/ul/li/a[@href=\"#tabs-4\"]";
	public final static String DRAGGABLE_PAGE_TAB_EVENTS_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/div/div[@id=\"tabs\"]/ul/li/a[@href=\"#tabs-5\"]";
	public final static String DRAGGABLE_PAGE_TAB_DRAGGABLE_SORTABLE_XPATH = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div/main[@id=\"main\"]/article/div/div/div[@id=\"tabs\"]/ul/li/a[@href=\"#tabs-7\"]";

	public final static String DRAGGABLE_PAGE_TAB_DEF_FUNC_CONTAINER_XPATH = "/html/body//div[@id=\"primary\"]/main/article/div[@class=\"entry-content\"]//div[@id=\"tabs-1\"]/div[@class=\"inside_contain\"]";
	public final static String DRAGGABLE_PAGE_TAB_DEF_FUNC_DRAGGABLE_XPATH = "/html/body//div[@id=\"primary\"]/main/article/div[@class=\"entry-content\"]//div[@id=\"tabs-1\"]/div[@class=\"inside_contain\"]/div[@id=\"draggable\"][@style=\"position: relative;\"]";
}
