package com.shum.demoqa.page.content.sidebar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.page.content.sidebar.data.SideBarData;
import com.shum.demoqa.page.content.sidebar.pages.AccordionPage;
import com.shum.demoqa.page.content.sidebar.pages.AutocompletePage;
import com.shum.demoqa.page.content.sidebar.pages.DatepickerPage;
import com.shum.demoqa.page.content.sidebar.pages.DraggablePage;
import com.shum.demoqa.page.content.sidebar.pages.DroppablePage;
import com.shum.demoqa.page.content.sidebar.pages.FramesAndWindowsPage;
import com.shum.demoqa.page.content.sidebar.pages.MenuPage;
import com.shum.demoqa.page.content.sidebar.pages.RegistrationPage;
import com.shum.demoqa.page.content.sidebar.pages.ResizablePage;
import com.shum.demoqa.page.content.sidebar.pages.SelectablePage;
import com.shum.demoqa.page.content.sidebar.pages.SliderPage;
import com.shum.demoqa.page.content.sidebar.pages.SortablePage;
import com.shum.demoqa.page.content.sidebar.pages.TabsPage;
import com.shum.demoqa.page.content.sidebar.pages.TooltipPage;

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

	public DatepickerPage openDatepickerPage() {
		wDriver.get(SideBarData.DATEPICKER_PAGE_ADDRESS);
		return new DatepickerPage(wDriver);
	}

	public MenuPage openMenuPage() {
		wDriver.get(SideBarData.MENU_PAGE_ADDRESS);
		return new MenuPage(wDriver);
	}

	public SliderPage openSliderPage() {
		wDriver.get(SideBarData.SLIDER_PAGE_ADDRESS);
		return new SliderPage(wDriver);
	}

	public TabsPage openTabsPage() {
		wDriver.get(SideBarData.TABS_PAGE_ADDRESS);
		return new TabsPage(wDriver);
	}

	public TooltipPage openTooltipPage() {
		wDriver.get(SideBarData.TOOLTIP_PAGE_ADDRESS);
		return new TooltipPage(wDriver);
	}

	public FramesAndWindowsPage openFramesAndWindowsPage() {
		wDriver.get(SideBarData.FRAMES_AND_WINDOWS_PAGE_ADDRESS);
		return new FramesAndWindowsPage(wDriver);
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

	public DatepickerPage navigateToDatepickerPage() {
		datepickerLink.click();
		return new DatepickerPage(wDriver);
	}

	public MenuPage navigateToMenuPage() {
		menuLink.click();
		return new MenuPage(wDriver);
	}

	public SliderPage navigateToSliderPage() {
		sliderLink.click();
		return new SliderPage(wDriver);
	}

	public TabsPage navigateToTabsPage() {
		tabsLink.click();
		return new TabsPage(wDriver);
	}

	public TooltipPage navigateToTooltipPage() {
		tooltipLink.click();
		return new TooltipPage(wDriver);
	}

	public FramesAndWindowsPage navigateToFramesAndWindowsPage() {
		framesAndWindowsLink.click();
		return new FramesAndWindowsPage(wDriver);
	}
}
