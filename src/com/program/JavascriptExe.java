package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Seleniumproject\\Chromedriverpath\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_i256xpxde_e&adgrpid=1319415610409622&hvadid=82463739609610&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=148727&hvtargid=kwd-82464408133329:loc-90&hydadcr=5622_2377266&msclkid=624b029e6b9a1088ee5d65b46369bc4c");
	driver.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0, 1000)");//scroll down
	//Thread.sleep(1000);
	//js.executeScript("window.scrollBy(0, -500)");//scroll up
	js.executeScript("alert('hi welcome');");
	//WebElement element= driver.findElement(By.xpath("//span[text()='India']"));
	//js.executeScript("arguments[0].scrollIntoView()", element);//to find an element by view scroll option
}
}
