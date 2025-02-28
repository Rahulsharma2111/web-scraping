//package io.reflectoring.demo.Selenium;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SeleniumService {
//
//    public void runSeleniumTest() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.com");
//        System.out.println("Page title is: " + driver.getTitle());
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.quit();
//    }
//}
