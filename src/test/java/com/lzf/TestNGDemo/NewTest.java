package com.lzf.TestNGDemo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver dr;
  @Test
  public void testCase01() {
	  //打开火狐浏览器
	  System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
	  dr = new FirefoxDriver();
	  //设置浏览器窗口大小
	  //dr.manage().window().setSize(new Dimension(480,800));
	  dr.manage().window().maximize();
	  //输入百度地址
	  dr.get("https://www.baidu.com/");

	  //定位输入框，输入搜索内容点击搜索
	  dr.findElement(By.id("kw")).sendKeys("selenium");
	  dr.findElement(By.id("su")).click();
	  //浏览器刷新
	  dr.navigate().refresh();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Page title is :"+ dr.getTitle());
	  dr.quit();
  }

}
