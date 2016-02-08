package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.HomePage;
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

	// @Test
	public void focusOnElementsTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();

		WebElement imageLogo = wDriver.findElement(By.xpath(
				"/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div/p/a"));

		hPage.focusOnElement(imageLogo);
		hPage.waitForTime(2000);

		imageLogo.click();

		wDriver.getCurrentUrl();

		wDriver.navigate().back();

		HomePage homePage = new HomePage(wDriver);
		homePage.isHomePageOpened();
	}

	@Test
	public void descriptionContentTest() {

		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);

		hPage.waitForTime(2000);
		hPage.focusOnCustomerSupportImage();
		hPage.focusOnUniqueImage();
		hPage.focusOnVeryFlexibleImage();

		wPage = hPage.clickOnImage();

		hPage.waitForTime(2000);

		wDriver.navigate().back();
		hPage.isHomePageOpened();
	}

}
