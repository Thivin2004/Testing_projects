package com.thivin;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest {

    public static WebDriver driver;
    @Test
    public void test1() throws MalformedURLException,InterruptedException{
        WebDriverManager.chromedriver().setup();;
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstop.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/main/div[18]/div[2]/div/div/div/section/div/div/div[2]/div/div/a/img")).click();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.close();
    }

}