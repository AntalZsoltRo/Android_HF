package com.example.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    float firstNumberInt;
    float secondNumberInt;
    TextView result;
    EditText firstNumberInput;
    EditText secondNumberInput;

    public boolean getNumbers() {

        firstNumberInput = findViewById(R.id.firstNumber);
        secondNumberInput = findViewById(R.id.secondNumber);

        result = findViewById(R.id.result);

        String firstNumberStr = firstNumberInput.getText().toString();
        String secondNumberStr = secondNumberInput.getText().toString();


        if (firstNumberStr.equals("") && !secondNumberStr.isEmpty()) {
            result.setText("Please enter first value!");
            return false;
        }
        if (secondNumberStr.equals("") && !firstNumberStr.isEmpty()) {
            result.setText("Please enter second number!");
            return false;
        }
        if ((firstNumberStr.equals(null) && secondNumberStr.equals(null)) || (firstNumberStr.equals("") && secondNumberStr.equals(""))) {
            result.setText("Please enter values!");
            return false;
        }
        else {
            firstNumberInt = Float.parseFloat(firstNumberStr);
            secondNumberInt = Float.parseFloat(secondNumberStr);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusButton = findViewById(R.id.plus);
        Button minusButton = findViewById(R.id.minus);
        Button multiButton = findViewById(R.id.multiplication);
        Button divisionButton = findViewById(R.id.division);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    float resultInt = firstNumberInt + secondNumberInt;
                    result.setText(Float.toString(resultInt));
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    float resultInt = firstNumberInt - secondNumberInt;
                    result.setText(Float.toString(resultInt));
                }
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    float resultInt = firstNumberInt * secondNumberInt;
                    result.setText(Float.toString(resultInt));
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    float resultInt = firstNumberInt / secondNumberInt;
                    result.setText(Float.toString(resultInt));
                }
            }
        });

    }
}