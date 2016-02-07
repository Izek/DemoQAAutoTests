package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.tests.BaseTest;

public class HomePageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void focusOnElementsTest() {
	WebPage hPage = new WebPage(wDriver);
	
	hPage.navBar.openHomePage();
	
	WebElement imageLogo = wDriver.findElement(By.xpath("/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/a"));
	
	hPage.focusOnElement(imageLogo);
	hPage.waitForTime(2000);
	
	}

}
