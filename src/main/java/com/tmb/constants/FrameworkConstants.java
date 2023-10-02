package com.tmb.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class FrameworkConstants {
    public static WebDriver driver;

    @BeforeMethod
    public void chrome() {
        // Set the path to the ChromeDriver executable (uncomment if needed)
        // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
