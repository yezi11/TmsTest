package com.lzf.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class mdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile fprofile =new FirefoxProfile();
		fprofile.setPreference("browser.download.folderlist",2);
		fprofile.setPreference("browser.download.manager.showWhenStarting", false);
		fprofile.setPreference("browser.download.dir", "E:\\tdownload");
		fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
		
		WebDriver dr=new FirefoxDriver(fprofile);
		dr.get("https://pypi.Python.org/pypi/selenium");
		dr.findElement(By.partialLinkText("selenium-3.6.0")).click();

	}

}
