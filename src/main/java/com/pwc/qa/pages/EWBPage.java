package com.pwc.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.pwc.qa.base.TestBase;
public class EWBPage extends TestBase {
	@FindBy(id = "btnapply")
	WebElement applyButton;

	@FindBy(className = "bootbox-body")
	WebElement poupupText;

	@FindBy(id = "idlogout")
	WebElement logoutButton;

	@FindBy(xpath = "(/html/body/div[5]/div/div/div[3]/button[2]")
	WebElement logoutConfirm;
	
//  Eway Bill Generation
	public void GenerateEwayBill() throws InterruptedException {

		WebElement ele = null;
		// Thread.sleep(PWCConstant.TESTING_THREAD_SLEEP_LONG);

		// Thread.sleep(PWCConstant.TESTING_THREAD_SLEEP_LONG);
		String beforeXpath = "//*[@id=\"table1\"]/tbody/tr[";
		String afterXpath = "]/td[5]";
		for (int i = 2; i < 3; i++) {
			String name = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			// System.out.println(name);
			// if (name.contains("IN924")) {
			driver.findElement(By.xpath(
					"//*[@id='table1_wrapper']/div[4]/div[3]/div[2]/div/table/tbody/tr[" + i + "]/td[1]/input[1]"))
					.click();
			Select selectDropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlOperation']")));
			selectDropdown.selectByIndex(0);

			// applyButton.click();
			driver.findElement(By.xpath(".//*[@id='btnapply']")).click();
			// Thread.sleep(3000);
			String val = driver.findElement(By.className("bootbox-body")).getText();
			//System.out.println(val);

			// poupupText.getText();
			// Thread.sleep(PWCConstant.TESTING_THREAD_SLEEP_MEDIUM);
			// System.out.println(poupupText.getText());
			driver.navigate().refresh();
			// logoutButton.click();
			// Thread.sleep(10000);
			// logoutConfirm.click();
			driver.findElement(By.id("idlogout")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();

			// }
			break;
		}
		// driver.close();

	}
//Checking Excluded file retain or not
	public void CheckExcludedFileRetain() throws InterruptedException {

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
			driver.findElement(By.xpath(".//*[@id='txtRemarks']")).sendKeys("test remarks");
			driver.findElement(By.xpath(".//*[@id='btndone']")).click();
			String val = driver.findElement(By.className("bootbox-body")).getText();
			System.out.println(val);

			driver.navigate().refresh();

			ArrayList<String> tmpList1 = new ArrayList<String>();
			for (int j = 1; j < 10; j++) {
				String docNo1 = driver.findElement(By.xpath(beforeXpath + j + afterXpath)).getText();
				
				tmpList1.add(docNo1);
			}
			
			/*if (tmpList1.contains(docno)) {
				System.out.println(" File Exist Test Case Failed");
			} else {
				System.out.println("File Excluded Test case Passed");
			}

			System.out.println(tmpList1.toString());*/
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
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

			/*Select selectDropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='dropdownResionExclude']")));
			selectDropdown1.selectByIndex(2);*/
			//driver.findElement(By.xpath(".//*[@id='txtRemarks']")).sendKeys("test remarks");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='btndone']")).click();
			Thread.sleep(3000);
			String val = driver.findElement(By.xpath(".//*[@id='IdspanResionExclude']")).getText();
			System.out.println(val);

			driver.navigate().refresh();

			
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	}
		//Cancel Exclusion without reason
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
			driver.findElement(By.xpath("//*[@id='btnExcludeReset']")).click();
			/*driver.findElement(By.xpath(".//*[@id='btndone']")).click();
			String val = driver.findElement(By.className("bootbox-body")).getText();
			System.out.println(val);*/

			driver.navigate().refresh();

			
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	
	}
	
	//Cancel Exclusion After selecting reason
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
			driver.findElement(By.xpath("//*[@id='btnExcludeReset']")).click();
			/*driver.findElement(By.xpath(".//*[@id='btndone']")).click();
			String val = driver.findElement(By.className("bootbox-body")).getText();
			System.out.println(val);*/

			driver.navigate().refresh();

			
			break;
		}
		driver.findElement(By.id("idlogout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	
	
		
	}

}
