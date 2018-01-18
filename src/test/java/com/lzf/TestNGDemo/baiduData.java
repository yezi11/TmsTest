package com.lzf.TestNGDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baiduData {
	public static void baiduTest(String testdata) throws InterruptedException{
		WebDriver dr =new FirefoxDriver();
		dr.get("https://www.baidu.com/");
		dr.findElement(By.id("kw")).sendKeys(testdata);
		dr.findElement(By.id("su")).click();
		Thread.sleep(2000);
		dr.close();
	}
	
	public static void readTxtFile(String filePath) {
		try {
			String encoding="GBK";
			File file=new File(filePath);
			//
			if(file.isFile() && file.exists()) {
				InputStreamReader read=new InputStreamReader(new FileInputStream(file),encoding);
				BufferedReader bufferedread= new BufferedReader(read);
				String lineTxt=null;
				while((lineTxt=bufferedread.readLine())!=null) {
					System.out.println(lineTxt);
					baiduTest(lineTxt);
				}
				read.close();
			}
			else {
				System.out.println("找不到制定文件");
			}
		}
		catch(Exception e){
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="E:\\刘志芳\\study\\workspace\\TestNGDemo\\info.txt";
		readTxtFile(filePath);

	}

}
