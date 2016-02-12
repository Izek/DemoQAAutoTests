package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.ServicesPageData;
import com.shum.demoqa.tests.BaseTest;

public class ServicesPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void getTitleTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openServicesPage();
		
		System.out.println(wPage.getPageTitle());
		
		System.out.println();
		
		WebElement el = wDriver.findElement(By.xpath(ServicesPageData.SERVICES_PAGE_TEXT_XPATH));
		
		System.out.println(el.getText());
		
	
		
		
	}

}
