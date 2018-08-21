package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.AdminPage;
import com.pwc.qa.pages.DashboardPage;
import com.pwc.qa.pages.DataPage;
import com.pwc.qa.pages.EWBPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.pages.ReportPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	EWBPage ewbPage;
	DataPage dataPage;
	ReportPage reportPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		ewbPage = new EWBPage();
		dataPage = new DataPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Home","Home page title not matched");
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	@Test(priority=3)
	public void verifyEWBLinkTest() {
		ewbPage = homePage.clickOnEWBLink();
	}
	@Test(priority=4)
	public void verifyDataLinkTest() {
		dataPage = homePage.clickOnDataLink();
	}
	@Test(priority=5)
	public void verifyReportLinkTest() {
		reportPage = homePage.clickOnReportLink();
	}
	@Test(priority=6)
	public void verifyDashboardLinkTest() {
		dashboardPage= homePage.clickOnDashboardLink();
	}
	@Test(priority=7)
	public void verifyAdminLinkTest() {
		adminPage = homePage.clickOnAdminLink();
	}
	@Test(priority=7)
	public void pageLoadtime() {
		adminPage = homePage.clickOnAdminLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
