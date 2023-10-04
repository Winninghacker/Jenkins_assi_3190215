package com.tmb.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tmb.constants.FrameworkConstants;

//import org.testng.annotations.Test;

public class LoginPagetest extends FrameworkConstants {
	
	
	
	@Test(priority=1)
	public void test1() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(priority=2)
	public void test2() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=3)
	public void test3() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=4)
	public void test4() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=5)
	public void test5() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=6)
	public void test6() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bullet",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(5000);
		driver.quit();}
	
	
		
}
 