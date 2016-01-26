package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.sidebar.pageobjects.SideBar;

public class AboutUsPage extends WebPage {

	public AboutUsPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		// Page components are initialized at moment of page creation
		setSideBar(PageFactory.initElements(wDriver, SideBar.class));
		setNavBar(PageFactory.initElements(wDriver, NavigationTabBar.class));

		PageFactory.initElements(wDriver, this);

		if (!isAboutUsPageOpened()) {
			throw new PageNotFoundException("'About us' Page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"About us\"]")
	WebElement aboutUsHeader;

	public boolean isAboutUsPageOpened() {
		return isElementAppeared(aboutUsHeader, 5);
	}
}
