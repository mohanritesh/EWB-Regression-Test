package com.pwc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pwc.qa.base.TestBase;

public class DataPage extends TestBase {
	
	//@FindBy(xpath="//h2[contains(text(),'Status of uploaded data ')]")
	//WebElement dataPageLabel;
	
	//@FindBy(xpath="")
	//WebElement browseButton;
	
	@FindBy(id="upload_data_btn")
	WebElement uploadDataButton;
	
	//Initializing the Page Objects
	public DataPage() {
		PageFactory.initElements(driver, this);
	}
	
	//public boolean verifyDataPageLabel() {
		//return dataPageLabel.isDisplayed();
	//}
	
	
	public void uploadNewData(String dropdownMenu1) {
		Select selectDropdown = new Select(driver.findElement(By.id("dropdownMenu1")));
		selectDropdown.selectByVisibleText(dropdownMenu1);
		uploadDataButton.click();
	}
	

}