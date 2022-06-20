package com.cydeo.step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanguageTest {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        WebDriver driver = new ChromeDriver(options);

       driver.get("https://www.google.com");
       driver.findElement(By.id("W0wltc")).click();

       driver.findElement(By.name("q")).sendKeys("capital of UK"+ Keys.ENTER);

        System.out.println("driver.findElement(By.xpath(\"//a[@class='FLP8od']\")).getText() = " + driver.findElement(By.xpath("//a[@class='FLP8od']")).getText());


        driver.close();
    }

}
