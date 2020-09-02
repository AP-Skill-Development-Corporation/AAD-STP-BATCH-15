package com.example.chaitu.examplerecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String name[] = {"Alpha","Beta","Cupcake","Donut","Eclairs",
            "Froyo","GingerBread","HoneyComb","Ice-Cream","JellyBean"};
    int image[] = {R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,
    R.drawable.donut,R.drawable.eclairs,R.drawable.froyo,R.drawable.gingerbread
    ,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        MyAdapter adapter = new MyAdapter(this,name,image);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}