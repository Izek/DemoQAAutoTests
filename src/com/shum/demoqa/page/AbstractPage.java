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

public class AbstractPage {

	// TODO: Create Project's documentation

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
	 * @param time_out
	 * @return boolean
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
}
