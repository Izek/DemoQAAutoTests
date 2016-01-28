package com.shum.demoqa.page.footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;

public class Footer extends AbstractPage {

	public Footer(WebDriver wDriver) {
		this.wDriver = wDriver;
	}

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]//div/aside/h3[text()=\"About Us\"]")
	WebElement footerHeader;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"container\"]/div//aside/div[@class=\"textwidget\"]")
	WebElement footerDescription;

	// Baseline Locators
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p")
	WebElement footerBaseLine;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p/a[@href=\"http://toolsqa.com/\"]")
	WebElement toolsQALink;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div[@class=\"site-info\"]/p/a[@href=\"http://oneiricindia.com/\"]")
	WebElement oneiricTechLink;

	// SocialMedia links
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"facebook\"]/a/i")
	WebElement facebookLink;

	@FindBy(xpath = " // /html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"twitter\"]/a/i")
	WebElement twitterLink;

	@FindBy(xpath = "/html/body/div[@id=\"page\"]/footer[@id=\"colophon\"]/div/div/div/aside/ul/li[@class=\"gplus\"]/a/i")
	WebElement googlePlusLink; 

	public boolean isFooterOnPage() {
		return isElementAppeared(footerHeader, 5);
	}

}
