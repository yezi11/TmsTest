package com.lzf.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class video {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver dr =new FirefoxDriver();
		dr.get("http://videojs.com/");
		WebElement video=dr.findElement(By.xpath("//body/section/div/video"));
		
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("return arguments[0].currentSrc;", video);//get the video's url
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(15000);
		
		jse.executeScript("arguments[0].pause()", video);
		
		dr.quit();
		

	}

}
