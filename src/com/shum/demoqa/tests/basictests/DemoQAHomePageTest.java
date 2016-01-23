package com.shum.demoqa.tests.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.pages.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;
import com.shum.demoqa.utils.TData;

public class DemoQAHomePageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	//@Test
	public void openDemoQA() {

		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);

		Assert.assertTrue(NavBar.isNavTabBarIsVisible(), "NO!!!!!");
	}

	@Test
	public void openDemoQAHomePageTest() 
	{
		NavigationTabBarPage DemoQAHome = new NavigationTabBarPage(wDriver);
		
		DemoQAHome.openDemoQAHomePage();
		
		Assert.assertEquals(DemoQAHome.getPageTitle(), TData.HOME_PAGE_HEADER);
	}
}