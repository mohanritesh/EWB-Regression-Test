package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.DataPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.TestUtil;

public class DataPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	DataPage dataPage;
	String sheetName = "datalist";
	
	public DataPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		dataPage = new DataPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dataPage = homePage.clickOnDataLink();
	}
	@DataProvider
	public Object[][] getPWCTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1)
	public void validateUploadDataTest() throws Exception {
		homePage.clickOnDataUploadLink();
		Thread.sleep(2000);
		dataPage.verifyValidationMessage("SAP");
		Thread.sleep(2000);
		Assert.assertTrue(true, "Please choose a file");
	}
	@Test(priority=2)
	public void validateUploadFileTest(String dropdownMenu1) throws Exception {
		homePage.clickOnDataUploadLink();
		Thread.sleep(2000);
		//dataPage.verifyValidationMessage(dropdownMenu1);
		//Thread.sleep(5000);
		dataPage.uploadFile();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}