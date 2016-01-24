package com.shum.demoqa.tests.navbar.basictests;

import org.junit.Test;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
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
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);	
		NavBar.openDraggablePage();
	}

	@Test
	public void navigateToDraggablePageTest() {
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);	
		NavBar.openHomePage().navigateToDraggablePage();
	}
	
}
