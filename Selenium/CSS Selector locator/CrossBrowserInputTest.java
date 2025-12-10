package redbusTesting.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class CrossBrowserInputTest {

    @Test
    public void launchWebsiteBasedOnInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name (Chrome, Edge, or Firefox): ");
        String browserInput = scanner.next();
        
        WebDriver driver = null;

        if (browserInput.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserInput.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserInput.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser name entered.");
            return; 
        }

        if (driver != null) {
            driver.manage().window().maximize();
            driver.get("https://www.wikipedia.org/");
            System.out.println("Launched " + browserInput + " successfully.");
            System.out.println("Page Title is: " + driver.getTitle());

        }
        
    }
}