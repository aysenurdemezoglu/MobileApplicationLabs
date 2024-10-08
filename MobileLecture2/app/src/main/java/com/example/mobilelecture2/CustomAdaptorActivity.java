package com.example.mobilelecture2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class CustomAdaptorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_adaptor);
        final List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Butterfly", R.drawable.butterflies));
        animals.add(new Animal("Cat", R.mipmap.cat));

        final ListView listView = (ListView) findViewById(R.id.listView);
        AnimalAdapter animalAdapter = new AnimalAdapter(this, animals);
        listView.setAdapter(animalAdapter);

    }
}