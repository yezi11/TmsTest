package com.lzf.TestNGDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbaidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.baidu.com/");
		
		try {
			File srcfile=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("E:\\tdownload\\screenshot.png"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement size= dr.findElement(By.id("kw"));
		System.out.println(size.getSize());
		
		WebElement text = dr.findElement(By.id("cp"));
		System.out.println(text.getText());
		
		System.out.println(size.getAttribute("type"));
		
		System.out.println(size.isDisplayed());
		
		dr.quit();

	}

}
