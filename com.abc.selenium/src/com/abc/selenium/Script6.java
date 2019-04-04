package com.abc.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Script6
{
      static WebDriver driver;
      @Parameters({"browser"})
      @BeforeMethod
      public void beforeMethod(String browser)
      {
    	  if(browser.equalsIgnoreCase("chrome"))
    	  {
    		  driver=new ChromeDriver();
    		  driver.manage().window().maximize();
    	  }
    	  else
    	  {
    		  
    		  driver=new InternetExplorerDriver();
    	  }
      }
      @Test
      public void validLogin()
      {
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  driver.get("https://magento.com");
    	  driver.findElement(By.linkText("My Account")).click();
    	  driver.findElement(By.id("email")).sendKeys("vineetanand61@gmail.com");
    	  driver.findElement(By.id("pass")).sendKeys("Welcome123");
    	  driver.findElement(By.id("send2")).click();
    	  driver.findElement(By.linkText("Log Out")).click();
      }	
}
