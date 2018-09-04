package com.pwc.qa.testcases;

import java.text.ParseException;

import org.testng.Assert;
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
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		ewbPage = homePage.clickOnEWBLink();

	}

	// Generate EWB and status[]
	@Test(priority = 5,enabled=false)
	public void GenerateEwayBill() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEwayBill();

		// homePage.clickOnLogout();

	}

	// Try to exclude with Reason
	@Test(priority = 6)
	public void CancelExclusionWithReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionAfterSelectReason();

	}

	// Cancel Exclusion without reason
	@Test(priority = 7,enabled=false)
	public void CancelExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionWithoutReason();

	}

	// Exclding and checking file status
	@Test(priority = 8)
	public void CheckExcludedFileRetain() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CheckExcludedFileRetain();

	}

	// Exclude without reason
	@Test(priority = 9)
	public void ExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.ExcludeWithoutReason();

	}

	// Checking all records are loaded or not
	@Test(priority = 10)
	public void validateAllEwbPage() {
		homePage.clickOnAllEWBLink();
		ewbPage.loadAllEwbPage();
	}

	// Canceling EWB
	@Test(priority = 11)
	public void cancelEwb() {
		homePage.clickOnAllEWBLink();
		ewbPage.cancelEwb();
	}

	// Update current vehicle status
	@Test(priority = 12)
	public void UpdateVehicle() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVehicle();
	}

	// Check with blank values in update vehicle
	@Test(priority = 13)
	public void UpdateVechBlank() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechBlank();
	}

	// Check with invalid values in update vehicle
	@Test(priority = 14)
	public void UpdateVechInvalidValues() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechInvalidValues();
	}

	// Current vehicle status
	@Test(priority = 15)
	public void UpdateMovement() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateMovement();
	}

	// All EWB CP Reject
	@Test(priority = 16)
	public void AllEwbCpReject() {
		homePage.clickOnAllEWBCPLink();
		ewbPage.AllEwbCpReject();
	}

	// All EWB CP Accept
	@Test(priority = 17)
	public void AllEwbCpAccept() {
		homePage.clickOnAllEWBCPLink();
		ewbPage.AllEwbCpAccept();
	}

	// Cancel List 
	@Test(priority = 18)
	public void CancelList() throws InterruptedException, ParseException {
		homePage.clickOnCancelLink();
		ewbPage.CancelList();
	}
	@Test(priority = 19)
	public void RejectListStatus() throws InterruptedException, ParseException {
		homePage.clickOnRejectLink();
		ewbPage.rejectlListDateTime();
	}
	@Test(priority = 20)
	public void validateGenerateRecordscount() {
		homePage.clickonGenerateLink();
		ewbPage.generateRecordsCount();
	}
	
	@Test(priority = 21)
	public void excludeFromDocDetailsPopup() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.popupDetailsExclude();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
