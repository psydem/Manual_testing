package com.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement element= driver.findElement(By.xpath("//a[text()='Create new account']"));
	
	WebDriverWait wait= new WebDriverWait(driver, 50);//webdriverwait
	wait.until(ExpectedConditions.visibilityOf(element));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("krishnan");
}
}
