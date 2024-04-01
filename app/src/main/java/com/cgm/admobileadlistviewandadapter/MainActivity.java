package com.cgm.admobileadlistviewandadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Vietnam", "vn", 98000000);
        Country usa = new Country("United States", "us", 320000000);
        Country russia = new Country("Russia", "ru", 142000000);
        list.add(vietnam); list.add(usa); list.add(russia);

        ListView countryListView = findViewById(R.id.countryListView);

        ArrayAdapter<Country> adapter = new ArrayAdapter<Country>(this,
                android.R.layout.simple_list_item_1, list);

        countryListView.setAdapter(adapter);
    }
}