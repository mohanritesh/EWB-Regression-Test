package com.pwc.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pwc.qa.base.TestBase;



public class AdminPage extends TestBase {
	
	@FindBy(id="addnew")
	WebElement addNewButton;
	
	@FindBy(xpath="//input[@id='company_pan']")
	WebElement companyPAN1;
	
	@FindBy(id="company_name")
	WebElement companyName1;
	
	@FindBy(id="btn_save")
	WebElement saveButton;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement cancelButton;
		
	@FindBy(xpath="(//button[@type='button'])[11]")
	WebElement okButtonForPopup;
	
    @FindBy(xpath="//input[@type='search']")
	WebElement searchData;
	
	@FindBy(xpath="(//a[contains(@href, '')])[122]")
	WebElement deleteDataButton;
	
	////////////
	
	@FindBy(xpath="//input[@name='124']")
	WebElement checkboxSelectForUpdateCompany;
	
	@FindBy(xpath="(//a[contains(@href, '')])[71]")
	WebElement editButtonForUpdateCompany;
	
	@FindBy(xpath="//input[@name='125']")
	WebElement selectCheckboxForDeleteCompanyData;
	
	@FindBy(xpath="(//a[contains(@href, '')])[70]")
	WebElement deleteCompanyData;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	WebElement closePopupButton;
	
	@FindBy(xpath="(//input[@id='check-box-main-company'])[1]")
	WebElement selectCheckboxForDownloadExcel;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement downloadExcel;
	
	////////////////////////////////////////////////////
	@FindBy(xpath="(//input[@id='check-box-main-bu'])[1]")
	WebElement selectCheckboxForDownloadExcelBU;
	
	@FindBy(id="bu")
	WebElement businessUnitName;
	
	@FindBy(xpath="//input[@name='78']")
	WebElement selectCheckboxForUpdateBU;
	
	@FindBy(xpath="(//a[contains(@href, '')])[71]")
	WebElement editIconForUpdateBU;
	
	@FindBy(xpath="//input[@name='79']")
	WebElement selectCheckboxForDeleteBU;
	
	@FindBy(xpath="(//a[contains(@href, '')])[70]")
	WebElement editIconDeleteBU;
	
   //////////////////
	@FindBy(xpath="(//input[@id='check-box-main-sbu'])[1]")
	WebElement selectCheckboxForDownloadExcelSBU;
	
	@FindBy(id="sbu_name")
	WebElement subBusinessUnit;
	
	@FindBy(xpath="//input[@name='74']")
    WebElement selectCheckboxForUpdateSBU;

  @FindBy(xpath="(//a[contains(@href, '')])[73]")
  WebElement editIconForUpdateSBU;

  @FindBy(xpath="//input[@name='61']")
  WebElement selectCheckboxForDeleteSBU;

  @FindBy(xpath="(//a[contains(@href, '')])[71]")
  WebElement editIconDeleteSBU;
  
/////////////////
@FindBy(xpath="//input[@name='51']")
WebElement selectCheckboxForUpdateLocation;

@FindBy(xpath="(//a[contains(@href, '')])[81]")
WebElement editIconForUpdateLocation;

@FindBy(xpath="//input[@name='69']")
WebElement selectCheckboxForDeleteLocation;

@FindBy(xpath="(//a[contains(@href, '')])[136]")
WebElement editIconDeleteLocation;

@FindBy(id="address1")
WebElement addressNo1;

@FindBy(id="location_code")
WebElement locationCode;

@FindBy(id="address2")
WebElement addressNo2;

@FindBy(id="place")
WebElement placeNew1;

@FindBy(id="location_name")
WebElement locationName;

@FindBy(id="pin_code")
WebElement pinCode;

///////////////////////////////////////////////////////////
	
	@FindBy(xpath="//input[@name='425']")
	WebElement selecCheckboxForUpdateUser;
	
	@FindBy(xpath="(//a[contains(@href, '')])[85]")
	WebElement editUpdateUserIcon;
	
	@FindBy(id="address1")
	WebElement addressUpdate;
	
	@FindBy(id="address1")
	WebElement userUpdate;
	
	@FindBy(id="user_name")
	WebElement userName1;
	
	@FindBy(id="email_id")
	WebElement emailId1;
	
	@FindBy(id="user_loginid")
	WebElement userLoginId1;
	
	@FindBy(id="ddluserrole")
	WebElement userRole1;
	
	@FindBy(xpath="(//a[contains(@href, '')])[82]")
	WebElement deleteIconForUser;
	
	@FindBy(xpath="//input[@name='360']")
	WebElement enableCheckboxForDeleteUser;
	
	//////////////////////
	
	
	@FindBy(xpath="//input[@id='gstin']")
	WebElement enterGSTNForAddGstin;
	
	@FindBy(id="gstinpassword")
	WebElement enterPasswordForAddGstin;
	
	@FindBy(id="authorised_signatory_name")
	WebElement enterAuthorisedSignatoryNameForAddGstin;
	
	@FindBy(xpath="//input[@id='phone_no']")
	WebElement enterPhoneNoForAddGstin;
	
	@FindBy(xpath="//input[@name='36']")
	WebElement selectCheckboxForUpdateGstin;

	@FindBy(xpath="(//a[contains(@href, '')])[69]")
	WebElement editIconForUpdateGstin;

	@FindBy(xpath="//input[@name='110']")
	WebElement selectCheckboxForDeleteGstin;

	@FindBy(xpath="(//a[contains(@href, '')])[76]")
	WebElement editIconForDeleteGstin;
	
	///////////////////
	@FindBy(xpath="//input[@name='355']")
	WebElement selectCheckboxForUpdateUserRole;
	
	@FindBy(xpath="(//a[contains(@href, '')])[83]")
	WebElement editIconForUpdateUserRole;
	//////////////////////////////////////////////////////////////////
	@FindBy(xpath="//input[@id='customer_code']")
	WebElement enterCustomerCode;
	
	@FindBy(xpath="//input[@id='custgstin']")
	WebElement enterCustomerGstin;
	
	@FindBy(xpath="//input[@id='customer_name']")
	WebElement enterCustomerName;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	WebElement enterMobileNo;
	
	@FindBy(xpath="//input[@id='pincode']")
	WebElement enterPinCode;
	
	@FindBy(xpath="(//a[contains(@href, '')])[71]")
	WebElement editIconForUpdateCustomerMaster;
	
	@FindBy(xpath="(//a[contains(@href, '')])[74]")
	WebElement editIconForDeleteCustomerMaster;
	
	//Initializing the Page Objects
		public AdminPage() {
			PageFactory.initElements(driver, this);
		}
	
		public void addNewCompany(String companyPan,String companyName) throws Exception {
		//download data excel
			selectCheckboxForDownloadExcel.click();
			Thread.sleep(2000);
	        downloadExcel.click();
	        System.out.println("Excel Downloaded successfully");
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
		//update field
			checkboxSelectForUpdateCompany.click();
			Thread.sleep(4000);
			editButtonForUpdateCompany.click();
			Thread.sleep(4000);
			okButtonForPopup.click();
			Thread.sleep(3000);
			companyName1.clear();
			Thread.sleep(2000);
			companyName1.sendKeys("compppp");
			Thread.sleep(3000);
			saveButton.click();
			Thread.sleep(3000);
			Assert.assertTrue(true, "Data updated successfully.");
			Thread.sleep(1000);
			closePopupButton.click();
			Thread.sleep(4000);
			System.out.println("Data successfully updated");
			driver.navigate().refresh();
			Thread.sleep(5000);
			//Search for updated data
			searchData.sendKeys("PPRQU4122P\n");
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(5000);
		//Delete data
			selectCheckboxForDeleteCompanyData.click();
			Thread.sleep(3000);
			deleteCompanyData.click();
			Assert.assertTrue(true, "Are you sure you want to delete this?");
			Thread.sleep(2000);
			okButtonForPopup.click();
			Assert.assertTrue(true, "Data deleted successfully.");
			Thread.sleep(3000);
			closePopupButton.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			//Search the deleted data
			searchData.sendKeys("NQQQU4122P\n");
			System.out.println("Sorry data has been already deleted!");
			Thread.sleep(3000);
			driver.navigate().refresh();
		//Add new company
		addNewButton.click();
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true,"Company PAN- Not available");
		Assert.assertTrue(true,"Company Name- Not available");
		Thread.sleep(3000);
		companyPAN1.sendKeys("@!@#$^");
		Thread.sleep(3000);
		companyName1.sendKeys("@!@#$^");
		Thread.sleep(3000);
		saveButton.click();
		Assert.assertTrue(true,"Company PAN- Invalid format");
		Thread.sleep(3000);
		companyPAN1.clear();
		Thread.sleep(2000);
		companyName1.clear();
		Thread.sleep(2000);
		companyPAN1.sendKeys(companyPan);
		Thread.sleep(2000);
		companyName1.sendKeys(companyName);
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data saved successfully.");
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Search saved data
		searchData.sendKeys("UNIQU4122E\n");
		Thread.sleep(5000);
		driver.navigate().refresh();
	//Verify existing data
		addNewButton.click();
		Thread.sleep(2000);
		companyPAN1.sendKeys(companyPan);
		Thread.sleep(2000);
		companyName1.sendKeys(companyName);
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Data already exists");
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data already exists");
		Thread.sleep(3000);
		System.out.println("Data already exists");
		closePopupButton.click();
		Thread.sleep(2000);
		cancelButton.click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	public void addNewBusinessUnit(String companyName,String businessUnit) throws Exception {
		//download data excel
		selectCheckboxForDownloadExcelBU.click();
		Thread.sleep(2000);
        downloadExcel.click();
        System.out.println("Excel Downloaded successfully");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	//update field
		selectCheckboxForUpdateBU.click();
		Thread.sleep(4000);
		editIconForUpdateBU.click();
		Thread.sleep(4000);
		okButtonForPopup.click();
		Thread.sleep(3000);
		businessUnitName.clear();
		Thread.sleep(2000);
		businessUnitName.sendKeys("alpbu199");
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data updated successfully.");
		Thread.sleep(1000);
		closePopupButton.click();
		Thread.sleep(4000);
		System.out.println("Data successfully updated");
		driver.navigate().refresh();
		Thread.sleep(5000);
	//Search for updated data
		searchData.sendKeys("ALPHA\n");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	//Delete data
		selectCheckboxForDeleteBU.click();
		Thread.sleep(3000);
		editIconDeleteBU.click();
		Assert.assertTrue(true, "Are you sure you want to delete this?");
		Thread.sleep(2000);
		okButtonForPopup.click();
		Assert.assertTrue(true, "Data deleted successfully.");
		Thread.sleep(3000);
		closePopupButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Search the deleted data
		searchData.sendKeys("ABC limited\n");
		System.out.println("Sorry data has been already deleted!");
		Thread.sleep(3000);
		driver.navigate().refresh();
	//Try to save by leaving mandatory fields blank.
				addNewButton.click();
				Thread.sleep(4000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a company");
				Thread.sleep(3000);
				businessUnitName.sendKeys("@!@#$^");
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a company");
				Thread.sleep(3000);
				businessUnitName.clear();
				Thread.sleep(3000);
				Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='ddlComapnyList']")));
				selectDropdown.selectByVisibleText(companyName);
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "Business Unit- Not available");
				Thread.sleep(3000);
				businessUnitName.sendKeys(businessUnit);
				Thread.sleep(2000);
				saveButton.click();
				Assert.assertTrue(true, "Data saved successfully.");
				Thread.sleep(4000);
				System.out.println("Data saved successfully");
				closePopupButton.click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
		//Search saved data
				searchData.sendKeys("ALPHA\n");
				Thread.sleep(5000);
				driver.navigate().refresh();
		//Data Exist : duplicate entry being allowed for same BU name
				addNewButton.click();
				Thread.sleep(3000);
				Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ddlComapnyList']")));
				selectDropdown1.selectByVisibleText(companyName);
				Thread.sleep(4000);
				businessUnitName.sendKeys(businessUnit);
				Thread.sleep(4000);
				saveButton.click();
				Assert.assertTrue(true, "Data already exists");
				Thread.sleep(3000);
				Assert.assertTrue(true, "Data already exists");
				Thread.sleep(3000);
				System.out.println("Data already exists");
				closePopupButton.click();
				Thread.sleep(2000);
				cancelButton.click();
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(5000);
	}
public void addNewSubBusinessUnit(String companyName,String businessUnit,String subBusinessUnitName) throws Exception {
   //download data excel
        selectCheckboxForDownloadExcelSBU.click();
		Thread.sleep(2000);
        downloadExcel.click();
        System.out.println("Excel Downloaded successfully");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	//update field
		selectCheckboxForUpdateSBU.click();
		Thread.sleep(4000);
		editIconForUpdateSBU.click();
		Thread.sleep(4000);
		okButtonForPopup.click();
		Thread.sleep(3000);
		subBusinessUnit.clear();
		Thread.sleep(2000);
		subBusinessUnit.sendKeys("updated19");
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data updated successfully.");
		Thread.sleep(1000);
		closePopupButton.click();
		Thread.sleep(4000);
		System.out.println("Data successfully updated");
		driver.navigate().refresh();
		Thread.sleep(5000);
	//Search for updated data
		searchData.sendKeys("AllState\n");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	//Delete data
		selectCheckboxForDeleteSBU.click();
		Thread.sleep(3000);
		editIconDeleteBU.click();
		Assert.assertTrue(true, "Are you sure you want to delete this?");
		Thread.sleep(2000);
		okButtonForPopup.click();
		Assert.assertTrue(true, "Data deleted successfully.");
		Thread.sleep(3000);
		closePopupButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Search the deleted data
		searchData.sendKeys("B&M\n");
		System.out.println("Sorry data has been already deleted!");
		Thread.sleep(3000);
		driver.navigate().refresh();
	//Try to save by leaving mandatory fields blank.
		addNewButton.click();
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a company");
		Thread.sleep(3000);
		Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='ddlComapnyList']")));
		selectDropdown.selectByVisibleText(companyName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a business unit");
		Thread.sleep(3000);
		subBusinessUnit.sendKeys("@!@@@@@#$##");
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ddlBusinessUnit']")));
		selectDropdown1.selectByVisibleText(businessUnit);
		Thread.sleep(4000);
		subBusinessUnit.clear();
		Thread.sleep(3000);
		saveButton.click();
		Assert.assertTrue(true, "Sub Business Unit- Not available");
		Thread.sleep(3000);
		subBusinessUnit.sendKeys(subBusinessUnitName);
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
//Search saved data
		searchData.sendKeys("CULPA\n");
		Thread.sleep(5000);
		driver.navigate().refresh();
//Data Exist : duplicate entry being allowed for same BU name
		addNewButton.click();
		Thread.sleep(3000);
		Select selectDropdown2 = new Select(driver.findElement(By.xpath("//select[@id='ddlComapnyList']")));
		selectDropdown2.selectByVisibleText(companyName);
		Thread.sleep(4000);
		Select selectDropdown3 = new Select(driver.findElement(By.xpath("//select[@id='ddlBusinessUnit']")));
		selectDropdown3.selectByVisibleText(businessUnit);
		Thread.sleep(4000);
		subBusinessUnit.sendKeys(subBusinessUnitName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Data already exists");
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data already exists");
		Thread.sleep(3000);
		System.out.println("Data already exists");
		closePopupButton.click();
		Thread.sleep(2000);
		cancelButton.click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	public void addNewLocation(String companyName,String locatCode,String locationCategory,String locatName,String stateNew,String addressNew1,String addressNew2,
			String placeNew,String pinCod) throws Exception {
		//update & Edit
		selectCheckboxForUpdateLocation.click();
		Thread.sleep(3000);
		editIconForUpdateLocation.click();
		Thread.sleep(3000);
		okButtonForPopup.click();
		Thread.sleep(3000);
		locationCode.sendKeys(locatCode);
		Thread.sleep(3000);
		Select selectDropdown = new Select(driver.findElement(By.id("DDLLocationCat")));
		selectDropdown.selectByVisibleText(locationCategory);
		Thread.sleep(4000);
		addressNo1.sendKeys(addressNew1);
		Thread.sleep(3000);
		addressNo2.sendKeys(addressNew2);
		Thread.sleep(3000);
		placeNew1.sendKeys(placeNew);
		Thread.sleep(3000);
		pinCode.sendKeys("123456");
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data updated successfully.");
		Thread.sleep(1000);
		closePopupButton.click();
		Thread.sleep(4000);
		System.out.println("Data successfully updated");
		driver.navigate().refresh();
		Thread.sleep(5000);
			//Search for updated data
				searchData.sendKeys("WHERE\n");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(5000);
		//try to delete
		//Delete data
		selectCheckboxForDeleteLocation.click();
		Thread.sleep(3000);
		editIconDeleteLocation.click();
		Assert.assertTrue(true, "Are you sure you want to delete this?");
		Thread.sleep(2000);
		okButtonForPopup.click();
		Assert.assertTrue(true, "Data deleted successfully.");
		Thread.sleep(3000);
		closePopupButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Search the deleted data
		searchData.sendKeys("Abcde\n");
		System.out.println("Sorry data has been already deleted!");
		Thread.sleep(3000);
		driver.navigate().refresh();
		//Try to save by leaving mandatory fields blank.
		addNewButton.click();
		Thread.sleep(4000);
		locationCode.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		locationName.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		addressNo1.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		addressNo2.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		placeNew1.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		pinCode.sendKeys("@!@#$%^");
		Thread.sleep(3000);
		saveButton.click();
		Assert.assertTrue(true, "Pin Code- Invalid format");
		Thread.sleep(3000);
		pinCode.clear();
		Thread.sleep(2000);
		pinCode.sendKeys("123456");
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a company");
		Thread.sleep(3000);
		Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ddlCompanylist']")));
		selectDropdown1.selectByVisibleText(companyName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a state");
		Thread.sleep(3000);
		Select selectDropdown2 = new Select(driver.findElement(By.xpath("//select[@id='ddlState']")));
		selectDropdown2.selectByVisibleText(stateNew);
		Thread.sleep(4000);
		locationCode.clear();
		Thread.sleep(3000);
		locationCode.sendKeys(locatCode);
		Thread.sleep(2000);
		Select selectDropdown3 = new Select(driver.findElement(By.id("DDLLocationCat")));
		selectDropdown3.selectByVisibleText(locationCategory);
		Thread.sleep(4000);
		locationName.clear();
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Location Name- Not available");
		Thread.sleep(3000);
		locationName.sendKeys(locatName);
		Thread.sleep(2000);
		addressNo1.clear();
		Thread.sleep(2000);
		addressNo1.sendKeys(addressNew1);
		Thread.sleep(3000);
		addressNo2.clear();
		Thread.sleep(2000);
		addressNo2.sendKeys(addressNew2);
		Thread.sleep(3000);
		placeNew1.clear();
		Thread.sleep(2000);
		placeNew1.sendKeys(placeNew);
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
				closePopupButton.click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
		//Search saved data
				searchData.sendKeys("ALPHA\n");
				Thread.sleep(5000);
				driver.navigate().refresh();
		//Data Exist : duplicate entry being allowed
				addNewButton.click();
				Thread.sleep(3000);
				Select selectDropdown4 = new Select(driver.findElement(By.xpath("//select[@id='ddlCompanylist']")));
				selectDropdown4.selectByVisibleText(companyName);
				Thread.sleep(4000);
				Select selectDropdown5 = new Select(driver.findElement(By.xpath("//select[@id='ddlState']")));
				selectDropdown5.selectByVisibleText(stateNew);
				Thread.sleep(4000);
				locationName.sendKeys(locatName);
				Thread.sleep(3000);
				Select selectDropdown6 = new Select(driver.findElement(By.xpath("//select[@id='DDLLocationCat']")));
				selectDropdown6.selectByVisibleText(locationCategory);
				Thread.sleep(4000);
				locationCode.sendKeys(locatCode);
				Thread.sleep(3000);
				addressNo1.sendKeys(addressNew1);
				Thread.sleep(3000);
				addressNo2.sendKeys(addressNew2);
				Thread.sleep(3000);
				placeNew1.sendKeys(placeNew);
				Thread.sleep(3000);
				pinCode.sendKeys("123456");
				Thread.sleep(3000);
				saveButton.click();
				Thread.sleep(4000);
				Assert.assertTrue(true, "Data already exists.");
				Thread.sleep(3000);
				System.out.println("Data already exists");
				closePopupButton.click();
				Thread.sleep(2000);
				cancelButton.click();
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(5000);
	}
	public void addNewGstn(String companyName, String stateNew, String gstinNew, String userName, String passwordNew, String authorisedSignatoryName, 
			String phoneNumber, String emailId, String sezUnit) throws Exception {
		//update & Edit
		selectCheckboxForUpdateGstin.click();
				Thread.sleep(3000);
				editIconForUpdateGstin.click();
				Thread.sleep(3000);
				okButtonForPopup.click();
				Thread.sleep(3000);
				emailId1.sendKeys(emailId);
				Thread.sleep(3000);
				saveButton.click();
				Thread.sleep(3000);
				Assert.assertTrue(true, "Data updated successfully.");
				Thread.sleep(1000);
				closePopupButton.click();
				Thread.sleep(4000);
				System.out.println("Data successfully updated");
				driver.navigate().refresh();
				Thread.sleep(5000);
					//Search for updated data
						searchData.sendKeys("Pepsico\n");
						Thread.sleep(3000);
						driver.navigate().refresh();
						Thread.sleep(5000);
				//try to delete
						selectCheckboxForDeleteGstin.click();
				Thread.sleep(3000);
				editIconForDeleteGstin.click();
				Assert.assertTrue(true, "Are you sure you want to delete this?");
				Thread.sleep(2000);
				okButtonForPopup.click();
				Assert.assertTrue(true, "Data deleted successfully.");
				Thread.sleep(3000);
				closePopupButton.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				//Search the deleted data
				searchData.sendKeys("abcooooo\n");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(2000);
		//Gst Mstr_10: Try to save
		//Try to save by leaving mandatory fields blank.
		//Gst Mstr_8: try to save with invalid chars
		//Gst Mstr_9: all special characters in the text field
				addNewButton.click();
				Thread.sleep(4000);
				enterGSTNForAddGstin.sendKeys("@!@@#$$%%");
				Thread.sleep(3000);
				userName1.sendKeys("@!@@#$$%%");
				Thread.sleep(4000);
				enterPasswordForAddGstin.clear();
				Thread.sleep(2000);
				enterPasswordForAddGstin.sendKeys("@!@@#$$%%");
				Thread.sleep(3000);
				enterAuthorisedSignatoryNameForAddGstin.sendKeys("@!@@#$$%%");
				Thread.sleep(3000);
				enterPhoneNoForAddGstin.sendKeys("@!@@#$$%%");
				Thread.sleep(3000);
				emailId1.sendKeys("@!@@#$$%%");
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a company");
				Assert.assertTrue(true, "GSTIN should have valid state code, company pan provided in company master");
				Assert.assertTrue(true, "Mobile No.- Invalid format");
				Assert.assertTrue(true, "Email ID- Invalid format");
				Thread.sleep(3000);
				cancelButton.click();
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(1000);
				addNewButton.click();
				Thread.sleep(4000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a company");
				Thread.sleep(2000);
				System.out.println("Please enter company");
				Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ddlCompanylist']")));
				selectDropdown1.selectByVisibleText(companyName);
				Thread.sleep(4000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a state");
				Thread.sleep(3000);
				Select selectDropdown2 = new Select(driver.findElement(By.xpath("//select[@id='ddlStateList']")));
				selectDropdown2.selectByVisibleText(stateNew);
				Thread.sleep(4000);
				saveButton.click();
				Assert.assertTrue(true, "Please select a SEZ unit");
				Thread.sleep(3000);
				Select selectDropdown3 = new Select(driver.findElement(By.xpath("//select[@id='ddlIsSEZUnitList']")));
				selectDropdown3.selectByVisibleText(sezUnit);
				Thread.sleep(4000);
				saveButton.click();
				Thread.sleep(4000);
				Assert.assertTrue(true, "GSTIN- Not available");
				Assert.assertTrue(true, "User Name- Not available");
				Thread.sleep(3000);
				//Gst Mstr_3: try to save with invalid format in Gstin field
				enterGSTNForAddGstin.sendKeys("27ddssddg");
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "GSTIN should have valid state code, company pan provided in company master");
				Thread.sleep(3000);
				enterGSTNForAddGstin.clear();
				Thread.sleep(4000);
				//Gst Mstr_4: try to save with correct GSTIN format but with different Pan which is not in the company master
				enterGSTNForAddGstin.sendKeys("26CGCPP4381F");
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "GSTIN should have valid state code, company pan provided in company master");
				Thread.sleep(3000);
				enterGSTNForAddGstin.clear();
				Thread.sleep(4000);
				enterGSTNForAddGstin.sendKeys(gstinNew);
				Thread.sleep(3000);
				saveButton.click();
				Thread.sleep(4000);
				Assert.assertTrue(true, "User Name- Not available");
				Thread.sleep(3000);
				userName1.sendKeys(userName);
				Thread.sleep(3000);
				enterPasswordForAddGstin.clear();
				Thread.sleep(3000);
				enterPasswordForAddGstin.sendKeys(passwordNew);
				Thread.sleep(3000);
				enterAuthorisedSignatoryNameForAddGstin.sendKeys(authorisedSignatoryName);
				Thread.sleep(3000);
				//Gst Mstr_2: try to save with invalid format in phone no field
				enterPhoneNoForAddGstin.sendKeys("21212121212121212121");
				Thread.sleep(1000);
				saveButton.click();
				Assert.assertTrue(true, "Mobile No.- Invalid format");
				Thread.sleep(4000);
				enterPhoneNoForAddGstin.clear();
				Thread.sleep(4000);
				enterPhoneNoForAddGstin.sendKeys("7620195178");
				Thread.sleep(3000);
				//Gst Mstr_1:  try to save with invalid format in email field
				emailId1.sendKeys("abcreg");
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "Email ID- Invalid format");
				Thread.sleep(4000);
				emailId1.clear();
				Thread.sleep(3000);
				emailId1.sendKeys(emailId);
				Thread.sleep(3000);
				saveButton.click();
				Assert.assertTrue(true, "Data saved successfully.");
				Thread.sleep(4000);
				System.out.println("Data saved successfully");
				closePopupButton.click();
				driver.navigate().refresh();
				Thread.sleep(4000);
				//Search saved data
				searchData.sendKeys("ALPHA\n");
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				//Gst Mstr_5: try to search for different records
				searchData.sendKeys("Karnataka gstin3\n");
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(4000);
}
	public void addNewUser(String userName, String emailId, String userLoginId, String userRole) throws Exception {
		//Try to save
		addNewButton.click();
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true,"Please select role");
		Thread.sleep(4000);
		Select selectDropdown = new Select(driver.findElement(By.id("ddluserrole")));
		selectDropdown.selectByVisibleText(userRole);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "User Name- Not available");
		Thread.sleep(4000);
		userName1.sendKeys(userName);
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "Email Id - Not available");
		Thread.sleep(4000);
		emailId1.sendKeys(emailId);
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "User Login Id - Not available");
		Thread.sleep(4000);
		userLoginId1.sendKeys(userLoginId);
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Data saved successfully.");
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		driver.navigate().refresh();
		Thread.sleep(4000);
		//Search saved data
		searchData.sendKeys("Ami111\n");
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		//try to save with already existing login id
				addNewButton.click();
				Thread.sleep(3000);
				userName1.sendKeys(userName);
				Thread.sleep(2000);
				emailId1.sendKeys(emailId);
				Thread.sleep(2000);
				userLoginId1.sendKeys(userLoginId);
				Thread.sleep(2000);
				userRole1.sendKeys(userRole);
				Thread.sleep(4000);
				saveButton.click();
				Thread.sleep(4000);
				System.out.println("Data already exists");
				closePopupButton.click();
				Thread.sleep(5000);
				cancelButton.click();
				Thread.sleep(6000);
		//Update
		selecCheckboxForUpdateUser.click();
		Thread.sleep(4000);
		editUpdateUserIcon.click();
		Thread.sleep(4000);
		okButtonForPopup.click();
		Thread.sleep(4000);
		addressUpdate.sendKeys(userName);
		Thread.sleep(4000);
		saveButton.click();
		System.out.println("Data Successfully Updated");
		Thread.sleep(4000);
		closePopupButton.click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		//Search for updated data
		searchData.sendKeys("aaabkit\n");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//try to delete
		enableCheckboxForDeleteUser.click();
		Thread.sleep(4000);
		deleteIconForUser.click();
		Thread.sleep(3000);
		okButtonForPopup.click();
		System.out.println("Data not Deleted");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Search for updated data
				searchData.sendKeys("aaaaaaa\n");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(5000);
	}
	public void addNewRole(String userLoginId, String companyName, String stateNew, String gstinNew,String businessUnit, String subBusinessUnitName, 
			String locatName) throws Exception {
		//Asn Mstr_1:Try to save by leaving mandatory fields blank.
		addNewButton.click();
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, " Please select a user login id");
		Thread.sleep(3000);
		Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ddluserloginid']")));
		selectDropdown1.selectByVisibleText(userLoginId);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a company");
		Thread.sleep(4000);
		Select selectDropdown2 = new Select(driver.findElement(By.xpath("//select[@id='ddlcompany']")));
		selectDropdown2.selectByVisibleText(companyName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a state");
		Thread.sleep(3000);
		Select selectDropdown3 = new Select(driver.findElement(By.xpath("//select[@id='ddlstate']")));
		selectDropdown3.selectByVisibleText(stateNew);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, " Please select a gstin");
		Thread.sleep(3000);
		Select selectDropdown4 = new Select(driver.findElement(By.xpath("//select[@id='ddlgstin']")));
		selectDropdown4.selectByVisibleText(gstinNew);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "Please select a bu");
		Thread.sleep(3000);
		Select selectDropdown5 = new Select(driver.findElement(By.xpath("//select[@id='ddlbu']")));
		selectDropdown5.selectByVisibleText(businessUnit);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "Please select a sbu");
		Thread.sleep(3000);
		Select selectDropdown6 = new Select(driver.findElement(By.xpath("//select[@id='ddlsbu']")));
		selectDropdown6.selectByVisibleText(subBusinessUnitName);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "Please select a location");
		Thread.sleep(3000);
		Select selectDropdown7 = new Select(driver.findElement(By.xpath("//select[@id='ddllocation']")));
		selectDropdown7.selectByVisibleText(locatName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Data saved successfully.");
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Search saved data
		searchData.sendKeys("ankit11\n");
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Asn Mstr_2: try to assign a new role to already assigned loginid with same roles
		addNewButton.click();
		Thread.sleep(3000);
		Select selectDropdown8 = new Select(driver.findElement(By.xpath("//select[@id='ddluserloginid']")));
		selectDropdown8.selectByVisibleText(userLoginId);
		Thread.sleep(4000);
		Select selectDropdown9 = new Select(driver.findElement(By.xpath("//select[@id='ddlcompany']")));
		selectDropdown9.selectByVisibleText(companyName);
		Thread.sleep(4000);
		Select selectDropdown10 = new Select(driver.findElement(By.xpath("//select[@id='ddlstate']")));
		selectDropdown10.selectByVisibleText(stateNew);
		Thread.sleep(4000);
		Select selectDropdown11 = new Select(driver.findElement(By.xpath("//select[@id='ddlgstin']")));
		selectDropdown11.selectByVisibleText(gstinNew);
		Thread.sleep(4000);
		Thread.sleep(3000);
		Select selectDropdown12 = new Select(driver.findElement(By.xpath("//select[@id='ddlbu']")));
		selectDropdown12.selectByVisibleText(businessUnit);
		Thread.sleep(4000);
		Select selectDropdown13 = new Select(driver.findElement(By.xpath("//select[@id='ddlsbu']")));
		selectDropdown13.selectByVisibleText(subBusinessUnitName);
		Thread.sleep(4000);
		Select selectDropdown14 = new Select(driver.findElement(By.xpath("//select[@id='ddllocation']")));
		selectDropdown14.selectByVisibleText(locatName);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "Data already exists.");
		Thread.sleep(3000);
		System.out.println("Data already exists");
		closePopupButton.click();
		Thread.sleep(2000);
		cancelButton.click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		//Asn Mstr_3: try to assign same new roles to different loginids
		addNewButton.click();
		Thread.sleep(3000);
		Select selectDropdown15 = new Select(driver.findElement(By.xpath("//select[@id='ddluserloginid']")));
		selectDropdown15.selectByVisibleText("Admin1");
		Thread.sleep(4000);
		Select selectDropdown16 = new Select(driver.findElement(By.xpath("//select[@id='ddlcompany']")));
		selectDropdown16.selectByVisibleText(companyName);
		Thread.sleep(4000);
		Select selectDropdown17 = new Select(driver.findElement(By.xpath("//select[@id='ddlstate']")));
		selectDropdown17.selectByVisibleText(stateNew);
		Thread.sleep(4000);
		Select selectDropdown18 = new Select(driver.findElement(By.xpath("//select[@id='ddlgstin']")));
		selectDropdown18.selectByVisibleText(gstinNew);
		Thread.sleep(4000);
		Select selectDropdown19 = new Select(driver.findElement(By.xpath("//select[@id='ddlbu']")));
		selectDropdown19.selectByVisibleText(businessUnit);
		Thread.sleep(4000);
		Select selectDropdown20 = new Select(driver.findElement(By.xpath("//select[@id='ddlsbu']")));
		selectDropdown20.selectByVisibleText(subBusinessUnitName);
		Thread.sleep(4000);
		Select selectDropdown21 = new Select(driver.findElement(By.xpath("//select[@id='ddllocation']")));
		selectDropdown21.selectByVisibleText(locatName);
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Data saved successfully.");
		Thread.sleep(4000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		//Search saved data
		searchData.sendKeys("Admin1\n");
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		//Asn Mstr_4: Try to update field
		//try to edit and update
                        editIconForUpdateUserRole.click();
						Thread.sleep(4000);
						okButtonForPopup.click();
						Thread.sleep(3000);
						Select selectDropdown22 = new Select(driver.findElement(By.xpath("//select[@id='ddluserloginid']")));
						selectDropdown22.selectByVisibleText(userLoginId);
						Thread.sleep(4000);
						saveButton.click();
						Thread.sleep(3000);
						Assert.assertTrue(true, "Data updated successfully.");
						Thread.sleep(1000);
						closePopupButton.click();
						Thread.sleep(4000);
						System.out.println("Data successfully updated");
						driver.navigate().refresh();
						Thread.sleep(5000);
							//Search for updated data
								searchData.sendKeys("ankit11\n");
								Thread.sleep(3000);
								driver.navigate().refresh();
								Thread.sleep(5000);
	}
	public void addCustomerMaster(String companyName,String natureOfCustomer,String gstinNew,String customerName,String taxpayerCategory,
			String mobileNumber,String emailId,String pinCod,String stateNew) throws Exception {
		addNewButton.click();
		Thread.sleep(4000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a company");
		Thread.sleep(3000);
		Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='ddlComapnyList']")));
		selectDropdown.selectByVisibleText(companyName);
		Thread.sleep(3000);
		saveButton.click();
		Assert.assertTrue(true, "Please select Nature Of Customer");
		Select selectDropdown1 = new Select(driver.findElement(By.xpath("//select[@id='natureofcustomer']")));
		selectDropdown1.selectByVisibleText(natureOfCustomer);
		Thread.sleep(3000);
		saveButton.click();
		Assert.assertTrue(true, "Please select a state");
		Thread.sleep(3000);
		Select selectDropdown2 = new Select(driver.findElement(By.xpath("//select[@id='ddlstate']")));
		selectDropdown2.selectByVisibleText(stateNew);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		Assert.assertTrue(true, "This field is required.");
		Assert.assertTrue(true, "Pincode- Not available");
		Thread.sleep(3000);
		//Customer Master_05	Try to save with blank space in fields.
		enterCustomerName.sendKeys(customerName);
		Thread.sleep(2000);
		enterPinCode.sendKeys(pinCod);
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Pin Code- Invalid format");
		Thread.sleep(3000);
		enterPinCode.clear();
		Thread.sleep(2000);
		enterPinCode.sendKeys("123456");
		Thread.sleep(2000);
		//Customer Master_01 & 04	Try to input invalid format in Customer GSTIN
				enterCustomerGstin.sendKeys(gstinNew);
				Thread.sleep(2000);
				saveButton.click();
				Assert.assertTrue(true, "GSTIN should have valid Format");
				Thread.sleep(3000);
				enterCustomerGstin.clear();
				Thread.sleep(2000);
				enterCustomerGstin.sendKeys("04AAACP1272G1ZX");
				Thread.sleep(2000);
		Select selectDropdown3 = new Select(driver.findElement(By.xpath("//select[@id='taxpayer']")));
		selectDropdown3.selectByVisibleText(taxpayerCategory);
		Thread.sleep(3000);
		enterMobileNo.sendKeys(mobileNumber);
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Mobile No.- Invalid format");
		Thread.sleep(3000);
		enterMobileNo.clear();
		Thread.sleep(3000);
		enterMobileNo.sendKeys("9876767676");
		Thread.sleep(2000);
		emailId1.sendKeys(emailId);
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Email ID- Invalid format");
		Thread.sleep(3000);
		emailId1.clear();
		Thread.sleep(3000);
		emailId1.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		saveButton.click();
		Assert.assertTrue(true, "Data saved successfully");
		Thread.sleep(3000);
		System.out.println("Data saved successfully");
		closePopupButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
//Search saved data
		//Customer Master_12	Nature of customer selected as unregistered
		searchData.sendKeys("AllState\n");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		searchData.sendKeys("ALPHA\n");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Customer Master_07	Try to Update record with updated data
		//Customer Master_13	Nature of customer modified from unregistered to registered
		//Customer Master_14	Nature of customer modified from registered to unregistered
		editIconForUpdateCustomerMaster.click();
		Thread.sleep(4000);
		okButtonForPopup.click();
		Thread.sleep(3000);
		Select selectDropdown4 = new Select(driver.findElement(By.xpath("//select[@id='natureofcustomer']")));
		selectDropdown4.selectByVisibleText(natureOfCustomer);
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(true, "Data updated successfully.");
		Thread.sleep(1000);
		closePopupButton.click();
		Thread.sleep(4000);
		System.out.println("Data successfully updated");
		driver.navigate().refresh();
		Thread.sleep(5000);
			//Search for updated data
				searchData.sendKeys("B&M\n");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(5000);
		//Customer Master_08	Try to delete an existing record
				//selectCheckboxForDeleteCustomerMaster.click();
				//Thread.sleep(3000);
				editIconForDeleteCustomerMaster.click();
				Assert.assertTrue(true, "Are you sure you want to delete this?");
				Thread.sleep(2000);
				okButtonForPopup.click();
				Assert.assertTrue(true, "Data deleted successfully.");
				Thread.sleep(3000);
				closePopupButton.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				//Search the deleted data
				searchData.sendKeys("B&M\n");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(2000);
	}
	public void addSupplierMaster(String companyName,String natureOfSupplier,String gstinNew,String supplierName,String taxpayerCategory,
			String mobileNumber,String emailId,String pinCod,String stateNew) throws Exception {
		addNewButton.click();
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
	}
}