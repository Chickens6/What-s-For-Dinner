package com.example.newnewnewproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    View view;
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
                    Intent i = new Intent(Main3Activity.this, SwipeRight2.class);
                    startActivity(i);
                } else if (x1 > x2) {
                    Intent i = new Intent(Main3Activity.this, SwipeRight2.class);
                    startActivity(i);
                }
                break;

        }
        return true;
    }
}

