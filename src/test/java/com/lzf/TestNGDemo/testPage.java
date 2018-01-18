package com.lzf.TestNGDemo;

import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testPage {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		File file=new File("testPage/checkbox.html");
		String filepath=file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		
		//tagname定位元素
//		List<WebElement> inputs=dr.findElements(By.tagName("input"));
//		for(WebElement checkbox:inputs) {
//			String ty=new String(checkbox.getAttribute("type"));
//			System.out.println(ty);
//			if (ty.equals("checkbox")) {
//				checkbox.click();
//				Thread.sleep(2000);
//			}
//		}
//		
		
		//通过css定位元素
		//List<WebElement> inputs2=dr.findElements(By.cssSelector("input[type='checkbox']"));
		
		//通过xpath定位
		List<WebElement> inputs3=dr.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox:inputs3) {
			System.out.println(checkbox.getAttribute("type"));
			checkbox.click();
		}
		Thread.sleep(3000);
		
		//dr.navigate().refresh();
		System.out.println(inputs3.size());
		System.out.println(inputs3.size()-1);
		System.out.println(inputs3.get(2).getAttribute("type"));
		inputs3.get(inputs3.size()-1).click();//取消勾选最后一个 
		Thread.sleep(3000);
		
		dr.quit();

	}

}
