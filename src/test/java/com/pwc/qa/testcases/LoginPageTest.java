package com.pwc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.pages.HomePage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	String sheetName="login";
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}
	@DataProvider
	public Object[][] getPWCTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1,enabled=false)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "PwC EWB Solution");
	}
	@Test(priority=2,enabled=false)
	public void pwcLogoImageTest() {
		boolean flag = loginpage.validatePWCImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3,enabled=false)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=4, dataProvider="getPWCTestData")
	public void validateLoginTest(String userName, String password) {
		homepage=loginpage.login(userName, password);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}