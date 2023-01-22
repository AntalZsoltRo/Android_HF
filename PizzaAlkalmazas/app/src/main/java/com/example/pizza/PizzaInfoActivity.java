package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_info);

        Pizza pizza = (Pizza) getIntent().getSerializableExtra("pizza");

        ImageView pizzaImageView = findViewById(R.id.pizza_image_view);
        pizzaImageView.setImageResource(pizza.getImageId());

        TextView nameTextView = findViewById(R.id.name_text_view);
        nameTextView.setText(pizza.getName());


        TextView infoTextView = findViewById(R.id.info_text_view);
        infoTextView.setText(pizza.getInfo());
    }
}
