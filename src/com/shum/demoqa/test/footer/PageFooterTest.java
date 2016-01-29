package com.shum.demoqa.test.footer;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.footer.Footer;
import com.shum.demoqa.test.footer.data.FooterTestData;
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
	public void isFooterHeaderOnPageTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();

		Assert.assertEquals(Footer.footerHeader.getText(), "About Us", "Failed!. Footer's header does not match...");
	}

	@Test
	public void isFooterDescriptionOnPageTest() {
		WebPage hPage = new WebPage(wDriver);

		hPage.navBar.openHomePage();

		Assert.assertEquals(Footer.footerDescription.getText(), FooterTestData.FOOTER_DESCTPTION_TEXT,
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

	@Test
	public void isToolQASiteOpenedTest() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage();

		Footer.toolsQALink.click();

		Assert.assertEquals(wDriver.getTitle(), FooterTestData.FOOTER_TOOLSQA_HOMEPAGE_HEADER,
				"Failed!. 'Tools QA' Header does not match to expected.");
		Assert.assertEquals(wDriver.getCurrentUrl(), FooterTestData.FOOTER_TOOLSQA_HOMEPAGE_ADDRESS,
				"Failed!. 'Tools QA' web-site was not opened.");

	}

	@Test
	public void isOneiricSiteOpenedTest() {
		WebPage homePage = new WebPage(wDriver);

		homePage.navBar.openHomePage();

		// Getting current window
		String currentWindow = wDriver.getWindowHandle();

		// Invoking new window by clicking on appropriate link
		Footer.oneiricTechLink.click();

		// Getting all window handles
		Set<String> s = wDriver.getWindowHandles();
		Iterator<String> ite = s.iterator();

		// Iterating between window handles until expected will be active
		while (ite.hasNext()) {

			String popupHandle = ite.next().toString();

			// If current window is not expected one then switching to expected
			if (!popupHandle.contains(currentWindow)) {
				wDriver.switchTo().window(popupHandle);

				if (!wDriver.getCurrentUrl().equals(FooterTestData.FOOTER_ONEIRIC_HOMEPAGE_ADDRESS)) {
					wDriver.close();
					wDriver.switchTo().window(currentWindow);
					Assert.fail("Failed!. 'Oneiric Tech Ltd.' web-site was not opened.");
				}

				if (!wDriver.getTitle().equals(FooterTestData.FOOTER_ONEIRIC_HOMEPAGE_HEADER)) {
					wDriver.close();
					wDriver.switchTo().window(currentWindow);
					Assert.fail("Failed!. 'Oneiric Tech Ltd.' Header does not match to expected.");
				}

				// Closing current window after performing necessary actions.
				// wDriver.close();

				// Returning to window from which new window were invoked.
				// wDriver.switchTo().window(currentWindow);
			}
		}
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
