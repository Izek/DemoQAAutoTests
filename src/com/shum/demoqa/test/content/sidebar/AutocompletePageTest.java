package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class AutocompletePageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openAutocompletePageTest() {
		WebPage wPage = new WebPage(wDriver); wPage.sideBar.openAutocompletePage();
	}

	@Test
	public void navigateToAutoompletePageTest() {
		WebPage wPage = new WebPage(wDriver); wPage.navBar.openHomePage().sideBar.navigateToAutocompletePage();
		
	}

}
