package com.shum.demoqa.tests.footer.basictests;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class PageFooterTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openContentAreaTest() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage().getFooter().isFooterOnPage();
	}
	
}
