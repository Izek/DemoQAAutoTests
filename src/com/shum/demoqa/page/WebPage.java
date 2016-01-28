package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.shum.demoqa.page.content.breadcrumbs.BreadCrumbs;
import com.shum.demoqa.page.content.sidebar.SideBar;
import com.shum.demoqa.page.footer.Footer;
import com.shum.demoqa.page.navbar.NavigationTabBar;

public class WebPage extends AbstractPage {

	// TODO: Refactor PageContent object, so SideBar should appear there

	// TODO: Change the constructor, so WebElements will be initialized in
	// WebPaje object, and each Page object should inherit this initialization

	// Components of the Page: NavigationBar, SideBar, Footer, BreadCrumbs
	public NavigationTabBar navBar;

	public SideBar sideBar;

	public Footer pageFooter;

	public BreadCrumbs breadCrumbs;

	// TODO: Add protected Content Area to PageObject

	public WebPage(WebDriver wDriver) {
		this.wDriver = wDriver;

		// Objects of WebPage components are initialized when Page is created
		navBar = PageFactory.initElements(wDriver, NavigationTabBar.class);
		sideBar = PageFactory.initElements(wDriver, SideBar.class);
		breadCrumbs = PageFactory.initElements(wDriver, BreadCrumbs.class);
		pageFooter = PageFactory.initElements(wDriver, Footer.class);

		PageFactory.initElements(wDriver, this);
	}

	public NavigationTabBar getNBar() {
		return navBar;
	}

	protected void setNavBar(NavigationTabBar nBar) {
		this.navBar = nBar;
	}

	public SideBar getSBar() {
		return sideBar;
	}

	protected void setSideBar(SideBar sBar) {
		this.sideBar = sBar;
	}

	public Footer getFooter() {
		return pageFooter;
	}

	protected void setFooter(Footer pFooter) {
		this.pageFooter = pFooter;
	}

	public BreadCrumbs getBreadCrumbs() {
		return breadCrumbs;
	}

	protected void setBreadCrumbs(BreadCrumbs breadCrumbs) {
		this.breadCrumbs = breadCrumbs;
	}

}
