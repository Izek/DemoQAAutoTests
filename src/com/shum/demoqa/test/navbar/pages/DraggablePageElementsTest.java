package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	public void openDraggablePageTest() {
		WebPage webPage = new WebPage(wDriver);
		DraggablePage dPage = webPage.navBar.openDraggablePage();
		
		dPage.clickOnConstraintMovementTab();
		dPage.clickOnCursorStyleTab();
		dPage.clickOnDefFuncTab();
		dPage.clickOnEventsTab();
		dPage.clickOnDraggableSortableTab();
		
		
		dPage.clickOnDefFuncTab();
		
		String position = "/html/body//div[@id=\"primary\"]/main/article/div[@class=\"entry-content\"]//div[@id=\"tabs-1\"]/div[@class=\"inside_contain\"]/div[@id=\"draggable\"][@style=\"position: relative; left: 283px; top: 93px;\"]";
		//WebElement wEl = wDriver.findElement(By.xpath(position));
		
		
		Actions builder = new Actions(wDriver);
		
		//builder.clickAndHold(dPage.getDraggableObject()).moveToElement(wEl).release().build();
		
	//	builder.clickAndHold(dPage.getDraggableObject()).moveByOffset(283, 93).release().build();
		
		builder.clickAndHold(dPage.getDraggableObject()).moveByOffset(500, 300).release().build();
		
		builder.perform();
		
		waitForTime(10000);
	}

	
}
