package io.reflectoring.demo.Selenium.FilpkartScraping;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Service;

@Service
public class ScrapingService {

    private WebDriver driver;

    public ScrapingService() {
        // Automatically download and setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        driver = new ChromeDriver();
    }

    public void scrapeFlipakt() throws InterruptedException {
        // Open Google
        driver.get("https://www.flipkart.com/");
        System.out.println("Page title is: " + driver.getTitle());

        // Close the login popup (if appears)
        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("No login popup displayed.");
        }

        // Find the search box using name attribute and enter "Dell Laptop"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Dell Laptop");
        searchBox.sendKeys(Keys.ENTER);  // Press Enter key

        // Wait for results to load
        Thread.sleep(1000);

        // Expand the "Processor" filter dropdown
        WebElement processorDropdown = driver.findElement(By.xpath("//div[contains(text(),'Processor')]"));
        processorDropdown.click();

        // Wait for filter options to appear
        Thread.sleep(1000);

        // Select the "Ryzen 5 Hexa Core" checkbox
//        WebElement dropdown = driver.findElement(By.className("ewzVkT _3DvUAf"));
//        Select select = new Select(dropdown);
//        select.selectByValue("Ryzen 5 Hexa Core");

//        WebElement ryzen5HexaCore = driver.findElement(By.xpath("//div[contains(text(),'Ryzen 5 Hexa Core')]"));
//        ryzen5HexaCore.click();
//        driver.findElement(By.className("ewzVkT _3DvUAf")).click();

        // Print the page title after search
        System.out.println("Page title after search: " + driver.getTitle());



        // Wait and close browser
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

//        driver.quit();
    }

}

