package com.shum.demoqa.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	protected WebDriver wDriver;

	@Before
	public void setUp() {
		wDriver = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		wDriver.close();
	}
}
