package com.example.chaitu.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String n = getIntent().getStringExtra("key");
        Toast.makeText(this, "Welcome "+n, Toast.LENGTH_SHORT).show();
    }
}