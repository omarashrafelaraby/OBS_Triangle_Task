package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrianglePage {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/apps/triangle/triangle001.html");
        driver.manage().window().maximize();

        WebElement side1 = driver.findElement(By.xpath("//input[@id=\"side1\"]"));
        side1.sendKeys("3");

        WebElement side2 = driver.findElement(By.xpath("//input[@id=\"side2\"]"));
        side2.sendKeys("4");

        WebElement side3 = driver.findElement(By.xpath("//input[@id=\"side3\"]"));
        side3.sendKeys("5");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id=\"identify-triangle-action\"]"));
        submitButton.click();

        WebElement triangleType = driver.findElement(By.xpath("//p[@id=\"triangle-type\"]"));
            System.out.println("Triangle Classification is: " + triangleType.getText());
        driver.quit();

    }
}
