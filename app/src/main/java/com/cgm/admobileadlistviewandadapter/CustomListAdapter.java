package com.cgm.admobileadlistviewandadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<Country> countryListData;
    private Context context;

    private LayoutInflater layoutInflater;

    public CustomListAdapter(List<Country> countryListData, Context context) {
        this.countryListData = countryListData;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countryListData.size();
    }

    @Override
    public Object getItem(int position) {
        return countryListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //@SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.list_item_layout, null);

        TextView countryNameView = convertView.findViewById(R.id.textView_countryName);
        TextView populationView = convertView.findViewById(R.id.textView_population);

        Country country = this.countryListData.get(position);
        countryNameView.setText(country.getCountryName());
        populationView.setText("Population: " + country.getPopulation());

        return convertView;
    }
}
