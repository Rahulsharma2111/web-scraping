package io.reflectoring.demo.Selenium.FilpkartScraping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
        @RestController
        public class ScrapingController {

            @Autowired
            private ScrapingService scrapingService;
            @GetMapping("/flipkart")
            public void flipkartScraping() throws InterruptedException {
                scrapingService.scrapeFlipakt();
            }
}
