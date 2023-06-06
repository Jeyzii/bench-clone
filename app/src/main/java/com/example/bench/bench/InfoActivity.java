package com.example.bench.bench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    String a;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        txt = (TextView)findViewById(R.id.infoDetails);
        a= "App name:\nBench \nIDE:\nAndroid Studio\nAndroid Version Compatibility:\nAndroid 5.0 and up\nApp Developer/Designer: \nRomel M. Panganiban\nJuan Carlo D. Bartolome\nAero Salientes" +
                "\nSection/Grade: \nMAWD 201-GR.11 \nSchool: \nSTI COLLEGE SOUTHWOODS \n\nTHIS APP IS MADE FOR PROJECT ONLY \n\n " +
                "This app can help you canvass items you want to buy, by the help of this app you don't need to go out and go to the mall just to see the prices of the items you want" +
                ", you can see the prices of the items by just using " +
                "your phone anywhere anytime. ";
        txt.setText(a);

    }
}
