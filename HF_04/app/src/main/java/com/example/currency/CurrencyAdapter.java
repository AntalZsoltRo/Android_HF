package com.example.currency;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CurrencyAdapter extends ArrayAdapter {
    private Activity context;
    private ArrayList<Currency> myCurrencyList;

    public CurrencyAdapter(Activity context, ArrayList<Currency> myCurrencyList) {
        super(context,R.layout.list_item, myCurrencyList);
        this.context = context;
        this.myCurrencyList = myCurrencyList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        ImageView flag = rowView.findViewById(R.id.flagView);
        TextView shortCurrencyName = rowView.findViewById(R.id.shortCurrencyNameView);
        TextView currencyName = rowView.findViewById(R.id.currencyNameView);
        TextView buy = rowView.findViewById(R.id.buyView);
        TextView sell = rowView.findViewById(R.id.sellView);
        TextView buyPrice = rowView.findViewById(R.id.buyPriceView);
        TextView sellPrice = rowView.findViewById(R.id.sellPriceView);

        flag.setImageResource(myCurrencyList.get(position).getImage());
        shortCurrencyName.setText(myCurrencyList.get(position).getShortCurrency());
        currencyName.setText(myCurrencyList.get(position).getCurrency());
        buy.setText("Cumpara");
        sell.setText("Vinde");
        buyPrice.setText(String.format("%.4f RON", myCurrencyList.get(position).getBuyPrice()));
        sellPrice.setText(String.format("%.4f RON", myCurrencyList.get(position).getSellPrice()));

        return rowView;
    }
}
