package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorCekbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url ="https://demoqa.com/checkbox";
        driver.get(url);
        System.out.println("get url");
        driver.manage().window().maximize();
        System.out.println("maximize browser");
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
       driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
       // driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]/svg")).click();
        String thxDownloads = driver.findElement(By.xpath("//*[@id=\"result\"]/span[2]")).getText();
        System.out.println(thxDownloads);

        //locator
        String titleHeader = driver.getTitle();
        System.out.println("title header"+titleHeader);
        //scaping halaamnan un utk memastikan ada dihalaman ceekbox
        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title page:"+title);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("close web");
    }
}
