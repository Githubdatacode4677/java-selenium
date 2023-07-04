package com.SeleniumMaven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankingTask {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Seleniumnew\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@ng-click='manager()']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mark");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Antony");
	driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("600001");
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	//submit.sendKeys(Keys.ENTER);
	Alert ar=driver.switchTo().alert();
	ar.accept();
	
	TakesScreenshot ts= driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	String filename=d.toString().replaceAll(":","_").replace(",","_")+".png";
	File desc =new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src, desc);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
	Thread.sleep(1000);
	WebElement open=driver.findElement(By.id("userSelect"));
	open.click();
	open.sendKeys("Mark Antony");
	open.sendKeys(Keys.TAB);
	WebElement cur=driver.findElement(By.id("currency"));
	cur.click();
	cur.sendKeys("Rupee");
	cur.sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
//	Date a=new Date();
//	String filename1=d.toString().replaceAll(":","_").replace(",","_")+".png";

	Thread.sleep(1000);
	Robot r1 =new Robot();
	r1.keyPress(KeyEvent.VK_WINDOWS);
	r1.keyPress(KeyEvent.VK_PRINTSCREEN);
	r1.keyRelease(KeyEvent.VK_WINDOWS);
	r1.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
	
	
//	Alert al=driver.switchTo().alert();
//	al.accept();
//	File src1=ts.getScreenshotAs(OutputType.FILE);
//	File desc1 =new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
//	FileUtils.copyFile(src1, desc1);
	Thread.sleep(1000);
	Alert al=driver.switchTo().alert();
	al.accept();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
	Thread.sleep(1000);
	WebElement sea=driver.findElement(By.xpath("//input[@placeholder='Search Customer']"));
	sea.click();
	sea.sendKeys("Mark");
	File src2=ts.getScreenshotAs(OutputType.FILE);
	File desc2=new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src2, desc2);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn home']")).click();
	//driver.executeScript("window.scrollBy(0,500)");	
	driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();
	Thread.sleep(1000);
//    WebElement name = driver.findElement(By.cssSelector("select.form-control.ng-pristine.ng-untouched.ng-valid"));
//	name.click();
//	Select s = new Select(name);
//	s.selectByIndex(2);
//	name.click();
	
	WebElement name = driver.findElement(By.id("userSelect"));
	name.click();
	name.sendKeys("Mark Antony");
	name.sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	File src3=ts.getScreenshotAs(OutputType.FILE);
	File desc3=new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src3, desc3);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("5000");
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	File src4=ts.getScreenshotAs(OutputType.FILE);
	File desc4=new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src4, desc4);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("3000");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	File src5=ts.getScreenshotAs(OutputType.FILE);
	File desc5=new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src5, desc5);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
	File src6=ts.getScreenshotAs(OutputType.FILE);
	File desc6=new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\src\\main\\java\\com\\SeleniumMaven\\BankingTask.java"+filename);
	FileUtils.copyFile(src6, desc6);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@ng-show='logout']")).click();
	
	
	
	
	}

}
