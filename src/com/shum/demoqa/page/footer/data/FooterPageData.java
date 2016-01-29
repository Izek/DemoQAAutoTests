package com.shum.demoqa.page.footer.data;

/**
 * <code>FooterPageData</code> interface is intended to store static final
 * values used for <code>Footer</code> class.
 * 
 * @author shum
 */
public interface FooterPageData {

	public static final String FOOTER_HEADER_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]//div/aside/h3[text()=\"About Us\"]";
	public static final String FOOTER_DESCRIPTION_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"container\"]/div//aside/div[@class=\"textwidget\"]";

	// Baseline Locators
	public static final String FOOTER_BASELINE_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p";
	public static final String FOOTER_TOOLS_QA_LINK_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p/a[@href=\"http://toolsqa.com/\"]";
	public static final String FOOTER_ONERIC_LINK_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p/a[@href=\"http://oneiricindia.com/\"]";

	// SocialMedia links
	public static final String FOOTER_FACEBOOK_LINK_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"facebook\"]/a/i";
	public static final String FOOTER_TWITTER_LINK_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"twitter\"]/a/i";
	public static final String FOOTER_GOOGLEPLUS_LINK_XPATH_LOCATOR = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"gplus\"]/a/i";

}
