package com.example.portfolio10;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Justin Dupre and Brady Goldsworthy
 * Assignment 4
 * Due 4/15/19
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Create the TimerTask
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //finish the activity
                finish();

                //Go to MainActivity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        };

        //Timer Object
        Timer timer = new Timer();

        timer.schedule(task, 3000);

    }//End onCreate



}
