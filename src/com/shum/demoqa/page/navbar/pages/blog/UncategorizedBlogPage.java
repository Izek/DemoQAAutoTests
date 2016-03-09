package com.shum.demoqa.page.navbar.pages.blog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.navbar.pages.blog.data.UncategorizedBlogPageData;

public class UncategorizedBlogPage extends BlogBasePage {

	public UncategorizedBlogPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		wDriver.get("http://demoqa.com/category/uncategorized/");

		if (!isUncategorizedBlogPageOpened()) {
			throw new PageNotFoundException("'Uncategorized' blog page was not opened!");
		}
	}

	@FindBy(xpath = UncategorizedBlogPageData.UNCATEGORIZED_BLOG_PAGE_HEADER_XPATH)
	@CacheLookup
	WebElement uncategorizedPageHeader;

	private boolean isUncategorizedBlogPageOpened() {
		return isElementAppeared(uncategorizedPageHeader, 5);
	}

	public String getPageHeader() {
		return uncategorizedPageHeader.getText();
	}

}
