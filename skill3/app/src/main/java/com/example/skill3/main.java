package com.example.skill3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class main extends AppCompatActivity {
    ArrayList<recyclerview_list> recyclerview_list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerview_list= new ArrayList<recyclerview_list>();
        recyclerview_list.add(new recyclerview_list(R.drawable.ic_launcher_foreground,"math"));
        recyclerview_adapter recyclerview_adapter = new recyclerview_adapter(recyclerview_list,this);
        recyclerView.setAdapter(recyclerview_adapter);
    }
}