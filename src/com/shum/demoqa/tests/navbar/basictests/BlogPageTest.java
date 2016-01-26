package com.shum.demoqa.tests.navbar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class BlogPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openBlogPageTest() {
		WebPage bPage = new WebPage(wDriver);
		bPage.getNBar().openBlogPage();
	}

	@Test
	public void navigateToBlogPageTest() {
		WebPage bPage = new WebPage(wDriver);
		bPage.getNBar().openHomePage().getNBar().navigateToBlogPage();
	}

}