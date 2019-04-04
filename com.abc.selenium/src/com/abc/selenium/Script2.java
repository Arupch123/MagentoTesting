package com.abc.selenium;

import org.testng.annotations.Test;

public class Script2 
{
    @Test
    public void z_method()
    {
    	System.out.println("z method executed");
    }
    @Test(priority=2)
    public void d_method()
    {
    	System.out.println("d method executed");
    }
    @Test(priority=45)
    public void b_method()
    {
    	System.out.println("b method executed");
    }
    @Test
    public void a_method()
    {
    	System.out.println("a method executed");
    }
}
