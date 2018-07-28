package com.example.abhishekkumar.usinglistviewlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] arry = {"Andriod","iphone","HTC","Samsung","Blackbery","iOS","LG","Motorola","Mi","Oneplus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adptr = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arry);
        ListView listView = (ListView) findViewById(R.id.LV);
        listView.setAdapter(adptr);
    }
}
