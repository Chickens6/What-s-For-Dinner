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
        String text = "<font color=#a52900>W</font><font color=#008b68>H</font><font color=#ffd53f>A</font><font color=#d3b766>T</font><font color=#a52900>'</font><font color=#008b68>S</font> </font><font color=#ffd53f>F</font><font color=#d3b766>O</font><font color=#a52900>R</font>" ;
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





