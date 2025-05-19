package task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class WikipediaAIHistory {
    public static void main(String[] args) {
        // Optional: Set path to chromedriver if not in PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to Wikipedia homepage
        driver.get("https://www.wikipedia.org");

        // Locate the search box and search for "Artificial Intelligence"
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.submit();

        // Wait briefly to allow page to load
        try {
            Thread.sleep(3000); // Better to use WebDriverWait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll to the "History" section
        WebElement historyLink = driver.findElement(By.xpath("//span[@id='History']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", historyLink);

        // Click on the History section heading to simulate navigation
        historyLink.click();

        // Print the section title
        System.out.println("Section Title: " + historyLink.getText());

        // Close the browser
        driver.quit();
    }
}

