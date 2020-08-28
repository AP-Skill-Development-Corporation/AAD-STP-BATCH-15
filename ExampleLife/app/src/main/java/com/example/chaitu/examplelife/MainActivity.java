package com.example.chaitu.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Apssdc","Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Apssdc","Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Apssdc","Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Apssdc","Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Apssdc","Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Apssdc","Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Apssdc","Activity Destroyed");
    }
}