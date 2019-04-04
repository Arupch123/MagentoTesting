package com.abc.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script4
{
        @BeforeTest
        public void beforetest()
        {
        	System.out.println("before test executed");
        }
        @AfterTest
        public void aftertest()
        {
        	System.out.println("after test executed");
        }
        @BeforeClass
        public void beforeclass()
        {
        	System.out.println("before class executed");
        }
        @AfterClass
        public void afterclass()
        {
        	System.out.println("after class executed");
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
        	System.out.println(" test1 executed");
        }
        @Test
        public void test2()
        {
        	System.out.println(" test2 executed");
        }
 
}