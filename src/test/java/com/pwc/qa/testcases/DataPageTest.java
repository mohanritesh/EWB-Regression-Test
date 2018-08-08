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
	String sheetName = "dataUpload";
	
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
	/*
	@Test(priority=1)
	public void verifyDataPageLabel() {
		Assert.assertTrue(dataPage.verifyDataPageLabel(),"Data page label missing on the page");
	}
	
	@DataProvider
	public Object[][] getPWCTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getPWCTestData")
	*/
	@Test(priority=1)
	public void validateUploadDataTest() {
		homePage.clickOnDataUploadLink();
		dataPage.uploadNewData("SAP");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}