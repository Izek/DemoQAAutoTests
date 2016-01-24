package com.shum.demoqa.tests.basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shum.demoqa.page.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.tests.BaseTest;

public class AboutUsPageTest extends BaseTest {

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
