package com.shum.demoqa.test.content.breadcrumbs;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.content.breadcrumbs.BreadCrumbs;
import com.shum.demoqa.tests.BaseTest;

public class BreadCrumbsTests extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openHomePageBreadCrumbTest() {
		WebPage webPage = new WebPage(wDriver);

		webPage.navBar.openContactPage().getBreadCrumbs().isBreadCrumbsPresent();
	}
	
	@Test
	public void verifyBreadCrumbsTitleTest() {
		WebPage webPage = new WebPage(wDriver);
		
		webPage.navBar.openContactPage();
		System.out.println(webPage.breadCrumbs.getBreadCrumbsTitle());
		
		webPage.navBar.openTabsPage();
		System.out.println(webPage.breadCrumbs.getBreadCrumbsTitle());
		
		wDriver.get("http://demoqa.com/author/admin/");
		System.out.println(webPage.breadCrumbs.getBreadCrumbsTitle());
		
		
		wDriver.get("http://demoqa.com/sample-post2/");
		System.out.println(webPage.breadCrumbs.getBreadCrumbsTitle());
		
	}
}