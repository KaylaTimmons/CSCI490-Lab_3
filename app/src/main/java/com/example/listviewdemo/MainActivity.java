package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    pivate listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schedule = (ListView) this.findViewById(R.id.class_schedule);
        String[] classes = {"CSCI 114", "CSCI 230", "CSCI 332", "CSCI 370", "MUSC 382", "CSCI 392"};

        ArrayAdapter adapterr = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);

        schedule

    }
}