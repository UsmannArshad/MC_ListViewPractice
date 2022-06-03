package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
EditText editText;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
        editText=findViewById(R.id.entertask);
        btn=findViewById(R.id.button);

        ArrayList<String> friendlist=new ArrayList<String>();
        friendlist.add("Ahmed");
        friendlist.add("Saad");
        friendlist.add("Anns");
        friendlist.add("DAR");
        friendlist.add("Adil");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendlist);
        listView.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            friendlist.add(editText.getText().toString());
            arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}