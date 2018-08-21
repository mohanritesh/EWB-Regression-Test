package com.pwc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	//Page Factory - OR
	@FindBy(name="user_loginid")
	WebElement user_loginid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@alt='pwc logo']")
	WebElement pwcLogo;
	
	//we have to initialize all the above object repositories : will create the constructor of the class "LoginPage"
	public LoginPage() {
		
		PageFactory.initElements(driver, this); //this means current class object
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validatePWCImage() {
		return pwcLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd) {
		try {
		user_loginid.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(3000);
		//TestUtil.takeScreenshot(driver,TestUtil.PROJECT_NAME);
		return new HomePage();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void validateuserlogin() {
		
	}
	
	
	
	
	
	
	
	
	
	

}
