package com.shum.demoqa.page.content.sidebar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.content.sidebar.data.SideBarData;
import com.shum.demoqa.page.content.sidebar.pageobjects.AccordionPage;
import com.shum.demoqa.page.content.sidebar.pageobjects.AutocompletePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.DraggablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.DroppablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.RegistrationPage;
import com.shum.demoqa.page.content.sidebar.pageobjects.ResizablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.SelectablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.SortablePage;

public class SideBar extends AbstractPage {

	public SideBar(WebDriver wDriver) {
		this.wDriver = wDriver;
	}

	// 'Registration' block elements
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div/h3[text()=\"Registration\"]")
	WebElement registrationSBHeader;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div/div/ul/li/a[text()=\"Registration\"]")
	WebElement registrationSBLink;

	// 'Integration' block elements
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div/h3[text()=\"interaction\"]")
	WebElement interactionHeader;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Draggable\"]")
	WebElement draggableLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Droppable\"]")
	WebElement droppableLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Resizable\"]")
	WebElement resizableLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Selectable\"]")
	WebElement selectableLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Sortable\"]")
	WebElement sortableLink;

	// 'Widget' block elements
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div/h3[text()=\"Widget\"]")
	WebElement widgetHeader;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Accordion\"]")
	WebElement accordionLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Autocomplete\"]")
	WebElement autocompleteLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Datepicker\"]")
	WebElement datepickerLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Menu\"]")
	WebElement menuLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Slider\"]")
	WebElement sliderLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Tabs\"]")
	WebElement tabsLink;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Tooltip\"]")
	WebElement tooltipLink;

	// 'Frames and Windows' block elements
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div/h3[text()=\"Frames and Windows\"]")
	WebElement framesAndWindowsHeader;
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/div[@id=\"secondary\"]/aside/div//ul/li/a[text()=\"Frames and windows\"]")
	WebElement framesAndWindowsLink;

	public boolean isSideBarPresentOnPage() {
		return isElementAppeared(registrationSBHeader, 5);
	}

	// Methods to open page directly by opening exact link
	public RegistrationPage openRegistrationPage() {
		wDriver.get(SideBarData.REGISTRATION_PAGE_ADDRESS);
		return new RegistrationPage(wDriver);
	}

	public DraggablePage openDraggablePage() {
		wDriver.get(SideBarData.DRAGGABLE_PAGE_ADDRESS);
		return new DraggablePage(wDriver);
	}

	public DroppablePage openDroppablePage() {
		wDriver.get(SideBarData.DROPABLE_PAGE_ADDRESS);
		return new DroppablePage(wDriver);
	}

	public ResizablePage openResizablePage() {
		wDriver.get(SideBarData.RESIZABLE_PAGE_ADDRESS);
		return new ResizablePage(wDriver);
	}

	public SelectablePage openSelectablePage() {
		wDriver.get(SideBarData.SELECTABLE_PAGE_ADDRESS);
		return new SelectablePage(wDriver);
	}

	public AccordionPage openAccordionPage() {
		wDriver.get(SideBarData.ACCORDION_PAGE_ADDRESS);
		return new AccordionPage(wDriver);
	}

	public SortablePage openSortablePage() {
		wDriver.get(SideBarData.SORTABLE_PAGE_ADDRESS);
		return new SortablePage(wDriver);
	}

	public AutocompletePage openAutocompletePage() {
		wDriver.get(SideBarData.AUTOCOMPLETE_PAGE_ADDRESS);
		return new AutocompletePage(wDriver);
	}

	// Methods to navigate to page by clicking on appropriate link
	public RegistrationPage navigateToRegistrationPage() {
		registrationSBLink.click();
		return new RegistrationPage(wDriver);
	}

	public DraggablePage navigateToDraggablePage() {
		draggableLink.click();
		return new DraggablePage(wDriver);
	}

	public DroppablePage navigateToDroppablePage() {
		droppableLink.click();
		return new DroppablePage(wDriver);
	}

	public ResizablePage navigateToResizablePage() {
		resizableLink.click();
		return new ResizablePage(wDriver);
	}

	public SelectablePage navigateToSelectablePage() {
		selectableLink.click();
		return new SelectablePage(wDriver);
	}

	public SortablePage navigateToSortablePage() {
		sortableLink.click();
		return new SortablePage(wDriver);
	}

	public AccordionPage navigateToAccordionPage() {
		accordionLink.click();
		return new AccordionPage(wDriver);
	}

	public AutocompletePage navigateToAutocompletePage() {
		autocompleteLink.click();
		return new AutocompletePage(wDriver);
	}

}
