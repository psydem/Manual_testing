package com.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot aScreenshot= (TakesScreenshot) driver;
	File src= aScreenshot.getScreenshotAs(OutputType.FILE);
	File desFile = new File("C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Screenshot\\ama.png");
	FileHandler.copy(src, desFile);
}
}
