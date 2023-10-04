package com.tmb.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;

public class FrameworkConstants {
	
    public static WebDriver driver;

    @BeforeMethod
    public void chrome() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
