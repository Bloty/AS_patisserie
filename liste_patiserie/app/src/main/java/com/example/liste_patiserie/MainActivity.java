package com.example.liste_patiserie;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;



public class MainActivity extends AppCompatActivity {
    ListView vue;

    String[] platforms = {
            "Fondant",
            "Tarte aux fraises",
            "Banana-split",
            "Macarons"
    } ;

    Integer[] images = {
            R.drawable.fondant,
            R.drawable.fraise,
            R.drawable.banana,
            R.drawable.macarons


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vue=(ListView)findViewById(R.id.listView);
        CustomAdapter adapter=new CustomAdapter(MainActivity.this,platforms,images);
        vue.setAdapter(adapter);

    }
}
