package com.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement mxplay= driver.findElement(By.linkText("MX Player"));
	mxplay.click();
	TakesScreenshot aScreenshot= (TakesScreenshot) driver;
	File src1= aScreenshot.getScreenshotAs(OutputType.FILE);
	File desFile2 = new File("C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Screenshot\\mxplay.png");
	FileHandler.copy(src1, desFile2);
}
}
