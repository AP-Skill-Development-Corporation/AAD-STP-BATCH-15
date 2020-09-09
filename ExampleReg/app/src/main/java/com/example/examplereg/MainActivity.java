package com.example.examplereg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mail,pass;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        preferences = getSharedPreferences("Data",MODE_PRIVATE);
        if (preferences.contains("mail")&preferences.contains("pass"))
        {
            startActivity(new Intent(this,HomeActivity.class));
            finish();
        }
    }

    public void login(View view) {
        String umail = mail.getText().toString();
        String upass = pass.getText().toString();
       // String m = preferences.getString("mail",null);
        if (umail.isEmpty()|upass.isEmpty()){
            Toast.makeText(this, "fill all the details", Toast.LENGTH_SHORT).show();
        }
        else if (umail.equals(preferences.getString("mail",null))&
                upass.equals(preferences.getString("pass",null))){
            startActivity(new Intent(this,HomeActivity.class));
            finish();
        }else{
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        startActivity(new Intent(this,RegisterActivity.class));
    }
}