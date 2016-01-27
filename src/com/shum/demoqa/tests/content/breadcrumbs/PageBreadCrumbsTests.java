package com.shum.demoqa.tests.content.breadcrumbs;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.tests.BaseTest;

public class PageBreadCrumbsTests extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	//@Test
	public void openContentAreaTest() {
		NavigationTabBar homePage = new NavigationTabBar(wDriver);

		// homePage.getNBar().openHomePage().getPFooter().isFooterOnPage();
		homePage.openHomePage().getPFooter().isFooterOnPage();
		
	}
	
	//@Test
		public void openHomePageBreadCrumbTest() {
			WebPage webPage = new WebPage(wDriver);
			
		
		}
}