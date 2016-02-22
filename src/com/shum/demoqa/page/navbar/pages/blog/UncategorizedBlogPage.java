package com.shum.demoqa.page.navbar.pages.blog;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.exceptions.PageNotFoundException;

public class UncategorizedBlogPage extends BlogBasePage {

	public UncategorizedBlogPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		if (!isUncategorizedBlogPageOpened()) {
			throw new PageNotFoundException("'Uncategorized' blog page was not opened!");
		}
	}

	private boolean isUncategorizedBlogPageOpened() {
		// TODO Auto-generated method stub
		return false;
	}

}
