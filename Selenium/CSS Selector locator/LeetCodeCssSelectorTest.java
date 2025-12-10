package redbusTesting.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeetCodeCssSelectorTest {

    @Test
    public void demonstrateCssSelectors() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://leetcode.com/");
        WebElement rootContainer = driver.findElement(By.cssSelector("#__next"));
        
        WebElement problemStatement = driver.findElement(By.cssSelector("a[href='/problemset']"));
        System.out.println("Found element text: " + problemStatement.getText());
        System.out.println("Success: Identified element using CSS Selector.");

    }
}