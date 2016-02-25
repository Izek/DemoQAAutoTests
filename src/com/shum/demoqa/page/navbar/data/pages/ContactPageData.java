package com.shum.demoqa.page.navbar.data.pages;

public interface ContactPageData {

	public final static String CONTACT_PAGE_HEADER_XPATH = "/html/body//main/article/header/h1";

	public final static String CONTACT_PAGE_NAME_INPUT_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Your Name (required)\")]/span/input";
	public final static String CONTACT_PAGE_EMAIL_INPUT_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Your Email (required)\")]/span/input";
	public final static String CONTACT_PAGE_SUBJECT_INPUT_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Subject\")]/span/input";
	public final static String CONTACT_PAGE_MESSAGE_TEXTAREA_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Your Message\")]/span/textarea";

	public final static String CONTACT_PAGE_SEND_BUTTON_XPATH = "/html/body//main/article/div/div/form/p/input[@value=\"Send\"]";

	// SENDING Alerts:
	public final static String CONTACT_PAGE_NAME_VALIDATION_ERROR_ALERT_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Your Name (required)\")]/span/span[@role=\"alert\"]";
	public final static String CONTACT_PAGE_EMAIL_VALIDATION_ERROR_ALERT_XPATH = "/html/body//main/article/div/div/form/p[contains(text(), \"Your Email (required)\")]/span/span[@role=\"alert\"]";

	public final static String CONTACT_PAGE_MESSAGE_VALIDATION_ERROR_ALERT_XPATH = "/html/body//main/article/div/div/form/div[@role=\"alert\"]";

}
