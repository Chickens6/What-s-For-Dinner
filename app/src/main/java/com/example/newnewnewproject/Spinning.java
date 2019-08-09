//Code based on: https://www.youtube.com/watch?v=pqM5Usm8djI
//Images for wheel obtained and modified from: https://github.com/CrowniAPIs/libGDX-SpinWheel/blob/master/android/assets/spin_wheel_ui.png

package com.example.newnewnewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    ImageView wheel, selected;
    int number;
    long lngDegree = 0;
    boolean wheelRotation = true;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wheel = findViewById(R.id.wheel);
        selected = findViewById(R.id.selectedChoice);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        number = sharedPreferences.getInt("Int_Number",12);

        wheel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                onClickRotation(view);
                return false;
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation){
        wheelRotation = false;
    }

    @Override
    public void onAnimationEnd(Animation animation){
        Toast toast = Toast.makeText(this,String.valueOf(
                (int) ( ((double) number) - Math.floor( ((double) lngDegree) / (360.0d / ((double) number) )))),0);
        toast.show();
        wheelRotation = true;
    }

    @Override
    public void onAnimationRepeat(Animation animation){

    }

    public void onClickRotation(View view){
        if(wheelRotation){
            int random = new Random().nextInt(360)+3600;
            RotateAnimation rotateAnimation = new RotateAnimation((float) lngDegree,
                    (float) (lngDegree + ((long) random)),
                    1,0.5f,1,0.5f);
            lngDegree = (lngDegree + ((long) random)) % 360;
            rotateAnimation.setDuration((long) random);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setAnimationListener(this);
            wheel.setAnimation(rotateAnimation);
            wheel.startAnimation(rotateAnimation);


        }
    }
}
