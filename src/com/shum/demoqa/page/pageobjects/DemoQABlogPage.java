package com.shum.demoqa.page.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class DemoQABlogPage extends NavigationTabBarPage {

	public DemoQABlogPage(WebDriver wDriver) {
		super(wDriver);

		PageFactory.initElements(wDriver, this);

		if (!isBlogPageOpened()) {
			throw new PageNotFoundException("'Blog' page was not opened!");
		}
	}

	
//	TODO:this code is proper. Bug: Web page has no header
//	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Blog\"]")
//	WebElement blogHeader;
	
	// TODO: Change on different assertion
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol/li/span[text()=\"Blog\"]")
	WebElement blogHeader;
	
	

	private boolean isBlogPageOpened() {
		return isElementAppeared(blogHeader, 5);
	}
}