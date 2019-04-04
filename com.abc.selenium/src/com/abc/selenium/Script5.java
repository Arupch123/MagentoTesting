package com.abc.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Script5 
{
     static WebDriver driver;
     @BeforeMethod
     public void  beforeMethod()
     {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.get("https://magento.com");
    	 
     }
     @AfterMethod
     public void afterMethod()
     {
    	 driver.quit();
     }
     @Parameters({"username","password"})
     @Test
     public void validLogin(String un,String pwd)
     {
    	 driver.findElement(By.linkText("My Account")).click();
    	 driver.findElement(By.id("email")).sendKeys(un);
    	 driver.findElement(By.id("pass")).sendKeys(pwd);
    	 driver.findElement(By.id("send2")).click();
    	 driver.findElement(By.linkText("Log Out")).click();	 
     }
     
}
