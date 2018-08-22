package com.pwc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pwc.qa.base.TestBase;

public class DataPage extends TestBase {
	
	@FindBy(id="upload_data_btn")
	WebElement uploadDataButton;
	
	@FindBy(xpath="(//img[@alt='delete icon'])[1]")
	WebElement deleteButton;
	
	@FindBy(xpath="(//button[@type='button'])[8]")
	WebElement closeButton;
	
	@FindBy(xpath="//input[@id='dropdownMenu5']")
	WebElement browseButton;
	
	//Initializing the Page Objects
	public DataPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyValidationMessage(String dropdownMenu1) {
		Select selectDropdown = new Select(driver.findElement(By.id("dropdownMenu1")));
		selectDropdown.selectByVisibleText(dropdownMenu1);
		uploadDataButton.click();
	}
	public void uploadFile() throws IOException, Exception {
		
		browseButton.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\AutoTest\\Newfile.exe");
		Thread.sleep(3000);
		uploadDataButton.click();
		Thread.sleep(5000);
	}
	

}