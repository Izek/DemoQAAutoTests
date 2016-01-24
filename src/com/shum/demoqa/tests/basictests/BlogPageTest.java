package com.shum.demoqa.tests.basictests;

import org.junit.Test;

import com.shum.demoqa.page.pageobjects.NavigationTabBarPage;
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
	public void openDemoQADraggablePageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		NavBar.openBlogPage();
	}

}
