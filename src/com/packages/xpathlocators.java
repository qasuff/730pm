package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocators {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc");
	
	//driver.findElement(By.xpath("  //*[@id=\"pass\"]")).sendKeys("abc");	
	
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
	
	
		
		
		

	}

}
