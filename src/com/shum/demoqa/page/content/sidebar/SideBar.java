package com.shum.demoqa.page.content.sidebar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.content.sidebar.data.SideBarData;
import com.shum.demoqa.page.content.sidebar.pageobjects.DraggablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.DroppablePage;
import com.shum.demoqa.page.content.sidebar.pageobjects.RegistrationPage;

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
		wDriver.get(SideBarData.REGISTRATION_PAGE);
		return new RegistrationPage(wDriver);
	}

	public DraggablePage openDraggablePage() {
		wDriver.get("http://demoqa.com/draggable/");
		return new DraggablePage(wDriver);
	}

	public DroppablePage openDroppablePage() {
		wDriver.get("http://demoqa.com/droppable/");
		return new DroppablePage(wDriver);
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
}
