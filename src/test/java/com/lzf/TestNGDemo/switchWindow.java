package com.lzf.TestNGDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchWindow {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver dr =new FirefoxDriver();
		dr.get("https://www.baidu.com/");
		
		//获取当前句柄
		String winhandle=dr.getWindowHandle();
		System.out.println(winhandle);
		
		dr.findElement(By.linkText("登录")).click();
		Thread.sleep(2000);
		dr.findElement(By.linkText("立即注册")).click();
		
		Set<String> handles=dr.getWindowHandles();
		
		for(String handle:handles) {//注册页
			if(handle.equals(winhandle)==false) {
				//切换注册页面
				dr.switchTo().window(handle);
				System.out.println("register window");
				Thread.sleep(4000);
				dr.findElement(By.name("userName")).clear();
				dr.findElement(By.name("userName")).sendKeys("liu");
				dr.findElement(By.id("TANGRAM__PSP_3__password")).sendKeys("111");
				Thread.sleep(2000);
				dr.close();//关闭当前窗口
			}
		}
		
		for(String handle:handles) {//百度首页
			if(handle.equals(winhandle)) {
				dr.switchTo().window(handle);
				Thread.sleep(2000);
				dr.findElement(By.className("close-btn")).click();
				System.out.println("baidu search page");
				dr.findElement(By.id("kw")).sendKeys("page");
				Thread.sleep(2000);
				
			}
		}
		
		dr.quit();

	}

}
