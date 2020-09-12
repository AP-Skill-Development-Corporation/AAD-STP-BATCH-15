package com.example.exampledb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exampledb.Rdb.RTable;
import com.example.exampledb.Rdb.RViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    EditText et,et1,et2;
    public static RViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        et = findViewById(R.id.name);
        et1 = findViewById(R.id.roll);
        et2 = findViewById(R.id.number);
        viewModel = new ViewModelProvider(this).get(RViewModel.class);
        viewModel.readData().observe(this, new Observer<List<RTable>>() {
            @Override
            public void onChanged(List<RTable> rTables) {
                MyAdapter myAdapter = new MyAdapter(MainActivity.this,rTables);
                rv.setAdapter(myAdapter);
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        });
    }

    public void save(View view) {
        RTable rTable = new RTable();
        rTable.setName(et.getText().toString());
        rTable.setRoll(et1.getText().toString());
        rTable.setNumber(et2.getText().toString());
        viewModel.insert(rTable);
        Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
    }
}