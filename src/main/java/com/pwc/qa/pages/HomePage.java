package com.pwc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pwc.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "idlogout")
	WebElement logOut;

	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[2]")
	WebElement logoutYes;
	
	@FindBy(linkText = "Yes")
	WebElement logoutConfirm;

	@FindBy(xpath = "//a[text()='rajneesh ']")
	WebElement userNameLabel;

	@FindBy(xpath = "(//a[contains(text(),'EWB')])[2]")
	WebElement ewbLink;

	@FindBy(linkText = "Generate")
	WebElement GenerateLink;

	@FindBy(xpath = "(//a[contains(text(),'Data')])[2]")
	WebElement dataLink;

	@FindBy(xpath = "(//li[2]/ul/li/a/span)[1]")
	WebElement dataUploadLink;
	
	@FindBy(xpath="(//li[2]/ul/li/a/span)[2]")
	WebElement dataDownloadLink;

	@FindBy(xpath = "(//a[contains(text(),'Report')])[2]")
	WebElement reportLink;

	@FindBy(xpath = "(//a[contains(text(),'Dashboard')])[2]")
	WebElement dashboardLink;

	@FindBy(xpath = "(//a[contains(text(),'Admin')])[2]")
	WebElement adminLink;
	
	//////////////////
	@FindBy(linkText = "Master Data")
	WebElement masterDataLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Customer Master')])[1]")
	WebElement customerMasterLink;
	
	@FindBy(xpath="(//a[contains(text(),'Supplier Master')])[1]")
	WebElement supplierMasterLink;
	
	@FindBy(xpath="(//a[contains(text(),'Product Master')])[1]")
	WebElement productMasterLink;
	
	@FindBy(xpath="(//a[contains(text(),'Transporter Master')])[1]")
	WebElement transporterMasterLink;
	
	@FindBy(xpath="(//a[contains(text(),'Logistics Master')])[1]")
	WebElement logisticsMasterLink;

	
	////////////
	@FindBy(linkText = "Company Setup")
	WebElement companySetupLink;

	@FindBy(xpath = "//a[contains(text(),'Company')]")
	WebElement companyLink;
	
	@FindBy(xpath="(//a[contains(text(),'Business Unit')])[1]")
	WebElement businessUnitLink;
	
	@FindBy(xpath="//a[contains(text(),'Sub Business Unit')]")
	WebElement subBusinessUnitLink;
	
	@FindBy(xpath="(//a[contains(text(),'Location')])[1]")
	WebElement locationLink;

	@FindBy(xpath = "//*[@id=\"containerMenuDiv\"]/div[2]/div/div/ul[2]/li[1]/ul/li[7]/a/span")
	WebElement allEwbLink;
	
	@FindBy(xpath="(//a[contains(text(),'GSTIN')])[1]")
	WebElement gstnLink;
	
	@FindBy(id="lnkuser")
	WebElement userLink;
	
	@FindBy(id="lnkassignrole")
	WebElement assignRoleLink;
	

	// Initializing the page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public EWBPage clickOnEWBLink() {
		ewbLink.click();
		return new EWBPage();
	}

	public DataPage clickOnDataLink() {
		dataLink.click();
		return new DataPage();
	}

	public ReportPage clickOnReportLink() {
		reportLink.click();
		return new ReportPage();
	}

	public DashboardPage clickOnDashboardLink() {
		dashboardLink.click();
		return new DashboardPage();
	}

	public AdminPage clickOnAdminLink() {
		adminLink.click();
		return new AdminPage();
	}

	public void clickOnDataUploadLink() {
		Actions action = new Actions(driver);
		action.moveToElement(dataLink).build().perform();
		dataUploadLink.click();
	}
	
	public void clickOnDataDownloadLink() {
		Actions action = new Actions(driver);
		action.moveToElement(dataLink).build().perform();
		dataDownloadLink.click();
  	}

	public void clickOnCompanyLink() {
		Actions action = new Actions(driver);
		action.moveToElement(companySetupLink).moveToElement(companyLink).build().perform();
		companyLink.click();
	}
	
	public void clickOnBusinessUnitLink() {
		Actions action = new Actions(driver);
		action.moveToElement(companySetupLink).moveToElement(businessUnitLink).build().perform();
		businessUnitLink.click();
	}
	public void clickOnSubBusinessUnitLink() {
		Actions action = new Actions(driver);
		action.moveToElement(companySetupLink).moveToElement(subBusinessUnitLink).build().perform();
		subBusinessUnitLink.click();
	}
	public void clickOnLocationLink() {
		Actions action = new Actions(driver);
		action.moveToElement(companySetupLink).moveToElement(locationLink).build().perform();
		locationLink.click();
	}
    public void clickOnGstnLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(companySetupLink).moveToElement(gstnLink).build().perform();
    	gstnLink.click();
    	Thread.sleep(3000);
    }
    public void clickOnUserLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(companySetupLink).moveToElement(userLink).build().perform();
    	userLink.click();
    	Thread.sleep(3000);
    }
    public void clickOnAssignRoleLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(companySetupLink).moveToElement(assignRoleLink).build().perform();
    	assignRoleLink.click();
    	Thread.sleep(3000);
    }
    /////////////////
    public void clickOnCustomerMasterLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(masterDataLink).moveToElement(customerMasterLink).build().perform();
    	customerMasterLink.click();
    	Thread.sleep(3000);
    }
    public void clickOnSupplierMasterLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(masterDataLink).moveToElement(supplierMasterLink).build().perform();
    	supplierMasterLink.click();
    	Thread.sleep(3000);
    }
    public void clickOnProductMasterLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(masterDataLink).moveToElement(productMasterLink).build().perform();
    	productMasterLink.click();
    	Thread.sleep(3000);
    }
    public void clickOntransporterMasterLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(masterDataLink).moveToElement(transporterMasterLink).build().perform();
    	transporterMasterLink.click();
    	Thread.sleep(3000);
    }
    public void clickOnLogisticsMasterLink() throws Exception {
    	Actions action = new Actions(driver);
    	action.moveToElement(masterDataLink).moveToElement(logisticsMasterLink).build().perform();
    	logisticsMasterLink.click();
    	Thread.sleep(3000);
    }
    //////////////////////
	public void clickonGenerateLink() {
		Actions action = new Actions(driver);
		action.moveToElement(GenerateLink).build().perform();
		GenerateLink.click();
	}

	public void clickOnAllEWBLink() {
		Actions action = new Actions(driver);
		action.moveToElement(allEwbLink).build().perform();
		allEwbLink.click();
	}

	public void clickOnLogout() {
		//Actions action = new Actions(driver);
		logOut.click();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//action.moveToElement(logoutConfirm).build().perform();
		logoutYes.click();
	}

}