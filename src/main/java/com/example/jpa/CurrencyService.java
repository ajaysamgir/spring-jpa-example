package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.transaction.Transactional;
import java.util.Objects;

public class CurrencyService {

    public HttpStatus addAllCurrencies(CurrencyRepository currencyRepository) {
        Currency currency = Currency
                .builder()
                .numericCode(1)
                .codeStr("INR")
                .description("Indian")
                .build();

        Currency savedCurrency = currencyRepository.save(currency);
        System.out.println("Saved Currency : " + savedCurrency.getCodeStr() + " " + savedCurrency.getDescription());
        return HttpStatus.CREATED;
    }
}
