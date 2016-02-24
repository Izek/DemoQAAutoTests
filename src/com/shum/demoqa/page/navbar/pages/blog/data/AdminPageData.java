package com.shum.demoqa.page.navbar.pages.blog.data;

public interface AdminPageData {

	public final static String ADMIN_PAGE_SAMPLE_POST_HEADER_NAME_XPATH = "/html/body/div/div/section/main/header/h1/span";

	public final static String ADMIN_PAGE_ARTICLE_COUNT_LINK_XPATH = "/html/body//main/div/h4[@class=\"author-meta-title\"]/a";

	// Spample Post One

	public final static String ADMIN_PAGE_SAMPLE_POST_ONE_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/h2/";
	public final static String ADMIN_PAGE_SAMPLE_POST_ONE_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/div/span/a";

	public final static String ADMIN_PAGE_SAMPLE_POST_ONE_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/div/a/img";

	public final static String ADMIN_PAGE_SAMPLE_POST_ONE_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

	public final static String ADMIN_PAGE_SAMPLE_POST_ONE_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/footer/p/a[contains(text(), \"Read more\")]";

	// Spample Post Two

	public final static String ADMIN_PAGE_SAMPLE_POST_TW0_HEADER_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/h2/";
	public final static String ADMIN_PAGE_SAMPLE_POST_TW0_POSTED_ON_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/header/div/span/a";

	public final static String ADMIN_PAGE_SAMPLE_POST_TWO_IMAGE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/a/img";

	public final static String ADMIN_PAGE_SAMPLE_POST_TWO_DESCR_XPATH = "/html/body//main/article[@id=\"post-379\"]/div/p";

	public final static String ADMIN_PAGE_SAMPLE_POST_TW0_READ_MORE_LINK_XPATH = "/html/body//main/article[@id=\"post-379\"]/footer/p/a[contains(text(), \"Read more\")]";

}
