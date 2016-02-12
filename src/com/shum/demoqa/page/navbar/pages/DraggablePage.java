package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.DraggablePageData;

public class DraggablePage extends WebPage {

	public DraggablePage(WebDriver wDriver) {
		super(wDriver);

		if (!isDraggablePageOpened()) {
			throw new PageNotFoundException("'Draggable' page was not opened!");
		}
	}

	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_HEADER_XPATH)
	private WebElement draggableHeader;

	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_DESCRIPTION_XPATH)
	private WebElement draggableDescription;

	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_TAB_DEF_FUNCTIONALITY_XPATH)
	private WebElement tabDefaultFunctionality;
	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_TAB_CONSTRAIN_MOVEMENT_XPATH)
	private WebElement tabConstrainMovement;
	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_TAB_CURSOR_STYLE_XPATH)
	private WebElement tabCursorStyle;
	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_TAB_EVENTS_XPATH)
	private WebElement tabEvents;
	@FindBy(xpath = DraggablePageData.DRAGGABLE_PAGE_TAB_DRAGGABLE_SORTABLE_XPATH)
	private WebElement tabDraggableSortable;

	private boolean isDraggablePageOpened() {
		return isElementAppeared(draggableHeader, 5);
	}

	public DraggablePage clickOnDefFuncTab() {
		focusOnElement(tabDefaultFunctionality);
		tabDefaultFunctionality.click();
		return this;
	}

	public DraggablePage clickOnConstraintMovementTab() {
		focusOnElement(tabConstrainMovement);
		tabConstrainMovement.click();
		return this;
	}

	public DraggablePage clickOnCursorStyleTab() {
		focusOnElement(tabCursorStyle);
		tabCursorStyle.click();
		return this;
	}

	public DraggablePage clickOnEventsTab() {
		focusOnElement(tabEvents);
		tabEvents.click();
		return this;
	}

	public DraggablePage clickOnDraggableSortableTab() {
		focusOnElement(tabDraggableSortable);
		tabDraggableSortable.click();
		return this;
	}
}
