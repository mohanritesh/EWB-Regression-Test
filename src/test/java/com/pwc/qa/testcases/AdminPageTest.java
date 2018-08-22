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
	//String sheetName = "admin";
	//String sheetName = "business";
	String sheetName = "sub";
	//String sheetName = "locsheet";
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
	public void validateAddCompanyTest(String companyPan, String companyName) throws Exception {
		homePage.clickOnCompanyLink();
		Thread.sleep(2000);
		adminPage.addNewCompany(companyPan, companyName);
		Thread.sleep(2000);
	}
	@Test(priority=2,dataProvider="getPWCTestData")
	public void validateAddNewBusinessUnitTest(String companyName,String businessUnit) throws InterruptedException {
		homePage.clickOnBusinessUnitLink();
		Thread.sleep(2000);
		adminPage.addNewBusinessUnit(companyName,businessUnit);
		Thread.sleep(2000);
	}
	@Test(priority=3,dataProvider="getPWCTestData")
	public void validateAddNewSubBusinessUnitTest(String companyName,String businessUnit,String subBusinessUnitName) throws Exception {
		homePage.clickOnSubBusinessUnitLink();
		Thread.sleep(2000);
		adminPage.addNewSubBusinessUnit(companyName, businessUnit, subBusinessUnitName);
		Thread.sleep(2000);
	}
	@Test(priority=4,dataProvider="getPWCTestData")
	public void validateAddNewLocationTest(String companyName,String addressNew1,String locatCode,String addressNew2,
			String locationCategory,String placeNew,String locatName,String pinCod,
			String stateNew) {
		homePage.clickOnLocationLink();
		adminPage.addNewLocation(companyName, addressNew1, locatCode, addressNew2, locationCategory, placeNew, locatName, pinCod, stateNew);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}