package com.lzf.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This is to verify testng annotation execute 
 * @author H
 *
 */

public class testngTest {
	
	private int a;
	
	@BeforeMethod(alwaysRun=true)
	public void beforemethod()
	{
		a=2;
		System.out.println("This is beforeMethod,value is :"+a);
	}

	@BeforeClass
	public void beforeclass()
	{
		a=1;
		System.out.println("This is beforeClass,value is :"+a);
	}
	
	@Test(groups="testngTest")
	public void testexsample1()
	{
		a=3;
		System.out.println("This is testexsample1,value is :"+a);
	}
	
	@Test(groups="testngTest")
	public void testexsample2()
	{
		a=4;
		System.out.println("This is testexsample2,value is :"+a);
	}
	
	@AfterClass
	public void afterclass()
	{
		a=5;
		System.out.println("This is afterclass,value is :"+a);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		a=6;
		System.out.println("This is aftermethod,value is :"+a);
	}


}
