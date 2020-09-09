package com.example.examplereg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    SharedPreferences preferences;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv = findViewById(R.id.textView);
        preferences = getSharedPreferences("Data",MODE_PRIVATE);
        tv.setText("Welcome "+preferences.getString("name",null));
    }
}