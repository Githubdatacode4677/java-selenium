package com.SeleniumMaven;

import java.util.ArrayList;
import java.util.Collection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToALert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(1000);
		ArrayList<WebElement> alist = new ArrayList<WebElement>(driver.findElements(By.cssSelector("a.analystic")));
		alist.get(1).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();

		alist.get(2).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);

		Alert ar = driver.switchTo().alert();
		ar.sendKeys("jai");
		ar.accept();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		act.moveToElement(element).click().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Windows']"))).perform();
		act.click().perform();

	}

}
