package com.shum.demoqa.page;

import org.openqa.selenium.WebDriver;

import com.shum.demoqa.page.content.PageContent;
import com.shum.demoqa.page.footer.PageFooter;
import com.shum.demoqa.page.navbar.NavigationTabBar;
import com.shum.demoqa.page.sidebar.SideBar;

public class WebPage extends AbstractPage {

	// TODO: Refactor PageContent object, so SideBar should appear there

	// TODO: Change the constructor, so WebElements will be initialized in
	// WebPaje object, and each Page object should inherit this initialization

	// Components of the Page: NavigationBar, SideBar, PageFooter
	private NavigationTabBar NavBar;

	private PageContent pContent;

	private SideBar SideBar;

	private PageFooter pFooter;

	// TODO: Add protected Content Area to PageObject

	public WebPage(WebDriver wDriver) {
		this.wDriver = wDriver;

		// Objects of WebPage components are initialized when Page is created
		SideBar = new SideBar(wDriver);
		NavBar = new NavigationTabBar(wDriver);

		pFooter = new PageFooter(wDriver);
	}

	public NavigationTabBar getNBar() {
		return NavBar;
	}

	protected void setNavBar(NavigationTabBar nBar) {
		NavBar = nBar;
	}

	public SideBar getSBar() {
		return SideBar;
	}

	protected void setSideBar(SideBar sBar) {
		SideBar = sBar;
	}

	public PageFooter getPFooter() {
		return pFooter;
	}

	public void setPFooter(PageFooter pFooter) {
		this.pFooter = pFooter;
	}

}
