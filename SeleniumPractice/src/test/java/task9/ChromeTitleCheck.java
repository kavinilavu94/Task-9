package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTitleCheck {
    public static void main(String[] args) {
        // Optional: Specify path to chromedriver if not in PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.demoblaze.com");

        // Get the page title
        String pageTitle = driver.getTitle();

        // Check if title matches expected value
        if (pageTitle.equals("STORE")) {
            System.out.println("Page landed on correct website.");
        } else {
            System.out.println("Page not landed on correct website.");
        }

        // Close the browser
        driver.quit();
    }
}