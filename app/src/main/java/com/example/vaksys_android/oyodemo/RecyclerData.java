package com.example.vaksys_android.oyodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerData extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList textList = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_data);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_inner_data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerDataAdapter recyclerDataAdapter = new RecyclerDataAdapter(RecyclerData.this,textList);
        recyclerView.setAdapter(recyclerDataAdapter);



    }
}
