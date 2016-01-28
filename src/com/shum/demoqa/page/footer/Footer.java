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

	public boolean isFooterOnPage() {
		return isElementAppeared(footerHeader, 5);
	}

}
