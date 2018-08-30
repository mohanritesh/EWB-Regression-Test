package com.pwc.qa.pages;

import java.util.*;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openxml4j.samples.GetThumbnails;
import org.testng.Assert;

import com.pwc.qa.base.TestBase;
import com.pwc.qa.util.TestUtil;

import jxl.write.DateTime;

public class EWBPage extends TestBase {
	@FindBy(xpath = "//img[@alt='pwc logo']")
	WebElement pwcLogo;

	@FindBy(id = "btnapply")
	WebElement applyButton;

	@FindBy(xpath = "//*[@id=\\\"table1\\\"]/tbody/tr[")
	WebElement beforeXpath;

	@FindBy(xpath = ".//*[@id='idreferece']")
	WebElement gridRefresh;

	@FindBy(xpath = "]/td[5]")
	WebElement afterXpath;

	@FindBy(xpath = "//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[\" + i + \"]/td[1]/input[1]")
	WebElement checkBoxInput;

	@FindBy(className = "bootbox-body")
	WebElement poupupText;

	@FindBy(xpath = ".//*[@id='txtRemarks']")
	WebElement excludePopupReason;

	@FindBy(xpath = ".//*[@id='dropdownResionExclude']")
	WebElement excludePopupRemarks;

	@FindBy(xpath = ".//*[@id='btndone']")
	WebElement excludePopupSubmit;

	@FindBy(id = "idlogout")
	WebElement logoutButton;

	@FindBy(xpath = "(/html/body/div[5]/div/div/div[3]/button[2]")
	WebElement logoutConfirm;

	@FindBy(className = "dataTables_info")
	WebElement text;

	@FindBy(xpath = ".//*[@id='ddlOperation']")
	WebElement allEwbdropdown;

	@FindBy(xpath = ".//*[@id='btnapply']")
	WebElement applyButtonX;

	@FindBy(xpath = "//*[@id=\"ddlReasonCancel\"]")
	WebElement cancelReason;

	@FindBy(id = "nic_remark")
	WebElement cancelRemark;

	@FindBy(xpath = "//*[@id=\"btnCancelEwbSubmit\"]")
	WebElement cancelSubmit;

	@FindBy(xpath = ".//*[@id='refereshtable']")
	WebElement refreshButton;

	// Transport Mode:Road
	@FindBy(xpath = "/html/body/div[1]/div/div[7]/div/div/div[2]/div/div[1]/div[2]/div[1]/button")
	WebElement transMode;

	// Vehicle Type
	@FindBy(xpath = "//*[@id=\"vehicle_typeOverDim\"]")
	WebElement vehicleType;

	//
	@FindBy(name = "from_place")
	WebElement vehPlace;

	@FindBy(xpath = "//*[@id=\"ddlState\"]")
	WebElement vehState;

	// update-reason
	@FindBy(xpath = "//*[@id=\"ddlReason\"]")
	WebElement updateReason;

	@FindBy(xpath = "//*[@id=\"btnVehicleUpdateSubmit\"]")
	WebElement update_submit;

	@FindBy(xpath = "//*[@id=\"span_from_place\"]")
	WebElement blank_vallidation;

	@FindBy(id = "vehicle_no")
	WebElement vehicle_no;

	@FindBy(id = "transportation_document_no")
	WebElement transportation_document_no;

	@FindBy(id = "transportation_document_date")
	WebElement transportation_document_date;

	@FindBy(xpath = "/html/body/div[1]/div/div[8]/div/div/div[2]/div/div[1]/div/div[1]/button")
	WebElement move_status;

	@FindBy(id = "txtplace")
	WebElement txtplace;

	@FindBy(id = "txtremarks")
	WebElement txtremarks;

	@FindBy(xpath = "//*[@id=\"btnsubmitupdatemovement\"]")
	WebElement updateMovementButton;

	@FindBy(id = "txt_reject")
	WebElement txt_reject;

	@FindBy(xpath = "//*[@id=\"btnSubmitReject\"]")
	WebElement cpReject_submit;

	// Eway Bill Generation
	public void GenerateEwayBill() throws InterruptedException {

		WebElement ele = null;

		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 1; i < 3; i++) {
			String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			driver.findElement(By.xpath(
					"//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i + "]/td[1]/input[1]"))
					.click();
			Select selectDropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlOperation']")));
			selectDropdown.selectByIndex(0);
			driver.findElement(By.xpath(".//*[@id='btnapply']")).click();
			String val = driver.findElement(By.className("bootbox-body")).getText();
			driver.navigate().refresh();
			Thread.sleep(5000);
			String genStatus = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[9]")).getText();
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
			driver.findElement(By.id("idlogout")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
			Thread.sleep(4000);
			Assert.assertEquals(genStatus, "Initiated");
			break;
		}
	}

	// Checking Excluded file retain or not
	public void CheckExcludedFileRetain() throws InterruptedException {

		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 1; i < 2; i++) {
			String docno = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			checkBoxInput.click();
			Select selectDropdown = new Select(allEwbdropdown);
			selectDropdown.selectByIndex(3);
			applyButtonX.click();
			Select selectDropdown1 = new Select(excludePopupRemarks);
			selectDropdown1.selectByIndex(2);
			excludePopupReason.sendKeys("test remarks");
			excludePopupSubmit.click();
			String val = poupupText.getText();
			driver.navigate().refresh();
			Thread.sleep(5000);
			gridRefresh.click();
			ArrayList<String> tmpList1 = new ArrayList<String>();
			for (int j = 1; j < 10; j++) {
				String docNo1 = driver.findElement(By.xpath(beforeXpath + j + afterXpath)).getText();
				tmpList1.add(docNo1);
			}
			Assert.assertFalse(tmpList1.contains(docno));
			driver.navigate().refresh();
			Thread.sleep(5000);
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
		}
	}

	// Excluding Without Reason
	public void ExcludeWithoutReason() throws InterruptedException {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 1; i < 3; i++) {
			String docno = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();

			driver.findElement(By.xpath(
					"//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i + "]/td[1]/input[1]"))
					.click();
			Select selectDropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlOperation']")));
			selectDropdown.selectByIndex(3);

			driver.findElement(By.xpath(".//*[@id='btnapply']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='btndone']")).click();
			Thread.sleep(3000);
			String val = driver.findElement(By.xpath(".//*[@id='IdspanResionExclude']")).getText();
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
			driver.navigate().refresh();
			boolean LogoStatus = pwcLogo.isDisplayed();
			Assert.assertEquals(LogoStatus, true);
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	}

	// Cancel Exclusion without reason
	public void CancelExclusionWithoutReason() throws InterruptedException {

		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 1; i < 3; i++) {
			String docno = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();

			driver.findElement(By.xpath(
					"//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i + "]/td[1]/input[1]"))
					.click();
			Select selectDropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlOperation']")));
			selectDropdown.selectByIndex(3);
			driver.findElement(By.xpath(".//*[@id='btnapply']")).click();
			driver.findElement(By.xpath(".//*[@id='txtRemarks']")).sendKeys("test remarks");
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
			driver.findElement(By.xpath("//*[@id='btnExcludeReset']")).click();
			driver.navigate().refresh();
			boolean LogoStatus = pwcLogo.isDisplayed();
			Assert.assertEquals(LogoStatus, true);
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	}

	// Cancel Exclusion After selecting reason
	public void CancelExclusionAfterSelectReason() throws InterruptedException {

		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 1; i < 3; i++) {
			String docno = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();

			driver.findElement(By.xpath(
					"//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i + "]/td[1]/input[1]"))
					.click();
			Select selectDropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlOperation']")));
			selectDropdown.selectByIndex(3);

			driver.findElement(By.xpath(".//*[@id='btnapply']")).click();

			Select selectDropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='dropdownResionExclude']")));
			selectDropdown1.selectByIndex(2);
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
			driver.findElement(By.xpath("//*[@id='btnExcludeReset']")).click();
			driver.navigate().refresh();
			boolean LogoStatus = pwcLogo.isDisplayed();
			Assert.assertEquals(LogoStatus, true);
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	}

	public EWBPage() {
		PageFactory.initElements(driver, this);
	}

	public void loadAllEwbPage() {
		try {
			Thread.sleep(10000);
			String text_data = text.getText();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
			Assert.assertTrue(text_data.contains("Showing"));
		} catch (Exception e) {
		}
	}

	public void cancelEwb() {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[3]";

		ArrayList<String> temp1 = new ArrayList<String>();
		try {
			for (int i = 1; i < 100; i++) {

				String initial_status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
						.getText();
				System.out.println(initial_status);
				if (initial_status.equals("Generated")) {
					String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
					driver.findElement(By.xpath("//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[1]/input[1]")).click();
					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("cancel");
					applyButtonX.click();
					Thread.sleep(3000);
					Select sel2 = new Select(cancelReason);
					sel2.selectByValue("3");
					cancelRemark.sendKeys("Test Remarks");
					cancelSubmit.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					temp1.add(name);
					Thread.sleep(30000);
					Thread.sleep(3000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
							.getText();
					System.out.println(status1);
					if (status1.equals("Sent for cancellation")) {

						/*
						 * long start_time = System.currentTimeMillis(); long wait_time = 300000; //5
						 * MIN long end_time = start_time + wait_time;
						 * 
						 * while (System.currentTimeMillis() < end_time) {
						 */

						for (int j = 0; j < 30; j++) {
							refreshButton.click();
							String stat = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
									.getText();
							if (!stat.equals("Sent for cancellation")) {
								break;
							}
						}
						// break;
						// }
						String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
								.getText();
						System.out.println(status);
						TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						Assert.assertEquals(status, "Cancelled");

						if (status.equals("Cancelled")) {
							TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						} else {
							TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						}
					}
					break;
				}

			}
		} catch (Exception e) {
		}
	}

	public void UpdateVehicle() {

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

					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("update-vehicle");
					applyButtonX.click();
					Thread.sleep(3000);
					transMode.click();
					Thread.sleep(10000);
					vehicleType.click();
					vehPlace.clear();
					vehPlace.sendKeys("Trivandrum");
					Select sel1 = new Select(vehState);
					sel1.selectByValue("32");
					Select sel2 = new Select(updateReason);
					sel2.selectByValue("1");
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					update_submit.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					tmpList.add(name);
					Thread.sleep(3000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
							.getText();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);

					if (status1.equals("Sent For vehicle update")) {
						for (int j = 0; j < 30; j++) {
							refreshButton.click();

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

	public void UpdateVechBlank() {

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

					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("update-vehicle");
					applyButtonX.click();
					Thread.sleep(3000);
					transMode.click();
					update_submit.click();
					Thread.sleep(3000);
					String validation = blank_vallidation.getText();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					Assert.assertEquals(validation, "Please enter place of change");
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	public void UpdateVechInvalidValues() {

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
					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("update-vehicle");
					applyButtonX.click();
					Thread.sleep(3000);
					transMode.click();
					Thread.sleep(10000);
					vehicleType.click();
					vehPlace.clear();
					vehPlace.sendKeys("123456");
					vehicle_no.clear();
					vehicle_no.sendKeys("qwerty");
					Select sel1 = new Select(vehState);
					sel1.selectByValue("32");
					Select sel2 = new Select(updateReason);
					sel2.selectByValue("1");
					transportation_document_no.clear();
					transportation_document_no.sendKeys("qwerty");
					transportation_document_date.clear();
					transportation_document_date.click();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					update_submit.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					tmpList.add(name);
					Thread.sleep(3000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
							.getText();
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					if (status1.equals("Sent For vehicle update")) {
						for (int j = 0; j < 30; j++) {
							refreshButton.click();

							String stat2 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
									.getText();
							if (!stat2.equals("Sent For vehicle update")) {
								break;
							}
						}
						String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
								.getText();
						TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						// Status : Vehicle Updation Failed, Invalid Vehicle Number Format
						Assert.assertEquals(status, "Vehicle Updation Failed, Inval.....Read More...");
					} else {

						Assert.assertEquals(status1, "Vehicle Updation Failed, Inval.....Read More...");

					}
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	public void UpdateMovement() {
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
					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("update-movement");
					applyButtonX.click();
					Thread.sleep(3000);
					move_status.click();
					Thread.sleep(10000);
					txtplace.clear();
					txtplace.sendKeys("Trivandrum");
					txtremarks.clear();
					txtremarks.sendKeys("not yet started");
					updateMovementButton.click();
					driver.navigate().refresh();
					tmpList.add(name);
					Thread.sleep(5000);
					String status_movement = driver
							.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]")).getText();

					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("window.scrollBy(0,250)", "");
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					Assert.assertEquals(status_movement, "Generated");

				}
				break;
			}
		} catch (Exception c) {
		}
	}

	public void AllEwbCpReject() {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[3]";

		ArrayList<String> temp1 = new ArrayList<String>();
		try {
			for (int i = 1; i < 100; i++) {

				String initial_status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
						.getText();
				System.out.println(initial_status);
				if (initial_status.isEmpty()) {
					String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
					driver.findElement(By.xpath("//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[1]/input[1]")).click();
					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("reject");
					applyButtonX.click();
					Thread.sleep(3000);
					txt_reject.clear();
					txt_reject.sendKeys("rejected");
					cpReject_submit.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					temp1.add(name);
					Thread.sleep(30000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[1]/td[8]")).getText();
					System.out.println(status1);
					if (status1.equals("Sent for rejection")) {
						for (int j = 0; j < 60; j++) {
							refreshButton.click();
							String stat = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[1]/td[8]"))
									.getText();
							System.out.println("count" + j);
							if (!stat.equals("Sent for rejection")) {
								break;
							}
						}
						String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[1]/td[8]")).getText();
						System.out.println(status);
						TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						Assert.assertEquals(status, "Rejected");
						if (status.equals("Rejected")) {
							TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						} else {
							TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						}
					} else {
						String status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[1]/td[8]")).getText();
						System.out.println(status);
						TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
						Assert.assertEquals(status, "Rejected");
					}
					break;
				}

			}
		} catch (Exception e) {
		}
	}

	public void AllEwbCpAccept() {
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[3]";

		ArrayList<String> temp1 = new ArrayList<String>();
		try {
			for (int i = 1; i < 100; i++) {

				String initial_status = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[" + i + "]/td[8]"))
						.getText();
				System.out.println(initial_status);
				if (initial_status.isEmpty()) {
					String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
					driver.findElement(By.xpath("//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[1]/input[1]")).click();
					Select sel = new Select(allEwbdropdown);
					sel.selectByValue("accept");
					applyButtonX.click();
					Thread.sleep(3000);
					txt_reject.clear();
					txt_reject.sendKeys("accepted");
					cpReject_submit.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					temp1.add(name);
					Thread.sleep(30000);
					Thread.sleep(3000);
					String status1 = driver.findElement(By.xpath(".//*[@id='table1']/tbody/tr[1]/td[8]")).getText();
					System.out.println(status1);
					TestUtil.takeScreenshot(driver, TestUtil.PROJECT_NAME);
					Assert.assertEquals(status1, "Accepted");
					break;
				}

			}
		} catch (Exception e) {
		}
	}

	public void CancelList() throws InterruptedException, ParseException {
		Thread.sleep(10000);

		// To locate table.
		WebElement mytable = driver
				.findElement(By.xpath(".//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody"));
		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		System.out.println("ROW COUNT : " + rows_count);

		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[4]";
		ArrayList<String> tmpList = new ArrayList<String>();
		for (int i = 1; i < rows_count; i++) {
			String date1 = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			System.out.println(date1);

			// Create object of SimpleDateFormat class and decide the format
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");

			// get current date time with Date()
			Date date = new Date();

			// Now format the date
			String date2 = dateFormat.format(date);

			// Print the Date
			System.out.println("Current date and time is " + date2);

			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");

			Date d1 = null;
			Date d2 = null;

			d1 = format.parse(date1);
			d2 = format.parse(date2);

			// in milliseconds
			long diff = d2.getTime() - d1.getTime();
			// System.out.print(diff + " diff ");
			double hours;
			double minutes;
			double seconds;
			seconds = diff / 1000;
			hours = seconds / (60 * 60);
			// minutes = seconds % ((60*60));
			System.out.print(hours + " hours ");
			if (hours < 24) {
				System.out.print(" Success ");
				Assert.assertTrue(true);
			}

		}

	}

}
