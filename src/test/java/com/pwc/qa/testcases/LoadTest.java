package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.EWBPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.Runner;
import com.pwc.qa.util.TestUtil;

public class LoadTest extends TestBase{
	
	public LoadTest() {
		super();
	}
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	EWBPage ewbPage;
	LoadTest loadtest;
	Runner runner;
	@BeforeMethod
	public void setup() {
		initialization();
		ewbPage = new EWBPage();
		loginPage = new LoginPage();
		runner=new Runner();
		runner.loadTest("Login Click");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		ewbPage = homePage.clickOnEWBLink();
		
	}
	@Test(priority=1)
	public void GenerateEwaBill() throws InterruptedException {
		homePage.clickonGenerateLink();
		//ewbPage.GenerateEwayBill();
		runner.loadTest("Generate Click");
		ewbPage = homePage.clickOnEWBLink();
		homePage.clickonGenerateLink();
		runner.loadTest("GenerateClick 2nd");
		//adminPage.addNewCompany("CMCLL7860M", "ClaritusConsultingPan");
		//adminPage.addNewCompany(companyPan, companyName);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
