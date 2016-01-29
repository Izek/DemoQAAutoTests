package com.shum.demoqa.test.navbar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class DraggablePageTest extends BaseTest {

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
		WebPage dPage = new WebPage(wDriver);
		dPage.getNBar().openDraggablePage();
	}

	@Test
	public void navigateToDraggablePageTest() {
		WebPage dPage = new WebPage(wDriver);
		dPage.getNBar().openHomePage().getNBar().navigateToDraggablePage();
	}
}
