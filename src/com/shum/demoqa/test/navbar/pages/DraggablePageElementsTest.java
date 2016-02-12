package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.DraggablePage;
import com.shum.demoqa.tests.BaseTest;

public class DraggablePageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openDraggablePageTest() {
		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		
		dPage.clickOnConstraintMovementTab();
		dPage.clickOnCursorStyleTab();
		dPage.clickOnDefFuncTab();
		dPage.clickOnEventsTab();
		dPage.clickOnDraggableSortableTab();
		
	}

	
}
