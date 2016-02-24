package com.shum.demoqa.page.navbar.pages.blog.data;

public interface SamplePostOneData {

	public final static String SAMPLE_POST_TWO_HEADER_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/h1";
	public final static String SAMPLE_POST_TWO_POST_DATE_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/div/span/a";
	public final static String SAMPLE_POST_TWO_POST_AUTHOR_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/header/div/span/span/a";

	public final static String SAMPLE_POST_TWO_TEXT_XPATH = "/html/body//main/article[@id=\"post-377\"]/div/p";

	public final static String SAMPLE_POST_TWO_BOOKMARK_LINK_XPATH = "/html/body//main/article[@id=\"post-377\"]/footer/a";

	public final static String SAMPLE_POST_TWO_LIKE_BUTTON_XPATH = "/html/body//main/p/button/span";
	public final static String SAMPLE_POST_TWO_LIKES_COUNT_XPATH = "/html/body//main/p/span";

	public final static String SAMPLE_POST_TWO_PREVIOUS_POST_BUTTON_XPATH = "/html/body//main/ul/li/a[@rel=\"prev\"]";

	public final static String SAMPLE_POST_TWO_ADMIN_ARTICLES_COUNT_XPATH = "/html/body//main/div[@class=\"well author-meta\"]/h4/a";

	public final static String SAMPLE_POST_TWO_COMMENTS_HEADER_XPATH = "/html/body//main/div[@id=\"\"]/div/h3";

	public final static String SAMPLE_POST_TWO_COMMENTS_AUTHOR_FIELD_XPATH = "/html/body//main/div[@id=\"comments\"]/div/form[@id=\"commentform\"]//input[@id=\"author\"]";
	public final static String SAMPLE_POST_TWO_COMMENTS_EMAIL_FIELD_XPATH = "/html/body//main/div[@id=\"comments\"]/div/form[@id=\"commentform\"]//input[@id=\"email\"]";
	public final static String SAMPLE_POST_TWO_COMMENTS_URL_FIELD_XPATH = "/html/body//main/div[@id=\"comments\"]/div/form[@id=\"commentform\"]//input[@id=\"url\"]";
	public final static String SAMPLE_POST_TWO_COMMENTS_TEXT_FIELD_XPATH = "/html/body//main/div[@id=\"comments\"]/div/form[@id=\"commentform\"]//textarea[@id=\"comment\"]";

	public final static String SAMPLE_POST_TWO_COMMENTS_POST_COMMENT_XPATH = "/html/body//main/div[@id=\"comments\"]/div/form[@id=\"commentform\"]/p/button[@id=\"submit\"]";

}
