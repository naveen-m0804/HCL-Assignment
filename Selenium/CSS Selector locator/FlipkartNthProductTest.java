package redbusTesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FlipkartNthProductTest {

    @Test
    public void searchAndPrintNthProduct() throws InterruptedException {
        // 1. Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Launch Flipkart
        driver.get("https://www.flipkart.com/");

        // 3. Handle Login Popup (Flipkart often shows a login pop-up on launch)
        // We use a try-catch because sometimes it doesn't appear.
        try {
            WebElement closeButton = driver.findElement(By.xpath("//span[@role='button']")); 
            closeButton.click();
        } catch (Exception e) {
            // Popup did not appear or locator changed, proceed to search
        }

        // ------------------------------------------------------------------
        // TASK: Search for "Laptop" and find the 7th Product (From your table)
        // ------------------------------------------------------------------
        
        String productName = "Laptop";
        int n = 7; // The Nth number from your table

        // 4. Find Search Bar and enter input
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);

        // 5. Wait for results to load (Simple sleep for stability in this demo)
        Thread.sleep(3000);

        // 6. Collect all product titles
        // Class '_4rR01T' is commonly used for Laptop/Mobile titles in List View on Flipkart
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

        // 7. Validation and Printing the Nth product
        // We use (n - 1) because List index starts at 0.
        if (productList.size() >= n) {
            WebElement nthProduct = productList.get(n - 1);
            System.out.println("--------------------------------------------------");
            System.out.println("Search Query: " + productName);
            System.out.println("The " + n + "th Product Name is: " + nthProduct.getText());
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Error: Less than " + n + " products found.");
        }

    }
}