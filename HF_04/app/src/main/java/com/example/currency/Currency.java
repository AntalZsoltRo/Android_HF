package com.example.currency;

public class Currency {
    private Integer image;
    private String shortCurrency;
    private String currency;
    private double buyPrice;
    private double sellPrice;

    public Currency(Integer image, String shortCurrency, String currency, double buyValue, double sellValue) {
        this.image = image;
        this.shortCurrency = shortCurrency;
        this.currency = currency;
        this.buyPrice = buyValue;
        this.sellPrice = sellValue;
    }

    public Integer getImage() {
        return image;
    }

    public String getShortCurrency() {
        return shortCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}