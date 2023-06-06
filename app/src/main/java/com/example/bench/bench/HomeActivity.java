package com.example.bench.bench;




import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;




public class HomeActivity extends AppCompatActivity {

    ListView lv;
    ImageButton floatButton;

    public static String item = "";

    String[] itemname = {
            "Shirt",
            "Short",
            "Sandals",
            "Skirt",
            "Shoes",
            "Belt",
            "Pants",
            "UnderWear",
            "Jacket",
    };

    Integer[] imageID = {
            R.drawable.shirt,
            R.drawable.shortss,
            R.drawable.sandals,
            R.drawable.skirt,
            R.drawable.shoes,
            R.drawable.belt,
            R.drawable.pants,
            R.drawable.underwear,
            R.drawable.jacket,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lv = (ListView) findViewById(R.id.ListView);


        Arrays.sort(itemname);
        Arrays.sort(imageID);


        CustomList adapter = new CustomList(HomeActivity.this, itemname, imageID);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String itemChosen = (String) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(HomeActivity.this, Items.class);
                item = ""+itemChosen;
                intent.putExtra("ItemList", itemChosen);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"Clicked " +itemChosen,Toast.LENGTH_LONG).show();
                finish();
            }
        });


        floatButton = (ImageButton)findViewById(R.id.imageButton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Directed to app information", Toast.LENGTH_LONG).show();
                Intent z = new Intent(HomeActivity.this, InfoActivity.class);
                startActivity(z);
            }
        });

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
