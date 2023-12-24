package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorTextBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url ="https://demoqa.com/text-box";
        driver.get(url);
        System.out.println("get url");
        driver.manage().window().maximize();
        System.out.println("maximize browser");

        //locator
        String titleHeader = driver.getTitle();
        System.out.println("title header"+titleHeader);
        //scaping halaamnan un utk memastikan ada dihalaman tekbox
        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title page:"+title);
        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@JuaraCoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        //scroll BY FIXEL (vertikal)
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();

        System.out.println("delay 3 detik");
        //validasi apakah bener ada ada di halaaman text box page dengan cek title page nya
        System.out.println("Tase Case Result :");
        if(title.equals("Text Box")){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("close web");
    }
}
