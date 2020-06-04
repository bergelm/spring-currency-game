package com.example.demo.model;

public class GameData {

    private String currencySymbol;
    private Double currencyValue;
    private String message;

    public GameData() {
    }

    public GameData(String currencySymbol, Double currencyValue) {
        this.currencySymbol = currencySymbol;
        this.currencyValue = currencyValue;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Double currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GameData{" +
                "currencySymbol='" + currencySymbol + '\'' +
                ", currencyValue='" + currencyValue + '\'' +
                '}';
    }
}
