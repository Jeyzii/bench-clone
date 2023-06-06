package com.example.bench.bench;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by DL8TIMERPRINTSERVER on 11/30/2017.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imageID;
    public CustomList(Activity context,
                      String[] itemname, Integer[] imageID) {
        super(context, R.layout.mylist, itemname);
        this.context = context;
        this.itemname = itemname;
        this.imageID = imageID;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.mylist, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemname);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView2);
        txtTitle.setText(itemname[position]);

        imageView.setImageResource(imageID[position]);
        return rowView;
    }

}
