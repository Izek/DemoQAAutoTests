package com.shum.demoqa.test.navbar.pages;

import org.junit.Assert;
import org.junit.Test;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.AboutUsPage;
import com.shum.demoqa.test.navbar.data.pages.AboutUsDataTest;
import com.shum.demoqa.tests.BaseTest;

public class AboutUsPageTests extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void aboutUsTitleTest() {
		WebPage wPage = new WebPage(wDriver);
		wPage.navBar.openAboutUsPage();

		Assert.assertEquals("Fail!. Title does not match to expected...", AboutUsDataTest.ABOUT_US_PAGE_TITLE,
				wPage.getPageTitle());
	}

	@Test
	public void aboutUsHeaderTest() {
		WebPage wPage = new WebPage(wDriver);
		AboutUsPage aboutUsPage = wPage.navBar.openAboutUsPage();

		Assert.assertEquals("Fail!. Header does not match to expected...", AboutUsDataTest.ABOUT_US_PAGE_HEADER,
				aboutUsPage.getAUHeader());
	}

	@Test
	public void aboutUsTextTest() {
		WebPage wPage = new WebPage(wDriver);
		AboutUsPage aboutUsPage = wPage.navBar.openAboutUsPage();

		Assert.assertEquals("Fail!. Text does not match to expected...", AboutUsDataTest.ABOUT_US_PAGE_TEXT,
				aboutUsPage.getAUText());
	}

	@Test
	public void aboutUsBreadCrumbsTest() {
		WebPage wPage = new WebPage(wDriver);
		AboutUsPage aboutUsPage = wPage.navBar.openAboutUsPage();

		Assert.assertEquals("Fail!. Text does not match to expected...", aboutUsPage.breadCrumbs.getBreadCrumbsTitle(),
				AboutUsDataTest.ABOUT_US_PAGE_HEADER);
	}

	@Test
	public void aboutUsBreadCrumbsReturnHomeTest() {
		WebPage wPage = new WebPage(wDriver);
		AboutUsPage aboutUsPage = wPage.navBar.openAboutUsPage();

		aboutUsPage.breadCrumbs.returnToHomePage();
	}
}
