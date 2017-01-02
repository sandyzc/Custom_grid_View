package com.sandyz.custom_grid_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.sandyz.custom_grid_view.Adapters.Grid_Adapter;

public class MainActivity extends AppCompatActivity {

    String[] label = {

            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ics",
            "Jelly Bean",
            "Kitkat",
            "Lolipop",
            "Marshmellow",
            "Nougat"
    };
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.grid);
        gridView.setAdapter(new Grid_Adapter(this,label));


    }
}


