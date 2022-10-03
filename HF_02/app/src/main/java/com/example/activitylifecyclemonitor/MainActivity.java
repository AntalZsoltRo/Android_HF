package com.example.activitylifecyclemonitor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Status:", "MainActivity: onCreate()");

        Button button1 = findViewById(R.id.firstButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status:", "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status:", "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status:", "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status:", "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status:", "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status:", "MainActivity: onRestart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivity: onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivity: onRestoreInstanceState()");
    }
}