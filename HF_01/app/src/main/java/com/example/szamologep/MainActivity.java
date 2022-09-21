package com.example.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int firstNumberInt;
    int secondNumberInt;
    TextView result;
    EditText firstNumberInput;
    EditText secondNumberInput;
    public boolean getNumbers(){

        firstNumberInput = findViewById(R.id.firstNumber);
        secondNumberInput = findViewById(R.id.secondNumber);

        result = findViewById(R.id.result);

        String firstNumberStr = firstNumberInput.getText().toString();
        String secondNumberStr = secondNumberInput.getText().toString();

        if((firstNumberStr.equals(null) && secondNumberStr.equals(null)) || (firstNumberStr.equals("") && secondNumberStr.equals("")) ){
            result.setText("Please enter values!");
            return false;
        }
        else {
            firstNumberInt = Integer.parseInt(firstNumberStr);
            secondNumberInt = Integer.parseInt(secondNumberStr);
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
                    if (getNumbers()){
                        int resultInt = firstNumberInt + secondNumberInt;
                        //String resultStr = String.valueOf(firstNumberInput + secondNumberInput)
                        result.setText(Integer.toString(resultInt));
                    }
                }
            });


    }
}