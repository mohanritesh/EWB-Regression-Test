package com.pwc.qa.testcases;

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
	@Test(priority = 1)
	public void GenerateEwayBill() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.GenerateEwayBill();

		// homePage.clickOnLogout();

	}

	// Try to exclude with Reason
	@Test(priority = 2)
	public void CancelExclusionWithReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionAfterSelectReason();

	}

	// Cancel Exclusion without reason
	@Test(priority = 3)
	public void CancelExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CancelExclusionWithoutReason();

	}

	// Exclding and checking file status
	@Test(priority = 4)
	public void CheckExcludedFileRetain() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.CheckExcludedFileRetain();

	}

	// Exclude without reason
	@Test(priority = 5)
	public void ExclusionWithoutReason() throws InterruptedException {
		homePage.clickonGenerateLink();
		ewbPage.ExcludeWithoutReason();

	}

	// Checking all records are loaded or not
	@Test(priority = 6)
	public void validateAllEwbPage() {
		homePage.clickOnAllEWBLink();
		ewbPage.loadAllEwbPage();
	}

	// Canceling EWB
	@Test(priority = 7)
	public void cancelEwb() {
		homePage.clickOnAllEWBLink();
		ewbPage.cancelEwb();
	}

	// Update current vehicle status
	@Test(priority = 8)
	public void UpdateVehicle() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVehicle();
	}

	// Check with blank values in update vehicle
	@Test(priority = 9)
	public void UpdateVechBlank() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechBlank();
	}

	// Check with invalid values in update vehicle
	@Test(priority = 10)
	public void UpdateVechInvalidValues() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateVechInvalidValues();
	}

	// Current vehicle status
	@Test(priority = 11)
	public void UpdateMovement() {
		homePage.clickOnAllEWBLink();
		ewbPage.UpdateMovement();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
