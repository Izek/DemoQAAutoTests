package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class DraggablePageTest extends BaseTest {

	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	@Test
	public void openDraggablePageTest() {
		WebPage draggabePage = new WebPage(wDriver);

		draggabePage.sideBar.openDraggablePage();
	}

	@Test
	public void navigateToDraggablePageTest() {
		WebPage wPage = new WebPage(wDriver);

		wPage.navBar.openHomePage().sideBar.navigateToDraggablePage();
	}

}
