package com.pwc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pwc.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[text()='rajneesh ']")
	WebElement userNameLabel;
	
	@FindBy(xpath="(//a[contains(text(),'EWB')])[2]")
	WebElement ewbLink;
	
	@FindBy(xpath="(//a[contains(text(),'Data')])[2]")
	WebElement dataLink;
	
	@FindBy(xpath="(//li[2]/ul/li/a/span)[1]")
	WebElement dataUploadLink;
	
	@FindBy(xpath="(//a[contains(text(),'Report')])[2]")
	WebElement reportLink;
	
	@FindBy(xpath="(//a[contains(text(),'Dashboard')])[2]")
	WebElement dashboardLink;
	
	@FindBy(xpath="(//a[contains(text(),'Admin')])[2]")
	WebElement adminLink;
	
	@FindBy(linkText = "Company Setup")
	WebElement companySetupLink;
	
	@FindBy(xpath="//a[contains(text(),'Company')]")
	WebElement companyLink;
	
	//Initializing the page Objects
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
	public void clickOnCompanyLink() {
		Actions action = new Actions(driver);
		action.moveToElement(companySetupLink).moveToElement(companyLink).build().perform();
		companyLink.click();
	}
	
}