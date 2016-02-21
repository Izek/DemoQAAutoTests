package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.DraggablePage;
import com.shum.demoqa.tests.BaseTest;

public class DraggablePageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void tabsSelectionTest() {
		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();

		dPage.clickOnConstraintMovementTab();
		dPage.clickOnCursorStyleTab();
		dPage.clickOnDefFuncTab();
		dPage.clickOnEventsTab();
		dPage.clickOnDraggableSortableTab();

		dPage.clickOnDefFuncTab();
	}

	@Test
	public void dragAndDropSimpleVisibilityTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);

		builder.dragAndDropBy(dPage.getDraggableObject(), 300, 200).build().perform();

		waitForTime(500);

		Assert.assertTrue(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is invisible...");
	}

	@Test
	public void dragAndDropSimpleInvisibilityTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);

		builder.dragAndDropBy(dPage.getDraggableObject(), -300, -250).build().perform();

		Assert.assertFalse(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is still visible...");

		waitForTime(500);
	}

	@Test
	public void dragAndDropOppositeEdgeTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);

		builder.dragAndDropBy(dPage.getDraggableObject(), 414, 214).build().perform();

		Assert.assertTrue(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is invisible...");

		waitForTime(500);
	}

	@Test
	public void dragAndDropBordersTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);

		builder.dragAndDropBy(dPage.getDraggableObject(), 414, 0).build().perform();
		waitForTime(500);
		builder.dragAndDropBy(dPage.getDraggableObject(), 0, 214).build().perform();
		waitForTime(500);
		builder.dragAndDropBy(dPage.getDraggableObject(), -414, 0).build().perform();
		waitForTime(500);
		builder.dragAndDropBy(dPage.getDraggableObject(), 0, -214).build().perform();
		waitForTime(500);

		Assert.assertTrue(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is invisible...");

		waitForTime(500);
	}

	@Test
	public void dragAndDropCenterBordersTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);
		WebElement draggableObject;

		draggableObject = wDriver.findElement(By.xpath("//div[@id=\"draggable\"][@style=\"position: relative;\"]"));
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative;"),
				"Draggable object is not at initial position");

		builder.dragAndDropBy(dPage.getDraggableObject(), 207, 107).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 207px; top: 107px;"),
				"Draggable object is not at center");

		builder.dragAndDropBy(dPage.getDraggableObject(), 207, -107).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 414px; top: 0px;"),
				"Draggable object is not at top right corner");

		builder.dragAndDropBy(dPage.getDraggableObject(), 0, 214).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 414px; top: 214px;"),
				"Draggable object is not at top bottom corner");

		builder.dragAndDropBy(dPage.getDraggableObject(), -207, -107).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 207px; top: 107px;"),
				"Draggable object is not at center");

		builder.dragAndDropBy(dPage.getDraggableObject(), -207, 107).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 0px; top: 214px;"),
				"Draggable object is not at bottom left corner");

		builder.dragAndDropBy(dPage.getDraggableObject(), 0, -214).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 0px; top: 0px;"),
				"Draggable object is not at initial position");

		builder.dragAndDropBy(dPage.getDraggableObject(), 207, 107).build().perform();
		waitForTime(500);
		Assert.assertTrue(draggableObject.getAttribute("style").equals("position: relative; left: 207px; top: 107px;"),
				"Draggable object is not at center");

		Assert.assertTrue(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is invisible...");

		waitForTime(500);
	}

	@Test
	public void clickAndMoveByOffsetTest() {

		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		dPage.clickOnDefFuncTab();

		wDriver.manage().window().maximize();

		Actions builder = new Actions(wDriver);
		builder.clickAndHold(dPage.getDraggableObject()).build().perform();

		builder.moveByOffset(414, 0).build().perform();
		waitForTime(500);
		builder.moveByOffset(-414, 214).build().perform();
		waitForTime(500);
		builder.moveByOffset(-414, -214).build().perform();
		waitForTime(500);
		builder.moveByOffset(414, -214).build().perform();
		waitForTime(500);

		Assert.assertTrue(dPage.getDraggableObject().isDisplayed(), "Fail!. Draggable object is invisible...");

		builder.release().build().perform();

		waitForTime(1900);
	}
}
