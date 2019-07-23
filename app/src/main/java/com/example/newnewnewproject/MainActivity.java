package com.example.newnewnewproject;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD

        view= this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.black);
=======
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.black);
        
>>>>>>> d0bf3547d9106e3d45b9986bd4ca5159d8a486ed
    }
}