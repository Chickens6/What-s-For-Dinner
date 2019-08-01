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
    }

    public void onClick(View view){
        int select = view.getId();

        if(select == R.id.button1);

        }

    }




