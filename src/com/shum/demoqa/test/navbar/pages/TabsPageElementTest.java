package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.TabsPage;
import com.shum.demoqa.test.navbar.data.pages.TabsPageDataTest;
import com.shum.demoqa.tests.BaseTest;

public class TabsPageElementTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void tabsPageTitleTest() {
		WebPage wPage = new WebPage(wDriver);

		TabsPage tPage = wPage.navBar.openTabsPage();

		Assert.assertEquals(tPage.getPageTitle(), TabsPageDataTest.TABS_PAGE_TITLE, "Fail!. Title does not match.");
	}

	@Test
	public void tabsInitTest() {

		WebPage wPage = new WebPage(wDriver);

		TabsPage tPage = wPage.navBar.openTabsPage();

		tPage.clickOnTabOne();
		tPage.clickOnTabThree().clickOnTabTwo();

		Assert.assertEquals(tPage.getTabsPageHeader().getText(), TabsPageDataTest.TABS_PAGE_HEADER,
				"Fail!. Header does not match.");

	}

	@Test
	public void tabsContentTest() {

		WebPage wPage = new WebPage(wDriver);

		TabsPage tPage = wPage.navBar.openTabsPage();

		tPage.clickOnTabOne();
		Assert.assertEquals(tPage.getTabOneContent().getText(), TabsPageDataTest.TABS_PAGE_TAB_ONE_CONTENT,
				"Fail!. Tab 1 content does not match.");

		tPage.clickOnTabTwo();
		Assert.assertEquals(tPage.getTabTwoContent().getText(), TabsPageDataTest.TABS_PAGE_TAB_TWO_CONTENT,
				"Fail!. Tab 2 content does not match.");

		tPage.clickOnTabThree();
		Assert.assertEquals(tPage.getTabThreeContent().getText(), TabsPageDataTest.TABS_PAGE_TAB_THREE_CONTENT,
				"Fail!. Tab 3 content does not match.");
	}

}
