package com.pwc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.qa.base.TestBase;

public class AdminPage extends TestBase {
	
	@FindBy(id="addnew")
	WebElement addNewButton;
	
	@FindBy(id="company_pan")
	WebElement companyPAN;
	
	@FindBy(id="company_name")
	WebElement companyName;
	
	@FindBy(id="btn_save")
	WebElement saveButton;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement closeMessage;
	
	//Initializing the Page Objects
		public AdminPage() {
			PageFactory.initElements(driver, this);
		}
	
	public void addNewCompany(String comppan, String compname) {
		addNewButton.click();
		companyPAN.sendKeys(comppan);
		companyName.sendKeys(compname);
		saveButton.click();
		closeMessage.click();
	}
	

}