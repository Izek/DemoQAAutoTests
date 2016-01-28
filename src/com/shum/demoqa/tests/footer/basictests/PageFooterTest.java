package com.shum.demoqa.tests.footer.basictests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.footer.Footer;
import com.shum.demoqa.tests.BaseTest;

public class PageFooterTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openContentAreaTest() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage().getFooter().isFooterOnPage();

		Footer pFoot = new Footer(wDriver);

		// homePage.navBar.openHomePage().pageFooter.focusOnElement(pFoot.getTwiLink());

		homePage.navBar.openHomePage();

		WebElement aboutTabButton = wDriver.findElement(
				By.xpath("/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"About us\"]"));

		focusOnElement(aboutTabButton);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void openToolTip() {

		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage().getFooter().isFooterOnPage();

		WebElement aboutTabButton = wDriver.findElement(
				By.xpath("/html/body/div[@id=\"page\"]//ul[@id=\"menu-primary-menu\"]//a[@title=\"About us\"]"));

		String titleText = aboutTabButton.toString();

		System.out.println(titleText);
		
		focusOnElement(aboutTabButton);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test");

	
		WebElement wEle = wDriver.findElement(By.cssSelector("li.facebook a.bstooltip"));
		homePage.footer.focusOnElement(wEle);
		
		
		System.out.println(wEle.getText());
		
		homePage.isElementAppeared(Footer.footerHeader, 5);
		
	}

	public void focusOnElement(WebElement webElement) {
		new Actions(wDriver).moveToElement(webElement).perform();

	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
