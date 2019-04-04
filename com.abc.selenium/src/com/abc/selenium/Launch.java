package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {

	@Test
	public void positiveCrea1()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.magento.com");
	WebElement myacct=driver.findElement(By.linkText("My Account"));
	myacct.click();
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("vineetanand61@gmail.com");
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("Welcome123");
	WebElement login=driver.findElement(By.id("send2"));
	login.click();

	
	
	}

}
