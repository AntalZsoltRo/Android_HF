package com.example.activitylifecyclemonitor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Status:", "MainActivityTwo: onCreate()");

        Button button2 = findViewById(R.id.secondButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status:", "MainActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status:", "MainActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status:", "MainActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status:", "MainActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status:", "MainActivityTwo: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status:", "MainActivityTwo: onRestart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivityTwo: onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivityTwo: onRestoreInstanceState()");
    }
}