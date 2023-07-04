package com.SeleniumMaven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTask {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\Driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://amazon.com");
driver.manage().window().maximize();

//ACTION CLASS
        Actions act =new Actions(driver);
        WebElement link =driver.findElement(By.id("twotabsearchtextbox"));
        act.contextClick(link).perform();
       
//ROBOT CLASS
        Robot ro=new Robot();
        ro.keyPress(KeyEvent.VK_UP);
        ro.keyRelease(KeyEvent.VK_UP);
        ro.keyPress(KeyEvent.VK_ENTER);
        ro.keyRelease(KeyEvent.VK_ENTER);
        
       
List<WebElement> iframe=new ArrayList<WebElement>(driver.findElements(By.tagName("iframe")));
System.out.println("Size: "+iframe.size());


for(WebElement iframes: iframe)
	
 {
	
//	System.out.println("Title:"+driver.switchTo().frame(iframe).getTitle());
//	driver.switchTo().defaultContent();
//	
	
 }
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='DAsis']"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        



	}
	

}
