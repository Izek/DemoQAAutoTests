package com.shum.demoqa.test.content.sidebar;

import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class FramesAndWindowsPageTest extends BaseTest {

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
	public void openFramesAndWindowsPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.sideBar.openFramesAndWindowsPage();
	}

	@Test
	public void navigateToFramesAndWindowsPageTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();
		wPage.sideBar.navigateToFramesAndWindowsPage();
	}

}
