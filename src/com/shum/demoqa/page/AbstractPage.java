package com.shum.demoqa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.shum.demoqa.exceptions.ElementNotFoundException;

/**
 * <code>AbstractPage</code> class is a superclass for all objects which
 * describe behavior, elements and actions which could be taken on them.
 * 
 * <p>
 * All methods described here, such as clicking, locating, focusing and getting
 * any info/values are common for each page object and accessible from anywhere.
 * </p>
 * 
 * @author shum
 *
 */
public class AbstractPage {

	protected WebDriver wDriver;

	// TODO: Reimplement in future to make it more stable
	/**
	 * Returns if element appeared within given timeout ignoring
	 * <code>NoSuchElementException</code> exception.
	 * 
	 * If element not visible or not initialized throws
	 * <code>ElementNotFound</code> exception.
	 * 
	 * @param webElement
	 *            to locate.
	 * @param time_out
	 *            given in milliseconds (int).
	 * @return Returns boolean, if the element visible or not
	 */
	public boolean isElementAppeared(WebElement webElement, int time_out) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(wDriver)
					.withMessage("Element " + webElement.toString() + " was not found")
					.withTimeout(time_out, TimeUnit.SECONDS).pollingEvery(200, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Returns current title of page
	 * 
	 * @return <code>Sting</code>
	 */
	public String getPageTitle() {
		return wDriver.getTitle();
	}

	// TODO: Add is element is appeared into this method
	/**
	 * Emulates focus on selected <code>WebElement</code> by mouse. Usually
	 * intended to show tooltip of <code>WebElement</code>.
	 * 
	 * @param webElement
	 */
	public void focusOnElement(WebElement webElement) {
		new Actions(wDriver).moveToElement(webElement).perform();
		
		waitForTime(250);
	}

	/**
	 * Delays execution of test scenario for given time in milliseconds.
	 * 
	 * @param milliseconds
	 */
	public void waitForTime(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Navigates back to previous page.
	 * <p>
	 * Move back a single "item" in the browser's history.
	 * </p>
	 */
	public void navigateBack() {
		wDriver.navigate().back();
	}

	/**
	 * Navigates forward to previous page.
	 * <p>
	 * Move a single "item" forward in the browser's history. Does nothing if we
	 * are on the latest page viewed.
	 * </p>
	 */
	public void navigateForward() {
		wDriver.navigate().forward();
	}
}
