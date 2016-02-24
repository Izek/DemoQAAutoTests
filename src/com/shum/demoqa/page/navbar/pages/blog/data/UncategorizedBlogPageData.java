package com.shum.demoqa.page.navbar.pages.blog.data;

public interface UncategorizedBlogPageData {

	// TODO: Add locators for 'Uncategorized' page.

	public final static String UNCATEGORIZED_BLOG_PAGE_SEARCH_FIELD_XPATH = "/html/body//main/form[@class=\"search-form\"]/div//input";
	public final static String UNCATEGORIZED_BLOG_PAGE_SEARCH_BUTTON_XPATH = "/html/body//main/form[@class=\"search-form\"]/div//span/button";
	
	public final static String UNCATEGORIZED_BLOG_PAGE_NOTHING_FOUND_HEADER_XPATH = "/html/body//main/section/header/h1";
	public final static String UNCATEGORIZED_BLOG_PAGE_NOTHING_FOUND_TEXT_XPATH = "/html/body//main/section/div/p";
	
	public final static String UNCATEGORIZED_BLOG_PAGE_HEADER_XPATH = "/html/body//main/header/div/h1";
	public final static String UNCATEGORIZED_BLOG_PAGE_HEADER_ICON_XPATH = "/html/body//main/header/div/p/a/i";
	// Spample Post One

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_ONE_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/h2/";
	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_ONE_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/footer/p/a[contains(text(), \"Read more\")]";
	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_ONE_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/div/span/a";

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_ONE_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/div/a/img";

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_ONE_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

	// Spample Post Two

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_TW0_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/h2/";
	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_TW0_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/footer/p/a[contains(text(), \"Read more\")]";
	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_TW0_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/div/span/a";

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_TWO_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/a/img";

	public final static String UNCATEGORIZED_BLOG_PAGE_SAMPLE_POST_TWO_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

}
