package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView=findViewById(R.id.list);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> friendlist=new ArrayList<String>();
        friendlist.add("Ahmed");
        friendlist.add("Saad");
        friendlist.add("Anns");
        friendlist.add("DAR");
        friendlist.add("Adil");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendlist);
        listView.setAdapter(arrayAdapter);
    }
}