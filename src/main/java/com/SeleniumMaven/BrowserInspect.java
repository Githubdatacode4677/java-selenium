package com.SeleniumMaven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserInspect {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome,driver","C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\Driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
driver.manage().window().maximize();

//ACTIION CLASS
Actions act =new Actions(driver);
WebElement inspect=driver.findElement(By.cssSelector("input.3704LK"));
act.contextClick(inspect).perform();

Thread.sleep(2000);

//ROBOT CLASS
Robot r=new Robot();
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

//Thread.sleep(2000);
//driver.close();
	}

}
