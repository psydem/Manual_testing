package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	//Simple alert
	driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//confirm alert
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	//Prompt alert
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	driver.switchTo().alert().sendKeys("Test");
	driver.switchTo().alert().accept();
}
}
