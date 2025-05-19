package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSelenium {
    public static void main(String[] args) {
        // Optional: Set path to geckodriver if not in system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Step 1 : Launch the browser
        WebDriver driver = new FirefoxDriver();

        // step 2: Maximize window
        driver.manage().window().maximize();

        // Step 3:load the url
        driver.get("http://google.com");

        //Step 4: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Step 5:Reload/Refresh the page
        driver.navigate().refresh();

        //Step 6: Optional: Wait a moment to observe refresh
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 7:Close the browser
        driver.quit();
    }
}