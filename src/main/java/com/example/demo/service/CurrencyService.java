package com.example.demo.service;

import com.example.demo.model.Currency;
import com.example.demo.model.GameData;
import com.example.demo.model.Rates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {

    private final String URL = "https://api.exchangeratesapi.io/latest?base=PLN";


    public GameData getGameData() {
        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject(URL, Currency.class);
        Rates rates = currency.getRates();

        GameData gameData = rates.getRatesData();
        // System.out.println(gameData.getCurrencySymbol() + " " + gameData.getCurrencyValue());

        return gameData;

    }


}
