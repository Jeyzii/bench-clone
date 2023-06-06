package com.example.bench.bench;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Objects;

public class ItemDetails extends AppCompatActivity {

    ImageView img;
    TextView textView;
    TextView txtPrices;
    TextView txtDet;
    TextView txtInf;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);



        img = (ImageView) findViewById(R.id.imageView4);
        textView = (TextView) findViewById(R.id.textView2);
        txtPrices = (TextView) findViewById(R.id.txtPricess);
        txtDet = (TextView) findViewById(R.id.txtDetails);
        txtInf = (TextView) findViewById(R.id.txtInfo);

        Intent i = getIntent();
        String name = i.getStringExtra("Itemname");
        int itemImage = i.getIntExtra("itemImage",0);
        String itemPrices = i.getStringExtra("itemPrice");
        String itemDetail = i.getStringExtra("itemDetails");
        String txtInfos = i.getStringExtra("itemInfos1");

        textView.setText(name);
        img.setImageResource(itemImage);
        txtPrices.setText(itemPrices);
        txtDet.setText(itemDetail);
        txtInf.setText(txtInfos);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Items.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }

}
