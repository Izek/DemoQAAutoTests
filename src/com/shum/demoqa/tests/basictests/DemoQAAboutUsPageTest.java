package com.shum.demoqa.tests.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.pages.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class DemoQAAboutUsPageTest extends BaseTest {

	@Before
	public void setUp() {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void openDemoQAAboutUsPageTest(){
		
		NavigationTabBarPage NavBar = new NavigationTabBarPage(wDriver);
		
		NavBar.openDemoQAAboutUsPage();
		
	}
}
