package com.program;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=713930224968&hvpos=&hvnetw=g&hvrand=9280650799710926684&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061920&hvtargid=kwd-10573980&hydadcr=14453_2402227&gad_source=1");
	driver.manage().window().maximize();
	//WebElement element= driver.findElement(By.id("email"));
	//element.sendKeys("kkeri@gmail.com");
	//WebElement element1= driver.findElement(By.id("pass"));
	//element1.sendKeys("12345678");
	//driver.findElement(By.name("email")).sendKeys("krish");
	//driver.findElement(By.className("selected")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("Krish");
	
}
}
