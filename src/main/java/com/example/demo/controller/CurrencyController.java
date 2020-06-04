package com.example.demo.controller;


import com.example.demo.model.GameData;
import com.example.demo.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpSession;


@Controller
public class CurrencyController {

    private CurrencyService currencyService;
    private GameData gameData;



    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
        this.gameData = currencyService.getGameData();


    }

    @GetMapping
    public String getCurrencyData(Model model, HttpSession session) {
        model.addAttribute("currency", gameData);
        model.addAttribute("guessCurrency", new GameData());
        session.getAttribute("message");

        return "currency-game";
    }

    @PostMapping
    public String guessCurrency(GameData guessingData, Model model, HttpSession session) {

        if (Double.compare(gameData.getCurrencyValue(), guessingData.getCurrencyValue()) == 0) {
            session.setAttribute("message", "Wygrałeś!");
        } else if (Double.compare(gameData.getCurrencyValue(), guessingData.getCurrencyValue()) > 0) {
            session.setAttribute("message", "Daj trochę więcej.");
        } else if (Double.compare(gameData.getCurrencyValue(), guessingData.getCurrencyValue()) < 0) {
            session.setAttribute("message", "Dałeś za dużo.");
        }

        return "redirect:/";

    }


}
