package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumLacatorSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//INI PERINTAH BUAT NUNGGU 10 DETIK JIKA
        // TIDAK ADA ELEMENT YG DITEMUKAN MAKA ERROR
        //   JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title page :"+title);

        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select color = new Select(selectColor);
        color.selectByValue("10");
        System.out.println("Aqua");
        color.selectByIndex(9);
        color.selectByVisibleText("Green");


        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("delay 3 detik");

        driver.quit();
        System.out.println("close web");
    }
}
