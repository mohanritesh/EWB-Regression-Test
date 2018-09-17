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
	
	String sheetName = "Sheet2";
	String sheetName1 = "business1";
	String sheetName2 = "sub";
	String sheetName3 = "locsheet";
	String sheetName6 = "Sheet3";
	String sheetName4 = "gstsheet";
	String sheetName5 = "Sheet4";
	String sheetName7 = "Sheet5";
	String sheetName8 = "Sheet6";
	
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
	@DataProvider
	public Object[][] getPWCTestData1() {
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData2() {
		Object data[][] = TestUtil.getTestData(sheetName2);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData3() {
		Object data[][] = TestUtil.getTestData(sheetName3);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData6() {
		Object data[][] = TestUtil.getTestData(sheetName6);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData4() {
		Object data[][] = TestUtil.getTestData(sheetName4);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData5() {
		Object data[][] = TestUtil.getTestData(sheetName5);
		return data;
	}
	@DataProvider
	public Object[][] getPWCTestData7() {
		Object data[][] = TestUtil.getTestData(sheetName7);
		return data;
	}
	//
	@DataProvider
	public Object[][] getPWCTestData8() {
		Object data[][] = TestUtil.getTestData(sheetName8);
		return data;
	}
	//
	@Test(priority=1,dataProvider="getPWCTestData")
	public void validateAddCompanyTest(String companyPan,String companyName) throws Exception {
		homePage.clickOnCompanyLink();
		Thread.sleep(2000);
		adminPage.addNewCompany(companyPan, companyName);
		Thread.sleep(2000);
	}
	@Test(priority=2,dataProvider="getPWCTestData1")
	public void validateAddNewBusinessUnitTest(String companyName,String businessUnit) throws Exception {
		homePage.clickOnBusinessUnitLink();
		Thread.sleep(4000);
		adminPage.addNewBusinessUnit(companyName,businessUnit);
		Thread.sleep(5000);
	}
	@Test(priority=3,dataProvider="getPWCTestData2")
	public void validateAddNewSubBusinessUnitTest(String companyName,String businessUnit,String subBusinessUnitName) throws Exception {
		homePage.clickOnSubBusinessUnitLink();
		Thread.sleep(2000);
		adminPage.addNewSubBusinessUnit(companyName, businessUnit, subBusinessUnitName);
		Thread.sleep(2000);
	}
	@Test(priority=4,dataProvider="getPWCTestData3")
	public void validateAddNewLocationTest(String companyName,String locatCode,String locationCategory,String locatName,String stateNew,String addressNew1,String addressNew2,
			String placeNew,String pinCod) throws Exception {
		homePage.clickOnLocationLink();
		Thread.sleep(2000);
		adminPage.addNewLocation(companyName, locatCode, locationCategory, locatName, stateNew, addressNew1, addressNew2, placeNew, pinCod);
	}
	@Test(priority=5,dataProvider="getPWCTestData4")
	public void validateAddNewGstnTest(String companyName, String stateNew, String gstinNew, String userName, String passwordNew, 
			String authorisedSignatoryName, String phoneNumber, String emailId, String sezUnit) throws Exception {
		homePage.clickOnGstnLink();
		Thread.sleep(5000);
		adminPage.addNewGstn(companyName, stateNew, gstinNew, userName, passwordNew, authorisedSignatoryName, phoneNumber, emailId, sezUnit);
		Thread.sleep(5000);
	}
	@Test(priority=6,dataProvider="getPWCTestData5")
	public void addNewUserTest(String userName, String emailId, String userLoginId, String userRole) throws Exception {
		homePage.clickOnUserLink();
		Thread.sleep(5000);
		adminPage.addNewUser(userName, emailId, userLoginId, userRole);
		Thread.sleep(5000);
	}
	
	@Test(priority=7,dataProvider="getPWCTestData6")
	public void validateAddNewRoleTest(String userLoginId, String companyName, String stateNew, String gstinNew,String businessUnit, String subBusinessUnitName, 
			String locatName) throws Exception {
		homePage.clickOnAssignRoleLink();
		Thread.sleep(5000);
		adminPage.addNewRole(userLoginId, companyName, stateNew, gstinNew, businessUnit, subBusinessUnitName, locatName);
		Thread.sleep(5000);
	}
	@Test(priority=8,dataProvider="getPWCTestData7")
	public void validateAddCustomerMasterTest(String companyName,String natureOfCustomer,String gstinNew,String customerName,String taxpayerCategory,
			String mobileNumber,String emailId,String pinCod,String stateNew) throws Exception {
		homePage.clickOnCustomerMasterLink();
		Thread.sleep(5000);
		adminPage.addCustomerMaster(companyName, natureOfCustomer, gstinNew, customerName, taxpayerCategory, mobileNumber, emailId, pinCod, stateNew);
		Thread.sleep(5000);
	}
	@Test(priority=9,dataProvider="getPWCTestData8")
	public void validateAddSupplierMasterTest(String companyName,String natureOfSupplier,String gstinNew,String supplierName,String taxpayerCategory,
			String mobileNumber,String emailId,String pinCod,String stateNew) throws Exception {
		homePage.clickOnSupplierMasterLink();
		Thread.sleep(5000);
		adminPage.addSupplierMaster(companyName, natureOfSupplier, gstinNew, supplierName, taxpayerCategory, mobileNumber, emailId, pinCod, stateNew);
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}