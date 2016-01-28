package com.shum.demoqa.tests.footer.basictests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

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

	/**
	 * Verifies if Page footer is present on page by asserting appropriate
	 * element
	 */
	@Test
	public void isFooterOnPageTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();
		hPage.footer.isFooterOnPage();
	}

	@Test
	public void isFooterHeaderiOnPageTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();

		Assert.assertEquals(Footer.footerHeader.getText(), "About Us", "Failed!. Footer's header does not match...");
	}

	@Test
	public void isFooterDescriptionOnPageTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();

		Assert.assertEquals(Footer.footerDescription.getText(),
				"Selenium is a software testing framework for the web that facilitates the automation of browsers. "
						+ "The Selenium project produces various tools for automation testing such as Selenium IDE, "
						+ "Selenium Remote Control (RC), Selenium Grid and Selenium 2.0 & WebDriver. "
						+ "Learning all the tools will give you many different options for approaching different "
						+ "automation problems. The entire suits of tools result in a rich set of testing functions "
						+ "specially geared to the needs of testing of web application of all types.",
				"Error! Footer's description does not match expected text...");
	}

	@Test // Asserts if page baseline is present
	public void isFooterBaseLinePresentOnHomePage() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage();

		Assert.assertTrue(homePage.isElementAppeared(Footer.footerBaseLine, 5),
				"Failed!. Baseline is not present on page...");
	}

	@Test
	public void areSocialMediaButtonsFocusable() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage();

		// TODO: Add focusOnElement(WebElement webElement) method to
		// AbstractPage class

		focusOnElement(Footer.facebookLink);
		focusOnElement(Footer.twitterLink);
		focusOnElement(Footer.googlePlusLink);

	}

	/**
	 * <h1>Focuses on the <code>WebElement</code> passed to method.</h1>
	 * 
	 * Emulates <font color="red">focusing on element or hovering
	 * mouse</font color="red"> on selected element.
	 * 
	 * @param WebElement
	 * @return 
	 */
	public void focusOnElement(WebElement webElement) {
		new Actions(wDriver).moveToElement(webElement).perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
