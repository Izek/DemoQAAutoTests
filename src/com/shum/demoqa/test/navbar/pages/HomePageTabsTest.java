package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.HomePage;
import com.shum.demoqa.tests.BaseTest;

public class HomePageTabsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void contentDescriptionHeadersTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openHomePage();

		HomePage hPage = new HomePage(wDriver);

		hPage.clickOnTabOne();
		hPage.clickOnTabTwo();
		hPage.clickOnTabThree();
		hPage.clickOnTabFour();
		hPage.clickOnTabFive();

		waitForTime(500);

		WebElement tHeaderOne = wDriver.findElement(By.xpath(
				"/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"primary\"]/main[@id=\"main\"]/article/div/div/div[@id=\"tabs222\"]/div[@id=\"tabs-4\"]"));
		System.out.println(tHeaderOne.getAttribute("aria-hidden"));

		hPage.clickOnTabFour();
		System.out.println(tHeaderOne.getAttribute("aria-hidden"));
		
		Assert.assertTrue(hPage.isTabActive(hPage.getTabButtonFour()), "Fail!." + hPage.getTabButtonFour().getText());
		
		Assert.assertFalse(hPage.isTabActive(hPage.getTabButtonTwo()), "Fail!." + hPage.getTabButtonTwo().getText());
		
		Assert.assertFalse(hPage.isTabActive(hPage.getTabButtonOne()), "Fail!." + hPage.getTabButtonOne().getText());
		
	}
}