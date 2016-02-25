package com.shum.demoqa.page.navbar.data.pages;

public interface BlogPageData {

	// Spample Post One element locators
	public final static String BLOG_PAGE_SAMPLE_POST_ONE_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/h2";
	public final static String BLOG_PAGE_SAMPLE_POST_ONE_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/div/span/a";

	public final static String BLOG_PAGE_SAMPLE_POST_ONE_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/div/a/img";
	public final static String BLOG_PAGE_SAMPLE_POST_ONE_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

	public final static String BLOG_PAGE_SAMPLE_POST_ONE_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/footer/p/a[@class=\"btn btn-primary\"][contains(text(), \"Read more\")]";

	// Spample Post Two element locators
	public final static String BLOG_PAGE_SAMPLE_POST_TWO_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/h2";
	public final static String BLOG_PAGE_SAMPLE_POST_TWO_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/div/span/a";

	public final static String BLOG_PAGE_SAMPLE_POST_TWO_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/a/img";
	public final static String BLOG_PAGE_SAMPLE_POST_TWO_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

	public final static String BLOG_PAGE_SAMPLE_POST_TWO_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/footer/p/a[@class=\"btn btn-primary\"][contains(text(), \"Read more\")]";

}
