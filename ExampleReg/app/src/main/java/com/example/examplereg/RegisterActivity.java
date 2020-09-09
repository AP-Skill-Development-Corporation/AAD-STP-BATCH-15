package com.example.examplereg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText email,pass,name;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        name = findViewById(R.id.name);
        preferences = getSharedPreferences("Data",MODE_PRIVATE);
    }

    public void register(View view) {
        String umail = email.getText().toString();
        String uname = name.getText().toString();
        String upass = pass.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("mail",umail);
        editor.putString("name",uname);
        editor.putString("pass",upass);
        editor.commit();
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
    }

    public void login(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}