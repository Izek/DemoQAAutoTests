package com.shum.demoqa.page.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.page.navbar.pageobjects.NavigationTabBarPage;
import com.shum.demoqa.utils.TDSideBar;

public class SideBarPage extends NavigationTabBarPage {

	
	// TODO: Refactor constructor to work without PageFactory
	public SideBarPage(WebDriver wDriver) {
		super(wDriver);

		PageFactory.initElements(wDriver, this);
	}

	@FindBy(xpath = "/html/body/div/div/div[@id=\"secondary\"]/aside[@id=\"nav_menu-6\"]/div/h3[text()=\"Registration\"]")
	WebElement registrationSBHeader;
	@FindBy(xpath = "/html/body/div/div/div[@id=\"secondary\"]/aside[@id=\"nav_menu-6\"]/div/div/ul/li/a[text()=\"Registration\"]")
	WebElement registrationSBLink;

	public boolean isSideBarPresentOnPage() {
		return isElementAppeared(registrationSBHeader, 5);
	}

	public RegistrationPage openRegistrationPage() {
		wDriver.get(TDSideBar.REGISTRATION_PAGE);
		return new RegistrationPage(wDriver);
	}

	public RegistrationPage navigateToRegistrationPage() {
		registrationSBLink.click();
		return new RegistrationPage(wDriver);
	}
}
