package com.shum.demoqa.test.navbar.pages.blog;




import org.junit.Test;
import org.testng.Assert;

import com.shum.demoqa.page.navbar.pages.blog.UncategorizedBlogPage;
import com.shum.demoqa.test.navbar.data.pages.blog.UncategorizedBlogPageTestData;
import com.shum.demoqa.tests.BaseTest;

public class UncategorizedBlogPageTest extends BaseTest {

	@Override
	public void setUp() {
		super.setUp();
	}

	@Override
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void openUncategorizedBlogPageTest() {
		UncategorizedBlogPage uncategorizedBlogPage = new UncategorizedBlogPage(wDriver);
		uncategorizedBlogPage.maximizeWindow();
		waitForTime(500);

		Assert.assertTrue(uncategorizedBlogPage.getPageTitle()
				.equals(UncategorizedBlogPageTestData.UNCATEGORIZED_PAGE_TITLE_TEXT), "Fail!. Title of 'Uncategorized' page does not match!");

		Assert.assertTrue(
				(uncategorizedBlogPage).getPageHeader()
						.equals(UncategorizedBlogPageTestData.UNCATEGORIZED_PAGE_HEADER_TEXT), "Fail!. Header of 'Uncategorized' page does not match!");

	}

}
