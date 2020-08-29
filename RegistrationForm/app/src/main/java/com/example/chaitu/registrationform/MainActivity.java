package com.example.chaitu.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mail,number,pass;
    Spinner sp;
    CheckBox cb,cb1,cb2;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        mail = findViewById(R.id.email);
        number = findViewById(R.id.number);
        pass = findViewById(R.id.pass);
        sp = findViewById(R.id.sp);
        cb = findViewById(R.id.tel);
        cb1 = findViewById(R.id.hin);
        cb2 = findViewById(R.id.eng);
        rg = findViewById(R.id.rg);
    }

    public void save(View view) {
        //Way to read the data from the edittext
        String uname = name.getText().toString();
        String umail = mail.getText().toString();
        String unumber = number.getText().toString();
        String upass = pass.getText().toString();

        //Way to read the data from the spinner
        String branch = sp.getSelectedItem().toString();

        //Way to read the data from radio buttons
        int id = rg.getCheckedRadioButtonId();
        rb = findViewById(id);
        String gender = rb.getText().toString();

        //Way to read the data from checkboxes
        StringBuilder builder = new StringBuilder();
        if (cb.isChecked()){
            builder.append("Telugu \n");
        }
        if (cb1.isChecked()){
            builder.append("Hindi \n");
        }
        if (cb2.isChecked()){
            builder.append("English");
        }
        String lang = builder.toString();

        Toast.makeText(this, uname+"\n"+umail+"\n"
                +unumber+"\n"+branch+"\n"+gender+"\n"+lang, Toast.LENGTH_SHORT).show();

    }
}