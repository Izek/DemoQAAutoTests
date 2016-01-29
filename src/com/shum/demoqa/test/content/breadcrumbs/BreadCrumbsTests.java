package com.shum.demoqa.test.content.breadcrumbs;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
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
}