package load;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Request_Response {
	
	@Test
	public void test() {
		
		//Get request calculate response time
		
       System.setProperty("webdriver.chrome.driver", "D:\\Rajneesh\\Software\\Selenium_Drivers\\Chrome_\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://preprod.ewb-aws.pwc.co.in/web1/");
		
		
		/*
		// get the  page load time
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
		    "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		
		System.out.println(driver.getTitle());
	*/
		
		long startTime = System.currentTimeMillis();

		driver.get("http://preprod.ewb-aws.pwc.co.in/web1/");
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("Calculate")));

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;

		System.out.println("Total Page Load Time: " + totalTime + "milliseconds");
	
	}

}
