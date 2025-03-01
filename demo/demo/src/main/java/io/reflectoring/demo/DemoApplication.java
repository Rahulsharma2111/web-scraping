package io.reflectoring.demo;


import io.reflectoring.demo.Selenium.FilpkartScraping.ScrapingService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//	@Autowired
//   public static SeleniumService seleniumService;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

//		seleniumService.runSeleniumTest();

		ScrapingService service = new ScrapingService();
		service.scrapeFlipakt();

		// Automatically download and setup ChromeDriver
//		WebDriverManager.chromedriver().setup();
//
//		// Initialize WebDriver
//		WebDriver driver = new ChromeDriver();
//
//		// Open Google
//		driver.get("https://www.google.com");
//		System.out.println("Page title is: " + driver.getTitle());
//
//		// Wait and close browser
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		driver.quit();
	}
}
