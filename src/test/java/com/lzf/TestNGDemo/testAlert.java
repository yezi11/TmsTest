package com.lzf.TestNGDemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testAlert {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.baidu.com/");
		//鼠标停留在设置上
		Actions ac =new Actions(dr);
		ac.clickAndHold(dr.findElement(By.linkText("设置"))).perform();
		ac.release(dr.findElement(By.linkText("设置"))).perform();
		//点击搜索设置
		WebElement s =dr.findElement(By.className("setpref"));
		System.out.println(s.getAttribute("type"));
		System.out.println(s.getText());
		s.click();
		Thread.sleep(2000);
		//保存
		dr.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		//接收弹框
		dr.switchTo().alert().accept();
		
		dr.quit();
		

	}

}
