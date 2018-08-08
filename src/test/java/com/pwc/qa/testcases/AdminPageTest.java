package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.AdminPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.TestUtil;

public class AdminPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	AdminPage adminPage;
	String sheetName = "admin";
	
	public AdminPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		adminPage = new AdminPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		adminPage = homePage.clickOnAdminLink();
	}
	@DataProvider
	public Object[][] getPWCTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getPWCTestData")
	public void validateAddCompanyTest(String companyPan, String companyName) {
		homePage.clickOnCompanyLink();
		//adminPage.addNewCompany("CMCLL7860M", "ClaritusConsultingPan");
		adminPage.addNewCompany(companyPan, companyName);
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
}