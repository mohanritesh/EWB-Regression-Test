package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.AdminPage;
import com.pwc.qa.pages.EWBPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.TestUtil;

public class EwbPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	EWBPage ewbPage;

	public EwbPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		ewbPage = new EWBPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		ewbPage = homePage.clickOnEWBLink();

	}

	@Test(priority = 1, enabled = false)
	public void GenerateEwayBill() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEwayBill();
		
	}

	@Test(priority = 2, enabled=false)
	public void CancelExclusionWithReason() throws InterruptedException {
		homePage.clickonGenerateLink();
				ewbPage.CancelExclusionAfterSelectReason();

	}
	@Test(priority = 3, enabled = false)
	public void CancelExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
						ewbPage.CancelExclusionWithoutReason();

	}
	@Test(priority = 4, enabled = false)
	public void CheckExcludedFileRetain() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CheckExcludedFileRetain();
		
	}
	@Test(priority = 5)
	public void ExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.ExcludeWithoutReason();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
