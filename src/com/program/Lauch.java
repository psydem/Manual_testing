package com.program;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Lauch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=717602284790&hvpos=&hvnetw=g&hvrand=2814694495769813729&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9182246&hvtargid=kwd-10573980&hydadcr=14453_2405312&gad_source=1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//task minimize
	//driver.manage().window().setSize(new Dimension(200, 200));
	
	//getmethod--getTitle and get currenturl
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.close();
	//driver.quit();
	//navigate method
	Navigation navigate= driver.navigate();
	navigate.to("https://www.flipkart.com/?affid=rohanpouri&affExtParam1=ENKR20240711A984282445&affExtParam2=ENKR20240711A984282445&ef_id=CjwKCAjwjsi4BhB5EiwAFAL0YIMoj3veJ7KwpcM9GuqqVMA2P4HHsydbARFgaD9npHWZCbOdQLrHuBoC4wMQAvD_BwE:G:s&s_kwcid=AL!739!3!705840437232!!!g!!&gclsrc=aw.ds&&cmpid=sem_4972523958_grocery_Search_ON/NC_DSA_Session&gad_source=1&gclid=CjwKCAjwjsi4BhB5EiwAFAL0YIMoj3veJ7KwpcM9GuqqVMA2P4HHsydbARFgaD9npHWZCbOdQLrHuBoC4wMQAvD_BwE");
	Thread.sleep(2000);
	navigate.back();
	Thread.sleep(2000);
	navigate.forward();
	Thread.sleep(2000);
	navigate.refresh();
	
	//Locator
	driver.findElement(By.id("email"));
}
}
