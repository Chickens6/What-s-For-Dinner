package com.example.newnewnewproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    View view;
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.black);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.black);

        TextView textView = (TextView) findViewById(R.id.textView);
        String text = "<font color=#ff0000>W</font><font color=#ff8500>H</font><font color=#ffff00>A</font><font color=#00ff00>T</font><font color=#113dff>'</font><font color=#3676e8>S</font> </font><font color=#cd00cd>F</font><font color=#7802ff>O</font><font color=#ff69b4>R</font>" ;
        textView.setText(Html.fromHtml(text));





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
                    Intent i = new Intent(MainActivity.this, SwipeLeft.class);
                    startActivity(i);

                } else if (x1 > x2) {
                    Intent i = new Intent(MainActivity.this, SwipeRight.class);
                    startActivity(i);
                }
                break;
        }
        return true;
    }



}





