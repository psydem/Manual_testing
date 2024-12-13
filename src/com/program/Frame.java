package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://letcode.in/frame");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement element= driver.findElement(By.name("fname"));
	element.sendKeys("krish");
	driver.switchTo().frame(1);
	WebElement element1= driver.findElement(By.name("email"));
	element1.sendKeys("psydemedits@gmail.com");
	//to return to the default page
	//driver.switchTo().defaultContent();
	//to return to frame 0
	driver.switchTo().parentFrame();
	//or we can also use
	//driver.switchTo().frame(0);
	WebElement element2= driver.findElement(By.name("lname"));
	element2.sendKeys("S");
	
}
}
