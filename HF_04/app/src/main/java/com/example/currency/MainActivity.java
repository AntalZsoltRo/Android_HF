package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Currency> currencyList = new ArrayList<>();
    ListView myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyList.add(new Currency(R.drawable.unio, "EUR", "Euro", 4.4100, 4.5500));
        currencyList.add(new Currency(R.drawable.usa, "USD", "Dolar american", 3.9750, 4.1450));
        currencyList.add(new Currency(R.drawable.uk, "GBP", "Lira sterlina", 6.1250, 6.3550));
        currencyList.add(new Currency(R.drawable.australia, "AUD", "Dolar australian", 2.9600, 3.0600));
        currencyList.add(new Currency(R.drawable.canada, "CAD", "Dolar canadian", 3.0950, 3.2650));
        currencyList.add(new Currency(R.drawable.switzerland, "CHF", "Franc elvetian", 4.2300, 4.3300));
        currencyList.add(new Currency(R.drawable.dania, "DKK", "Coroana daneaza", 0.5850, 0.6150));
        currencyList.add(new Currency(R.drawable.hungary, "HUF", "Forint maghiar", 0.0136, 0.0146));

        myList = findViewById(R.id.myCurrencyList);

        CurrencyAdapter myCustomAdapter = new CurrencyAdapter(this, currencyList);
        myList.setAdapter(myCustomAdapter);

    }
}