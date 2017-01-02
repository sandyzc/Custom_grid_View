package com.sandyz.custom_grid_view.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sandyz.custom_grid_view.R;


public class Grid_Adapter extends BaseAdapter {

    Context context;
    private String[] gridvalue;

    public Grid_Adapter(Context context, String[] gridvalue) {
        this.context = context;
        this.gridvalue = gridvalue;
    }

    @Override
    public int getCount() {
        return gridvalue.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View gridview;

        if (convertView == null){

            gridview = new View(context);
            // get layout
            gridview = inflater.inflate(R.layout.grid_list,null);
            // set text
            TextView textView = (TextView)gridview.findViewById(R.id.label);
            textView.setText(gridvalue[position]);
            // set image
            ImageView imageView = (ImageView)gridview.findViewById(R.id.img);

            String label = gridvalue[position];
            if (label.equals("Cupcake")){
                imageView.setImageResource(R.drawable.image1);
            }
            else if (label.equals("Donut")){
                imageView.setImageResource(R.drawable.image2);
            }
            else if (label.equals("Eclair")){
                imageView.setImageResource(R.drawable.image3);
            }
            else if (label.equals("Froyo")){
                imageView.setImageResource(R.drawable.image4);
            }
            else if (label.equals( "Gingerbread")){
                imageView.setImageResource(R.drawable.image5);
            }
            else if (label.equals("Honeycomb")){
                imageView.setImageResource(R.drawable.image6);
            }
            else if (label.equals("Ics")){
                imageView.setImageResource(R.drawable.image7);
            }
            else if (label.equals(
                    "Jelly Bean")){
                imageView.setImageResource(R.drawable.image8);
            }
            else if (label.equals(
                    "Kitkat")){
                imageView.setImageResource(R.drawable.image11);
            }
            else if (label.equals(
                    "Lolipop")){
                imageView.setImageResource(R.drawable.image10);
            }
            else if (label.equals(
                    "Marshmellow"
                    )){
                imageView.setImageResource(R.drawable.image12);

            }
            else if (label.equals("Nougat")){
                imageView.setImageResource(R.drawable.image13);
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);



        }
        else {

            gridview = convertView;
        }


        return gridview;
    }
}
