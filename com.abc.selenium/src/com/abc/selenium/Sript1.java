package com.abc.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sript1 {
	@BeforeClass
	public void beforeClass() 
	{
      System.out.println("before class method executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class method executed");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method executed");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method executed");
	}
	@Test
	public void test1()
	{
		System.out.println("test1 method executed");
	}
	@Test
	public void test2()
	{
		System.out.println("test2 method executed");
	}
}
