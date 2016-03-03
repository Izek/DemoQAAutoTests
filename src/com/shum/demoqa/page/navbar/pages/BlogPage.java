package com.shum.demoqa.page.navbar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.data.pages.BlogPageData;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostOnePage;
import com.shum.demoqa.page.navbar.pages.blog.SamplePostTwoPage;

public class BlogPage extends WebPage {

	public BlogPage(WebDriver wDriver) {
		super(wDriver);

		if (!isBlogPageOpened()) {
			throw new PageNotFoundException("'Blog' page was not opened!");
		}
	}

	// TODO:this code is proper. Bug: Web page has no header
	// @FindBy(xpath =
	// "/html/body//main/article/header/h1[@class=\"entry-title\"][text()=\"Blog\"]")
	// WebElement blogHeader;

	// TODO: Change on different assertion
	@FindBy(xpath = "/html/body/div[@id=\"page\"]/div[@id=\"content\"]/ol/li/span[text()=\"Blog\"]")
	@CacheLookup
	WebElement blogHeader;

	// Simple Post One
	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_ONE_HEADER_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOneLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_ONE_POSTED_ON_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOnePostedOnLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_ONE_IMAGE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOnePreviewImageLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_ONE_DESCR_XPATH)
	@CacheLookup
	WebElement samplePostOneDescriptionText;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_ONE_READ_MORE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOneReadMoreButton;

	// Simple Post Two
	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_TWO_HEADER_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_TWO_POSTED_ON_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoPostedOnLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_TWO_IMAGE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoPreviewImageLink;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_TWO_DESCR_XPATH)
	@CacheLookup
	WebElement samplePostTwoDescriptionText;

	@FindBy(xpath = BlogPageData.BLOG_PAGE_SAMPLE_POST_TWO_READ_MORE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoReadMoreButton;

	private boolean isBlogPageOpened() {
		if (this.breadCrumbs.getBreadCrumbsTitle().equals("Blog"))
			return true;
		else
			return false;
	}

	// SamplePostOne methods
	public SamplePostOnePage clickOnSamplePostOne() {
		focusOnElement(samplePostOneLink);
		samplePostOneLink.click();
		return new SamplePostOnePage(wDriver);
	}

	public String getSamplePostOneLinkText() {
		return samplePostOneLink.getText();
	}

	public SamplePostOnePage clickOnSampleOnePostedLink() {
		focusOnElement(samplePostOnePostedOnLink);
		samplePostOnePostedOnLink.click();
		return new SamplePostOnePage(wDriver);
	}

	public SamplePostOnePage clickOnSamplePostOneImagePreview() {
		focusOnElement(samplePostOnePreviewImageLink);
		samplePostOnePreviewImageLink.click();
		return new SamplePostOnePage(wDriver);
	}

	public String getSamplePostOneDescription() {
		return samplePostOneDescriptionText.getText();
	}

	public SamplePostOnePage clickOnSamplePostOneReadMoreButton() {
		focusOnElement(samplePostOneReadMoreButton);
		samplePostOneReadMoreButton.click();
		return new SamplePostOnePage(wDriver);
	}

	// SamplePostOne methods
	public SamplePostTwoPage clickOnSamplePostTwo() {
		focusOnElement(samplePostTwoLink);
		samplePostTwoLink.click();
		return new SamplePostTwoPage(wDriver);
	}

	public String getSamplePostTwoLinkText() {
		return samplePostTwoLink.getText();
	}

	public SamplePostTwoPage clickOnSampleTwoPostedLink() {
		focusOnElement(samplePostTwoPostedOnLink);
		samplePostTwoPostedOnLink.click();
		return new SamplePostTwoPage(wDriver);
	}

	public SamplePostTwoPage clickOnSamplePostTwoImagePreview() {
		focusOnElement(samplePostTwoPreviewImageLink);
		samplePostTwoPreviewImageLink.click();
		return new SamplePostTwoPage(wDriver);
	}

	public String getSamplePostTwoDescription() {
		return samplePostTwoDescriptionText.getText();
	}

	public SamplePostTwoPage clickOnSamplePostTwoReadMoreButton() {
		focusOnElement(samplePostOneReadMoreButton);
		samplePostOneReadMoreButton.click();
		return new SamplePostTwoPage(wDriver);
	}
}