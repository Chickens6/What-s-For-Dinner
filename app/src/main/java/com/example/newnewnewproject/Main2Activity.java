package com.example.newnewnewproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    View view;
    float x1, x2, y1, y2;

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

        if(select == R.id.button1)
            Food.typeFood = "American";
        else if(select == R.id.button2)
            Food.typeFood = "Mexican";
        else if(select == R.id.button3)
            Food.typeFood = "Italian";
        else if(select == R.id.button4)
            Food.typeFood = "French";
        else if(select == R.id.button5)
            Food.typeFood = "Chinese";
        else if(select == R.id.button6)
            Food.typeFood = "Greek";
        Intent intent = new Intent(this,Another.class);
        startActivity(intent);
    }





    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);

        //public boolean onTouchEvent (MotionEvent touchEvent){
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                if (x1 < x2) {
                    Intent i = new Intent(Main2Activity.this, SwipeRight2.class);
                    startActivity(i);
                } else if (x1 > x2) {
                    Intent i = new Intent(Main2Activity.this, SwipeRight2.class);
                    startActivity(i);
                }
                break;
        }
        return true;
    }
}


