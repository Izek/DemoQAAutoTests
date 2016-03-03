package com.shum.demoqa.test.navbar.pages.blog;

import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.navbar.pages.blog.AdminPage;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostOnePage;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostTwoPage;
import com.shum.demoqa.test.navbar.data.pages.blog.AdminPageDataTest;
import com.shum.demoqa.tests.BaseTest;

public class AdminPageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openAdminPageTest() {

		AdminPage adminPage = new AdminPage(wDriver);

		Assert.assertTrue(adminPage.getPageTitle().equals(AdminPageDataTest.ADMIN_PAGE_TITLE_TEXT),
				"Fail!. Name of 'Sample Post One' post does not match!.");

		Assert.assertTrue(adminPage.getAdminPageHeader().equals(AdminPageDataTest.ADMIN_PAGE_HEADER_TEXT),
				"Fail!. Name of 'Sample Post Two' post does not match!.");

	}

	@Test
	public void blogPostHeadersTest() {
		// WebPage wPage = new WebPage(wDriver);
		AdminPage adminPage = new AdminPage(wDriver);

		adminPage.maximizeWindow();

		Assert.assertTrue(
				adminPage.getSamplePostOneLinkText().equals(AdminPageDataTest.ADMIN_PAGE_POST_ONE_HEADER_TEXT),
				"Fail!. Name of 'Sample Post One' post does not match!.");

		Assert.assertTrue(
				adminPage.getSamplePostTwoLinkText().equals(AdminPageDataTest.ADMIN_PAGE_POST_TWO_HEADER_TEXT),
				"Fail!. Name of 'Sample Post Two' post does not match!.");
	}

	@Test
	public void blogPostDescriptionTextTest() {
		// WebPage wPage = new WebPage(wDriver);
		AdminPage adminPage = new AdminPage(wDriver);

		Assert.assertTrue(
				adminPage.getSamplePostOneDescription().equals(AdminPageDataTest.ADMIN_PAGE_POST_ONE_DESCRIPTION),
				"Fail!. Description of 'Sample Post One' post does not match!.");

		Assert.assertTrue(
				adminPage.getSamplePostTwoDescription().equals(AdminPageDataTest.ADMIN_PAGE_POST_TWO_DESCRIPTION),
				"Fail!. Description of 'Sample Post Two' post does not match!.");
	}

	@Test
	public void blogPostOneLinksTest() {
		// WebPage wPage = new WebPage(wDriver);
		AdminPage adminPage = new AdminPage(wDriver);

		adminPage.maximizeWindow();

		SamplePostOnePage samplePostOnePage;

		samplePostOnePage = adminPage.clickOnSamplePostOne();
		samplePostOnePage.navigateBack();

		samplePostOnePage = adminPage.clickOnSamplePostOneImagePreview();
		samplePostOnePage.navigateBack();

		samplePostOnePage = adminPage.clickOnSamplePostOneReadMoreButton();
		samplePostOnePage.navigateBack();
	}

	@Test
	public void blogPostTwoLinksTest() {
		// WebPage wPage = new WebPage(wDriver);
		AdminPage adminPage = new AdminPage(wDriver);

		adminPage.maximizeWindow();

		SamplePostTwoPage samplePostTwoPage;

		samplePostTwoPage = adminPage.clickOnSamplePostTwo();
		samplePostTwoPage.navigateBack();

		samplePostTwoPage = adminPage.clickOnSamplePostTwoImagePreview();
		samplePostTwoPage.navigateBack();

		samplePostTwoPage = adminPage.clickOnSamplePostTwoReadMoreButton();
		samplePostTwoPage.navigateBack();
	}

	@Test
	public void blogPostedOnLinkTest() {
		// WebPage wPage = new WebPage(wDriver);
		AdminPage adminPage = new AdminPage(wDriver);
		adminPage.maximizeWindow();
		
		SamplePostOnePage samplePostOnePage;
		samplePostOnePage = adminPage.clickOnSampleOnePostedLink();
		samplePostOnePage.navigateBack();

		SamplePostTwoPage samplePostTwoPage;
		samplePostTwoPage = adminPage.clickOnSampleTwoPostedLink();
		samplePostTwoPage.navigateBack();
	}
}
