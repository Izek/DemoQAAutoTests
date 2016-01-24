package com.shum.demoqa.tests.navbar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
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
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openBlogPage();
	}
	
	@Test
	public void navigateToBlogPageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		NavBar.openHomePage().navigateToBlogPage();
	}

}