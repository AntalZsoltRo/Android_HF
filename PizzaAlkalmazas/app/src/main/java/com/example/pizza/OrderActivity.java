package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    private TextView totalPriceTextView;
    private PizzaAdapter adapter;
    public void onConfirmClicked(View view) {
        Toast.makeText(this, "Order confirmed!", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        totalPriceTextView = findViewById(R.id.total_price_text_view);
        int totalPrice = getIntent().getIntExtra("total_price", 0);
        totalPriceTextView.setText("Total Price: " + totalPrice + " RON");
    }
}
