package com.shum.demoqa.page.footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.footer.data.FooterPageData;

public class Footer extends AbstractPage {

	public Footer(WebDriver wDriver) {
		this.wDriver = wDriver;
	}

	@FindBy(xpath = FooterPageData.FOOTER_HEADER_XPATH_LOCATOR)
	public static WebElement footerHeader;

	@FindBy(xpath = FooterPageData.FOOTER_DESCRIPTION_XPATH_LOCATOR)
	public static WebElement footerDescription;

	// Baseline Locators
	@FindBy(xpath = FooterPageData.FOOTER_BASELINE_XPATH_LOCATOR)
	public static WebElement footerBaseLine;

	@FindBy(xpath = FooterPageData.FOOTER_TOOLS_QA_LINK_XPATH_LOCATOR)
	public static WebElement toolsQALink;

	@FindBy(xpath = FooterPageData.FOOTER_ONERIC_LINK_XPATH_LOCATOR)
	public static WebElement oneiricTechLink;

	// SocialMedia links
	@FindBy(xpath = FooterPageData.FOOTER_FACEBOOK_LINK_XPATH_LOCATOR)
	public static WebElement facebookLink;

	@FindBy(xpath = FooterPageData.FOOTER_TWITTER_LINK_XPATH_LOCATOR)
	public static WebElement twitterLink;

	@FindBy(xpath = FooterPageData.FOOTER_GOOGLEPLUS_LINK_XPATH_LOCATOR)
	public static WebElement googlePlusLink;

	public boolean isFooterOnPage() {
		return isElementAppeared(footerHeader, 5);
	}
}
