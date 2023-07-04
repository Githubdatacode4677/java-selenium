package com.SeleniumMaven;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.com");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
//	File desc =new  File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\ScreenShot"+"jai.png");
//	FileUtils.copyFile(src, desc);
	Date d=new Date();
	String filename=d.toString().replaceAll(":","_").replace(",","_")+".png";
	File desc1 = new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\ScreenShot\\"+filename);
	FileUtils.copyFile(src, desc1);
	
	
	
	}

}
