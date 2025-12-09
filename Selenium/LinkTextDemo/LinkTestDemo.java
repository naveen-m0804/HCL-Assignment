package redbusTesting.linkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestDemo {
    public static void main(String[] args) {
    	
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://www.w3schools.com/");
            driver.manage().window().maximize();
            
            System.out.println("Attempting to click exact link: 'Learn Java'");
            
            WebElement exactLink = driver.findElement(By.linkText("Learn Java"));
            exactLink.click();
            
            System.out.println("Title after clicking LinkText: " + driver.getTitle());
            
            driver.navigate().back(); 
            Thread.sleep(2000); 

            System.out.println("Attempting to click partial link containing: 'Paid'");
           
            WebElement partialLink = driver.findElement(By.partialLinkText("Paid"));
            partialLink.click();
            
            System.out.println("Title after clicking PartialLinkText: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } 
 //          finally {
//            // 3. Cleanup
//            driver.quit();
//        }
    }
}