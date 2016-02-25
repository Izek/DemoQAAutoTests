package com.shum.demoqa.test.navbar.pages;

import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.BlogPage;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostOnePage;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostTwoPage;
import com.shum.demoqa.page.navbar.pages.blog.UncategorizedBlogPage;
import com.shum.demoqa.test.navbar.data.pages.BlogPageDataTest;
import com.shum.demoqa.tests.BaseTest;

public class BlogPageElementsTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void blogPageTitleTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		System.out.println(blogPage.getPageTitle());
	}

	@Test
	public void blogPostHeadersTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		blogPage.maximizeWindow();

		Assert.assertTrue(blogPage.getSamplePostOneLinkText().equals(BlogPageDataTest.BLOG_PAGE_POST_ONE_HEADER_TEXT),
				"Fail!. Name of 'Sample Post One' post does not match!.");

		Assert.assertTrue(blogPage.getSamplePostTwoLinkText().equals(BlogPageDataTest.BLOG_PAGE_POST_TWO_HEADER_TEXT),
				"Fail!. Name of 'Sample Post Two' post does not match!.");
	}

	@Test
	public void blogPostDescriptionTextTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		Assert.assertTrue(
				blogPage.getSamplePostOneDescription().equals(BlogPageDataTest.BLOG_PAGE_POST_ONE_DESCRIPTION),
				"Fail!. Description of 'Sample Post One' post does not match!.");

		Assert.assertTrue(
				blogPage.getSamplePostTwoDescription().equals(BlogPageDataTest.BLOG_PAGE_POST_TWO_DESCRIPTION),
				"Fail!. Description of 'Sample Post Two' post does not match!.");
	}

	@Test
	public void blogPostOneLinksTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		blogPage.maximizeWindow();

		SamplePostOnePage samplePostOnePage;

		samplePostOnePage = blogPage.clickOnSamplePostOne();
		samplePostOnePage.navigateBack();

		samplePostOnePage = blogPage.clickOnSamplePostOneImagePreview();
		samplePostOnePage.navigateBack();

		samplePostOnePage = blogPage.clickOnSamplePostOneReadMoreButton();
		samplePostOnePage.navigateBack();
	}

	@Test
	public void blogPostTwoLinksTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		blogPage.maximizeWindow();

		SamplePostTwoPage samplePostTwoPage;

		samplePostTwoPage = blogPage.clickOnSamplePostTwo();
		samplePostTwoPage.navigateBack();

		samplePostTwoPage = blogPage.clickOnSamplePostTwoImagePreview();
		samplePostTwoPage.navigateBack();

		samplePostTwoPage = blogPage.clickOnSamplePostTwoReadMoreButton();
		samplePostTwoPage.navigateBack();
	}
	
	@Test
	public void blogPostedOnLinkTest() {
		WebPage wPage = new WebPage(wDriver);
		BlogPage blogPage = wPage.navBar.openBlogPage();

		blogPage.maximizeWindow();

		UncategorizedBlogPage uncategorizedBlogPage;
		
		uncategorizedBlogPage = blogPage.clickOnSampleOnePostedLink();
		uncategorizedBlogPage.navigateBack();
		
		uncategorizedBlogPage = blogPage.clickOnSampleTwoPostedLink();
		uncategorizedBlogPage.navigateBack();
	}
}
