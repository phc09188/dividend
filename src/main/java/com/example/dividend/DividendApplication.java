package com.example.dividend;

import com.example.dividend.scraper.Scraper;
import com.example.dividend.scraper.YahooFinanceScraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class DividendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DividendApplication.class, args);
	}
}
