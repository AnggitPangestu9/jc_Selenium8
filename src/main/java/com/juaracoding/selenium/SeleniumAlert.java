package com.juaracoding.selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//INI PERINTAH BUAT NUNGGU 10 DETIK JIKA
        // TIDAK ADA ELEMENT YG DITEMUKAN MAKA ERROR
     //   JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title page :"+title);
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        System.out.println("alert ok clik");
        driver.findElement(By.id("timerAlertButton")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
        System.out.println("alert ok 5 secon clik");
        driver.findElement(By.id("confirmButton")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
        System.out.println("akert konfirm ik");
        driver.findElement(By.id("promtButton")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().sendKeys("endo");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
        System.out.println("keyboard event ok");

        System.out.println("delay 3 detik");
        driver.quit();
        System.out.println("close web");

    }
}
