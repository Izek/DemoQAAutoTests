package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.BlogPage;
import com.shum.demoqa.tests.BaseTest;

public class BlogPageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void blogPageTitleTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();
		
		System.out.println(blogPage.getPageTitle());
	}

}
