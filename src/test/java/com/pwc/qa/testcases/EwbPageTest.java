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

	// Generate EWB and status
	@Test(priority = 1, enabled = false)
	public void GenerateEwayBill() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEwayBill();

		// homePage.clickOnLogout();

	}

	// Try to exclude with Reason
	@Test(priority = 2, enabled = false)
	public void CancelExclusionWithReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionAfterSelectReason();

	}

	// Cancel Exclusion without reason
	@Test(priority = 3, enabled = false)
	public void CancelExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionWithoutReason();

	}

	// Exclding and checking file status
	@Test(priority = 4, enabled = false)
	public void CheckExcludedFileRetain() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CheckExcludedFileRetain();

	}

	// Exclude without reason
	@Test(priority = 5, enabled = false)
	public void ExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.ExcludeWithoutReason();

	}

	// All EWB_01 : Checking all records are loaded or not
	@Test(priority = 6, enabled = false)
	public void validateAllEwbPage() throws InterruptedException {
		homePage.clickOnAllEWBLink();
		ewbPage.loadAllEwbPage();
	}

	// All EWB_07 : Updation of NIC status based on the changes made in  Cancel  page
	@Test(priority = 7, enabled = false)
	public void cancelEwb() {
		homePage.clickOnAllEWBLink();
		ewbPage.cancelEwb();
	}

	// All EWB_06 : Updation of NIC status based on the changes made in Update vehicle page
	@Test(priority = 8, enabled = false)
	public void UpdateVehicle() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVehicle();
	}

	// Update vehicle_03 : Try to update vehicle with blank values.
	@Test(priority = 9, enabled = false)
	public void UpdateVechBlank() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechBlank();
	}

	// Update vehicle_02 : Try to update vehicle with invalid values in the fields.
	@Test(priority = 10, enabled = false)
	public void UpdateVechInvalidValues() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechInvalidValues();
	}

	// All EWB_08 : Updation of NIC status based on the changes made in Update movement page
	@Test(priority = 11, enabled = false)
	public void UpdateMovement() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateMovement();
	}

	// ALL_EWB_CP_03 : Reject  by  Counterparty
	@Test(priority = 12, enabled = false)
	public void AllEwbCpReject() {
		homePage.clickOnAllEWBCPLink();
		ewbPage.AllEwbCpReject();
	}

	// ALL_EWB_CP_04 : Accept by Counterparty
	@Test(priority = 13, enabled = false)
	public void AllEwbCpAccept() {
		homePage.clickOnAllEWBCPLink();
		ewbPage.AllEwbCpAccept();
	}

	/* Cancel_01 : Data population in the grid when the Cancel page is opened.
		(eway bill that are generated with in 24 hrs)*/
	@Test(priority = 14)
	public void CancelList() throws InterruptedException, ParseException {
		homePage.clickOnCancelLink();
		ewbPage.CancelList();
	}
	// Generate_06 : Try to edit with invalid values(transporter id) in the fields.
	@Test(priority = 15, enabled = false)
	public void GenerateEditInvalidTransporterId() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEditInvalidTransporterId();
	}
	// Generate_07 : Try to edit with blank values in the Transporter ID & Vehicle number
	@Test(priority = 16, enabled = false)
	public void GenerateEditBlankTransIdVechNo() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEditBlankTransIdVechNo();
	}
	// Generate_09 : Try to cancel editing without making any changes in the fields.
	@Test(priority = 17, enabled = false)
	public void GenerateEditCancel() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEditCancel();
	}
	// Generate_11 : Try to edit/update entries with existing data.
	@Test(priority = 18, enabled = false)
	public void GenerateEditSubmitExistingData() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEditSubmitExistingData();
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
