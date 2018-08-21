package com.pwc.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pwc.qa.base.TestBase;

public class Runner extends TestBase {
	public static void loadTest(String myval) {
				 
		
		JavascriptExecutor js =((JavascriptExecutor) driver); 
	    Object val = js.executeScript("" +
	            "try{window.performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {};" +
	            "return(parseInt(window.performance.timing.domContentLoadedEventEnd)-parseInt(window.performance.timing.navigationStart));}catch(e){alert(e);}");
	    long seconds = TimeUnit.MILLISECONDS.toSeconds((Long) val);
	    long minutes = TimeUnit.MILLISECONDS.toMinutes((Long) val);
	    
	    System.out.println(myval+ " Page load time in sec is: "+seconds+"sec");
	    System.out.println( myval+" Page load time in ms is: "+val.toString()+"ms");
	    System.out.println("======================================================");
	    
		
	}

}
