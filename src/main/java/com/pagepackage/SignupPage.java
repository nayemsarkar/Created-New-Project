package com.pagepackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) {


		
		
WebDriver driver = new ChromeDriver();	
		
		System.out.println(driver.getTitle());
		
		
		// All test is passed----below-----Automation login 
		
				driver.get("http://qa.user.student.ui.eschooljourney.com:3001/");
				
				
				//driver.findElement(By.linkText("Forgot Password?")).click();
				
				//Thread.sleep(2000);
				
				driver.findElement(By.id("username_input")).click();
				
				//Thread.sleep(2000);
				driver.findElement(By.id("username_input")). sendKeys("studentUser");
				
				//Thread.sleep(3000);
				
				//Thread.sleep(2000);
				driver.findElement(By.id("password_input")).click();
				
				//Thread.sleep(2000);
				driver.findElement(By.id("password_input")). sendKeys("1234");
				


	}

}
