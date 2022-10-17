package com.example.tablelayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Product {
    String code;
    String name;
    float price;

    @Override
    public String toString() {
        return "\nCode: " + code +
                "\nName: " + name +
                "\nPrice: " + price + "\n";
    }

    public Product(String code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}

public class MainActivity extends AppCompatActivity {

    TextView codeTxt;
    TextView nameTxt;
    TextView priceTxt;
    TextView resultTxt;
    ArrayList<Product> products = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cancelBtn = findViewById(R.id.cancelButton);
        Button addBtn = findViewById(R.id.addButton);
        Button showBtn = findViewById(R.id.showButton);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeTxt.setText("");
                nameTxt.setText("");
                priceTxt.setText("");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    codeTxt = findViewById(R.id.prodCodeInp);
                    nameTxt = findViewById(R.id.prodNameInp);
                    priceTxt = findViewById(R.id.prodPriceInp);

                    String code = codeTxt.getText().toString();
                    String name = nameTxt.getText().toString();
                    String price = priceTxt.getText().toString();
                    float priceNum = Float.parseFloat(price);
                    products.add(new Product(code,name,priceNum));
                    codeTxt.setText("");
                    nameTxt.setText("");
                    priceTxt.setText("");
                    Toast.makeText(getApplicationContext(), "Product added succesfully!", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error while adding product!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt = findViewById(R.id.result);
                resultTxt.setText("Products:" + products);
            }
        });
    }
}