package com_jumbo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;
    public void  setDriver(WebDriver driver){
    BasePage.driver=driver;
    }
    public WebElement find(By locator){
      return   driver.findElement(locator);
    }
    public  void click(By locator){
        find(locator).click();
    }
    public void sendKeys(By locator, String keys){
        find(locator).sendKeys(keys);
        System.out.println("Keys :"+keys);
    }
}
