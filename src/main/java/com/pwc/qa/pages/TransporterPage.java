package com.pwc.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.util.TestUtil;

public class TransporterPage extends TestBase {
	@FindBy(xpath = ".//*[@id='transporter_updatevehicle']/span/span")
	WebElement updatevehicle;
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]/button")
	WebElement transMode;
	@FindBy(xpath = "//*[@id=\"vehicle_typeOverDim\"]")
	WebElement vehicleType;
	@FindBy(name = "from_place")
	WebElement vehPlace;

	@FindBy(xpath = "//*[@id=\"ddlState\"]")
	WebElement vehState;

	// update-reason
	@FindBy(xpath = "//*[@id=\"ddlReason\"]")
	WebElement updateReason;

	@FindBy(xpath = "//*[@id=\"btnVehicleUpdateSubmit\"]")
	WebElement update_submit;

	@FindBy(xpath = ".//*[@id='refereshtable']")
	WebElement refreshButton;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/button")
	WebElement move_status;

	@FindBy(id = "txtplace")
	WebElement txtplace;

	@FindBy(id = "txtremarks")
	WebElement txtremarks;

	@FindBy(xpath = "//*[@id=\"btnsubmitupdatemovement\"]")
	WebElement updateMovementButton;

	@FindBy(xpath = "//*[@id=\"transporter_updatemovement\"]")
	WebElement updateMovement;
	@FindBy(id = ".//*[@id='idlogout']")
	WebElement logOut;

	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[2]")
	WebElement logoutYes;

	@FindBy(linkText = "Yes")
	WebElement logoutConfirm;

	public void UpdateVehicleTransporter() {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[3]";
		ArrayList<String> tmpList = new ArrayList<String>();
		try {
			for (int i = 1; i < 100; i++) {
				String initial_status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
						.getText();
				if (initial_status.equals("Generated")) {
					String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();

					driver.findElement(By.xpath("//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[1]/input[1]")).click();

					driver.findElement(By.xpath(".//*[@id='transporter_updatevehicle']/span/span")).click();
					Thread.sleep(3000);
					System.out.println("entered4");
					driver.findElement(By.xpath(".//*[@id='excludePopup2']/div[1]/div[2]/div[1]/button")).click();
					Thread.sleep(10000);
					driver.findElement(By.xpath(".//*[@id='vehicle_typeOverDim']")).click();
					driver.findElement(By.xpath(".//*[@id='from_place']")).clear();
					driver.findElement(By.xpath(".//*[@id='from_place']")).sendKeys("Trivandrum");
					Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='ddlState']")));
					sel1.selectByValue("32");
					Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='ddlReason']")));
					sel2.selectByValue("1");
					driver.findElement(By.xpath(".//*[@id='btnVehicleUpdateSubmit']")).click();
					Thread.sleep(10000);
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					driver.navigate().refresh();
					tmpList.add(name);
					Thread.sleep(3000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
							.getText();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					if (status1.equals("Sent For vehicle update")) {
						for (int j = 0; j < 30; j++) {
							driver.findElement(By.xpath(".//*[@id='refereshtable']")).click();
							String stat2 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
									.getText();
							if (!stat2.equals("Sent For vehicle update")) {
								break;
							}
						}
						String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
								.getText();
						TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						Assert.assertEquals(status, "Vehicle Updated");

					}
					break;
				}
			}
		} catch (Exception e) {
		}

	}

	public void UpdateMovementTransporter() {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[3]";
		try {
			ArrayList<String> tmpList = new ArrayList<String>();
			for (int i = 1; i < 100; i++) {
				String initial_status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
						.getText();
				if (initial_status.equals("Generated")) {
					String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();

					driver.findElement(By.xpath("//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[1]/input[1]")).click();
					driver.findElement(By.xpath(".//*[@id='transporter_updatemovement']/span/span")).click();
					Thread.sleep(3000);

					driver.findElement(By.xpath(".//*[@id='excludePopup']/div[1]/div/div[1]/button")).click();
					Thread.sleep(10000);
					driver.findElement(By.xpath(".//*[@id='txtplace']")).clear();
					driver.findElement(By.xpath(".//*[@id='txtplace']")).sendKeys("Kochi");
					driver.findElement(By.xpath(".//*[@id='txtremarks']")).clear();
					driver.findElement(By.xpath(".//*[@id='txtremarks']")).sendKeys("Not yet started");

					driver.findElement(By.xpath(".//*[@id='btnsubmitupdatemovement']")).click();
					Thread.sleep(3000);
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					driver.navigate().refresh();
					tmpList.add(name);
					Thread.sleep(3000);
					String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
							.getText();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					Assert.assertEquals(status, "Generated");
					break;
				}
			}
		} catch (Exception c) {
		}
	}

}
