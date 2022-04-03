package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class SpringJpaExampleApplication implements CommandLineRunner {

	@Autowired
	CurrencyRepository currencyRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CurrencyService currencyService = new CurrencyService();
		HttpStatus status = currencyService.addAllCurrencies(currencyRepository);
	}
}
