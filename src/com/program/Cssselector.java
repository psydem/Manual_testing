package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector(null));
}
}