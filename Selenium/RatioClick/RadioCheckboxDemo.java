package redbusTesting.ratioClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxDemo {

    public static void main(String[] args) throws InterruptedException {

        // 1. Initialize Driver
        WebDriver driver = new ChromeDriver();
        
        try {
            // 2. Open the URL and Maximize
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.manage().window().maximize();

            System.out.println("--- Automation Started ---");

            // =============================================
            // TASK 1: Select a Radio Button (e.g., Radio 2)
            // =============================================
            
            // Using CSS Selector based on the 'value' attribute
            WebElement radio2 = driver.findElement(By.cssSelector("input[value='radio2']"));
            radio2.click();

            // Validation: Check if it was selected
            if (radio2.isSelected()) {
                System.out.println("Success: Radio Button 2 is selected.");
            }

            // =======================================================
            // TASK 2: Select Two Checkboxes (e.g., Option 1 & Option 2)
            // =======================================================
            
            // Using ID locator (Best practice when IDs are available)
            WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
            WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));

            // Click them
            checkbox1.click();
            checkbox2.click();

            // Validation
            if (checkbox1.isSelected() && checkbox2.isSelected()) {
                System.out.println("Success: Checkbox 1 and Checkbox 2 are selected.");
            }

            // Optional: Pause to let you see the result before closing
            Thread.sleep(3000); 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // 3. Tear down
            driver.quit();
            System.out.println("--- Automation Finished ---");
        }
    }
}