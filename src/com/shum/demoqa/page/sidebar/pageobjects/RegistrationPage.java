package com.shum.demoqa.page.sidebar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.footer.PageFooter;
import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.page.sidebar.SideBar;


public class RegistrationPage extends WebPage {

	public RegistrationPage(WebDriver wDriver) {
		super(wDriver);

		// Page components are initialized at moment of page creation
		setSideBar(PageFactory.initElements(wDriver, SideBar.class));
		setNavBar(PageFactory.initElements(wDriver, NavigationTabBar.class));

		setPFooter(PageFactory.initElements(wDriver, PageFooter.class)); 
		PageFactory.initElements(wDriver, this);

		if (!isRegistrationPageOpened()) {
			throw new PageNotFoundException("'Registration' page was not opened!");
		}
	}

	@FindBy(xpath = "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Registration\"]")
	WebElement registrationHeader;

	public boolean isRegistrationPageOpened() {
		return isElementAppeared(registrationHeader, 5);
	}
}
