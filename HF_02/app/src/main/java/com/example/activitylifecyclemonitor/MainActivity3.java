package com.example.activitylifecyclemonitor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Status:", "MainActivityThree: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status:", "MainActivityThree: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status:", "MainActivityThree: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status:", "MainActivityThree: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status:", "MainActivityThree: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status:", "MainActivityThree: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status:", "MainActivityThree: onRestart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivityThree: onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Status:", "MainActivityThree: onRestoreInstanceState()");
    }
}