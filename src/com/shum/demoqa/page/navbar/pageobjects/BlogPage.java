package com.shum.demoqa.page.navbar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.sidebar.pageobjects.SideBar;

public class BlogPage extends WebPage {

	public BlogPage(WebDriver wDriver) {
		super(wDriver);

		// Page components are initialized at moment of page creation
		setSideBar(PageFactory.initElements(wDriver, SideBar.class));
		setNavBar(PageFactory.initElements(wDriver, NavigationTabBar.class));

		PageFactory.initElements(wDriver, this);

		if (!isBlogPageOpened()) {
			throw new PageNotFoundException("'Blog' page was not opened!");
		}
	}

	// TODO:this code is proper. Bug: Web page has no header
	// @FindBy(xpath =
	// "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Blog\"]")
	// WebElement blogHeader;

	// TODO: Change on different assertion
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol/li/span[text()=\"Blog\"]")
	WebElement blogHeader;

	private boolean isBlogPageOpened() {
		return isElementAppeared(blogHeader, 5);
	}
}