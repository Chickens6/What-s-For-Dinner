package com.example.newnewnewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button AMERICAN = findViewById(R.id.button1);
        AMERICAN.setOnClickListener(this);

        Button MEXICAN = findViewById(R.id.button2);
        MEXICAN.setOnClickListener(this);

        Button ITALIAN = findViewById(R.id.button3);
        ITALIAN.setOnClickListener(this);

        Button FRENCH = findViewById(R.id.button4);
        FRENCH.setOnClickListener(this);

        Button CHINESE = findViewById(R.id.button5);
        CHINESE.setOnClickListener(this);

        Button GREEK = findViewById(R.id.button6);
        GREEK.setOnClickListener(this);

    }

    public void onClick(View view){
        int select = view.getId();

        if(select == R.id.button1);
        if(select == R.id.button2);
        if(select == R.id.button3);
        if(select == R.id.button4);
        if(select == R.id.button5);
        if(select == R.id.button6);
    }


}




