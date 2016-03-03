package com.shum.demoqa.page.navbar.pages.blog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.shum.demoqa.exceptions.PageNotFoundException;
import com.shum.demoqa.page.WebPage;
import com.shum.demoqa.page.navbar.pages.blog.data.AdminPageData;

public class AdminPage extends WebPage {

	public AdminPage(WebDriver wDriver) throws PageNotFoundException {
		super(wDriver);

		// TODO: Refactor later
		wDriver.get("http://demoqa.com/author/admin/");

		if (!isAdminPageOpened()) {
			throw new PageNotFoundException("'Admin' Page was not opened!");
		}
	}

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_HEADER_NAME_XPATH)
	@CacheLookup
	WebElement adminPageHeader;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_ARTICLE_COUNT_LINK_XPATH)
	@CacheLookup
	WebElement adminPageArticlesCounterLink;

	public boolean isAdminPageOpened() {
		return isElementAppeared(adminPageHeader, 5);
	}

	// Simple Post One
	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_ONE_HEADER_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOneLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_ONE_POSTED_ON_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOnePostedOnLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_ONE_IMAGE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOnePreviewImageLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_ONE_DESCR_XPATH)
	@CacheLookup
	WebElement samplePostOneDescriptionText;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_ONE_READ_MORE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostOneReadMoreButton;

	// Simple Post Two
	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_TWO_HEADER_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_TWO_POSTED_ON_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoPostedOnLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_TWO_IMAGE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoPreviewImageLink;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_TWO_DESCR_XPATH)
	@CacheLookup
	WebElement samplePostTwoDescriptionText;

	@FindBy(xpath = AdminPageData.ADMIN_PAGE_SAMPLE_POST_TWO_READ_MORE_LINK_XPATH)
	@CacheLookup
	WebElement samplePostTwoReadMoreButton;

	public String getAdminPageHeader() {
		return adminPageHeader.getText();
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

	public AdminPage clickOnAdminArticlesCountersLink() {
		focusOnElement(adminPageArticlesCounterLink);
		adminPageArticlesCounterLink.click();
		return new AdminPage(wDriver);

	}
}
