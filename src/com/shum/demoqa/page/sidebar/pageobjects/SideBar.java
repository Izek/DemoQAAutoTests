package com.shum.demoqa.page.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.page.AbstractPage;
import com.shum.demoqa.utils.TDSideBar;

public class SideBar extends AbstractPage {

	public SideBar(WebDriver wDriver) {
		this.wDriver = wDriver;
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
