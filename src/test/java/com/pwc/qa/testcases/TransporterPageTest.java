package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.DataPage;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.pages.TransporterPage;
import com.pwc.qa.util.TestUtil;

public class TransporterPageTest extends TestBase{

	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	DataPage dataPage;
	String sheetName = "dataUpload";
	TransporterPage transporterpage;
	
	public TransporterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		transporterpage = new TransporterPage(); 
		homePage = loginPage.login(prop.getProperty("transporter_username"), prop.getProperty("transporter_password"));
		
	}

	@Test(priority=21)
	public void UpdateVehicleTransporter() {
		System.out.println("initial");
		transporterpage.UpdateVehicleTransporter();
	}
	@Test(priority=22)
	public void UpdateMovementTransporter() {
		System.out.println("initial");
		transporterpage.UpdateMovementTransporter();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
