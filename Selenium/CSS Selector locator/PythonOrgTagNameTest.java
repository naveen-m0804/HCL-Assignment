package redbusTesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class PythonOrgTagNameTest {

    @Test
    public void getAnchorDetails() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.python.org/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total number of Anchor tags found: " + allLinks.size());

        System.out.println("----------------------------------------");
        System.out.println("Printing href values :");
        System.out.println("----------------------------------------");

        int count = 0;
        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");
            
            if (url != null && !url.isEmpty()) {
                System.out.println("Link Text: " + link.getText() + " | HREF: " + url);
                count++;
            }
            
            if (count >= 10) break;
        }

    }
}