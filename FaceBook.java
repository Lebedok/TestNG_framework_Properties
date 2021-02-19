package Mentoring.Framework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook {

    @Test

    public void initFaceBook(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");
        WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
        login.sendKeys("abcbdsb");

        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("passsss");



    }
}
