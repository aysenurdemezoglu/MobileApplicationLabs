package com.example.mobilelecture2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private List<Animal> animals;
    private LayoutInflater sInflater;

    public AnimalAdapter(Activity activity, List<Animal> animals) {
        sInflater= (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.animals = animals;
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = sInflater.inflate(R.layout.listview_row, null);
        TextView textview = rowView.findViewById(R.id.label);
        ImageView imageview = rowView.findViewById(R.id.picture);
        Animal animal = animals.get(position);
        textview.setText(animal.getType());
        imageview.setImageResource(animal.getPicId());
        return rowView;
    }
}
