package com.lzf.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr =new FirefoxDriver();
		//the timeout 
		dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		dr.get("https:/www.baidu.com/");
		
		//定位对象超时,10s找不到就抛出异常
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//java的休眠，需与异常处理一起
		try {Thread.sleep(2000);}catch(InterruptedException e) {e.printStackTrace();}
		
		WebElement input = dr.findElement(By.id("kw"));
		//send keys "selenium"
		input.sendKeys("seleniumm");
		//delete the last word
		input.sendKeys(Keys.BACK_SPACE);
		//send space+"教程"
		input.sendKeys(Keys.SPACE);
		input.sendKeys("教程");
		//ctrl+a
		input.sendKeys(Keys.CONTROL,"a");
		//ctrl+c
		input.sendKeys(Keys.CONTROL,"c");
		//ctrl+v
		input.sendKeys(Keys.CONTROL,"v");
		//enter
		input.sendKeys(Keys.ENTER);
		
		System.out.println("The page is:"+dr.getTitle());
		System.out.println("The url is :"+dr.getCurrentUrl());
		
		//异步脚本超时时间3s
		dr.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		dr.quit();
		

	}

}
