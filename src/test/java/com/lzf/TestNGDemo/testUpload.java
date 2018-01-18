package com.lzf.TestNGDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testUpload {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr =new FirefoxDriver();
		File file=new File("testPage/upload_file.html");
		String filepath=file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		
		dr.findElement(By.name("file")).sendKeys("E:\\testfile.txt");
		Thread.sleep(3000);
		dr.quit();

	}

}
