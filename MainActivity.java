package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<contact>arrContact = new ArrayList<>();
        contact contact1 = new contact("Trinh Duc Manh", "A40239", "Light");
        contact contact2 = new contact("Hoang D", "AJkih", "Black");
        arrContact.add(contact1);
        arrContact.add(contact2);

        customadapter adapter = new customadapter(this,R.layout.item_listview,arrContact);
        lvContact.setAdapter(adapter);
    }
}