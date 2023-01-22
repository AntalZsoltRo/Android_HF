package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {
            "Capriciosa",
            "Cheesy Chicken",
            "Chocolato",
            "Greek",
            "Mexicana",
            "Piedone",
            "Popeye",
            "Quattro Formaggi",
            "Regina",
            "Vegan"};
    int[] priceArray = {
            29,
            30,
            25,
            31,
            32,
            29,
            28,
            30,
            29,
            33
    };

    String[] infoArray = {
            "(paradicsomszósz, sonka, gomba, olívabogyó, mozarella) 500g",
            "(paradicsomszósz, csikemell, paradicsom, mozarella) 600g",
            "(csokikrém, banán, mozarella) 450g",
            "(paradicsomszósz, sonka, paprika, hagyma, olivabogyó, bazsalikom, feta, paradicsom, mozarella) 600g",
            "(paradicsomszósz, bolognai szósz, kukorica, bab, chiliszósz, tejföl, mozarella) 700g",
            "(paradicsomszósz, kolbász, szalámi, bab, hagyma, mozarella) 600g",
            "(paradicsomszósz, fokhagymakrém, spenót, fõtt tojás, só, bors, mozarella) 550g",
            "(paradicsomszósz, feta, füstölt sajt, brie, mozarella) 600g",
            "(paradicsomszósz, sonka, szalámi, kukorica, olivabogyó, mozarella) 600g",
            "(paradicsomszósz, gomba, paprika, hagyma, paradicsom, feta, bazsalikom, mozarella) 600g"
    };

    int[] imageArray = {
            R.drawable.capriciosa,
            R.drawable.cheesy_chicken,
            R.drawable.chocolato,
            R.drawable.greek,
            R.drawable.mexicana,
            R.drawable.piedone,
            R.drawable.popeye,
            R.drawable.quattro_formaggi,
            R.drawable.regina,
            R.drawable.vegan
    };

    private RecyclerView recyclerView;
    private PizzaAdapter pizzaAdapter;
    private List<Pizza> pizzaList;
    private Button orderButton;
    private int totalPrice = 0;

    public void onClearClicked(View view) {
        for (Pizza pizza : pizzaList) {
            pizza.setNumber(0);
        }
        pizzaAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaList = new ArrayList<>();

        for (int i = 0; i < nameArray.length; i++) {
            pizzaList.add(new Pizza(nameArray[i], priceArray[i], imageArray[i], infoArray[i]));
        }

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pizzaAdapter = new PizzaAdapter(pizzaList, this, imageArray);

        recyclerView.setAdapter(pizzaAdapter);

        orderButton = findViewById(R.id.order_button);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalPrice = 0;
                for (Pizza pizza : pizzaList) {
                    totalPrice += pizza.getPrice() * pizza.getNumber();
                }
                if (totalPrice > 0){
                    Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                    intent.putExtra("total_price", totalPrice);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Please choose at least one pizza!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}