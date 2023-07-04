package com.SeleniumMaven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NykaaTask {
	
	public static void screenshot(ChromeDriver driver) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String filename =d. toString().replaceAll(":","_").replace(",","_")+".png";
		File dest =new File("C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\ScreenShot"+filename);
		FileUtils.copyFile(src, dest);
			
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\SeleniumBuild\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.nykaa.com");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
//	driver.findElement(By.xpath("//html")).click();
//	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//	driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("9092210955");
//	driver.findElement(By.id("submitVerification")).click();
//	Thread.sleep(13000);
////	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
////	WebDriverWait exwait = new WebDriverWait(driver, 10);
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
////	driver.findElement(By.id("fullName")).sendKeys("JaiGanesh");
////	driver.findElement(By.id("customerEmail")).sendKeys("jaiganesh4677@gmail.com");
//	Thread.sleep(2000);
	
			
	
 	WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
 	
//Action class 	
 	Actions act=new Actions(driver);
 	act.moveToElement(brand).perform();
 	Thread.sleep(1000);
 	WebElement search=driver.findElement(By.id("brandSearchBox"));
 	search.click();
 	search.sendKeys("The Face Shop");
 	search.sendKeys(Keys.ENTER);
 	Thread.sleep(1000);
 	WebElement shop=driver.findElement(By.xpath("//a[@href='/brands/the-face-shop/c/4290?ptype=brand&id=4290&root=brand_menu,top_brands,The Face Shop']"));
 	act.moveToElement(shop).click().perform();
 	
 	driver.executeScript("window.scrollBy(0,300)");
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//a[@class='css-54m7ft']")).click();
 	driver.executeScript("window.scrollBy(0,300)");
//List  	
 	ArrayList<WebElement> alist=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='filter-open css-1gdff5r']")));
	alist.get(2).click();
	driver.findElement(By.xpath("//span[text()='Rs. 1000 - Rs. 1999']")).click();
	Thread.sleep(2000);
	driver.executeScript("window.scrollBy(0,300)");
	alist.get(3).click();
	driver.findElement(By.xpath("//label[@for='radio_20% and above_20-*']")).click();
	driver.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	screenshot(driver);
	Thread.sleep(2000);
	
	List<WebElement> pro = driver.findElements(By.xpath("//div[@class='productWrapper css-xin9gt']"));
	//List<WebElement> pro=new ArrayList<WebElement>(driver.findElements(By.id("product-list-wrap")));
	for(WebElement product:pro)
	{
		System.out.println("List of products: " + product );
		System.out.println("Product Name: " + product.getText()+ "\n");
		
	}
  Thread.sleep(2000);
   // WebElement p=driver.findElement(By.id("product-list-wrap"));
	ArrayList<WebElement> pr=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='productWrapper css-xin9gt']")));
     pr.get(4).click();

     Thread.sleep(2000);
    Set<String> windows =driver.getWindowHandles();
    Iterator<String> it =windows.iterator();
    String p = it.next();
    String child = it.next();
    driver.switchTo().window(child);
    Thread.sleep(2000);
    screenshot(driver);
	Thread.sleep(2000);
   Thread.sleep(2000); 
   
    ArrayList<WebElement> view=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='css-qb9x9j']")));
    view.get(0).click();
    Thread.sleep(2000);
    view.get(1).click();
    Thread.sleep(2000);
    view.get(2).click();
    Thread.sleep(2000);
    view.get(3).click();
    Thread.sleep(2000);
   //driver.executeScript("window.scrollBy(0,300)");
    WebElement c =driver.findElement(By.xpath("//button[@class='css-1fedw20']"));
    c.click();
    view.get(4).click();
    Thread.sleep(2000);
    c.click();
    view.get(5).click();
    Thread.sleep(2000);
    c.click();
    Thread.sleep(2000);
    screenshot(driver);
	Thread.sleep(2000);
    driver.executeScript("window.scrollBy(0,1600)");
    Thread.sleep(2000);
    List<WebElement> review = new ArrayList<WebElement>(driver.findElements(By.xpath("//section[@class='css-1v6g5ho']")));
    for(WebElement reviews:review)	{
    	System.out.println("Customer Review : "+ reviews.getText() +"\n");
    }
    
    driver.executeScript("window.scrollBy(0,-1300)");
    Thread.sleep(3000);

    ArrayList<WebElement> add=new ArrayList<WebElement>(driver.findElements(By.xpath("//span[text()='Add to Bag']")));
    add.get(0).click();
    
    Thread.sleep(3000);
    screenshot(driver);
	Thread.sleep(2000);
   WebElement cart= driver.findElement(By.xpath("//span[@class='cart-count']"));
   act.moveToElement(cart).click().perform();
   Thread.sleep(3000);
   
   //ArrayList<WebElement> iframes=new ArrayList<WebElement>(driver.findElements(By.xpath("//iframe[@class='css-acpm4k']")));
   WebElement frameelement=driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
   driver.switchTo().frame(frameelement);
   Thread.sleep(3000);
   driver.findElement(By.xpath("//span[text()='Proceed']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("600054");
   Thread.sleep(5000);
   Robot r=new Robot();
   r.keyPress(KeyEvent.VK_TAB);
   r.keyRelease(KeyEvent.VK_TAB);
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']")).sendKeys("no.638");
  	Thread.sleep(5000);
   driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']")).sendKeys("T.N.H.B, Avadi");
   Thread.sleep(2000);
   screenshot(driver);
	Thread.sleep(2000);
   driver.executeScript("window.scrollBy(0,300)");
   driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Basha");
   driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9884066445");
   driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("dummymail@gmail.com");
   driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
   Thread.sleep(2000);
   screenshot(driver);
	Thread.sleep(2000);
  WebElement card= driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
  act.moveToElement(card).click().sendKeys("4589222865458912").perform();
  r.keyPress(KeyEvent.VK_TAB);
  r.keyRelease(KeyEvent.VK_TAB);
  Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']")).sendKeys("05/29");
  r.keyPress(KeyEvent.VK_TAB);
  r.keyRelease(KeyEvent.VK_TAB);
  driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("426");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']")).click();
  Thread.sleep(2000);
  screenshot(driver);
	Thread.sleep(3000);
  
  driver.close();
   	
	}
}