package com.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;

public class Adactin {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement element= driver.findElement(By.id("username"));
	element.sendKeys("baalakrishnan");
	WebElement element1= driver.findElement(By.id("password"));
	element1.sendKeys("12345678");
	driver.findElement(By.className("login_button")).click();
	
	TakesScreenshot aScreenshot= (TakesScreenshot) driver;
	File src= aScreenshot.getScreenshotAs(OutputType.FILE);
	File desFile = new File("C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Screenshot\\adac.png");
	FileHandler.copy(src, desFile);
}
}
