package com.lzf.TestNGDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchFrame {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin",  "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr =new FirefoxDriver();
		File file=new File("testPage/frame.html");
		String filepath =file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		
		dr.switchTo().frame("f1");//进入frame
		dr.findElement(By.id("kw")).sendKeys("frame");
		Thread.sleep(2000);
		
		dr.switchTo().defaultContent();//跳出frame
		
		dr.quit();

	}

}
