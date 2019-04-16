package com.example.portfolio10;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/*
 * Justin Dupre and Brady Goldsworthy
 * Assignment 4
 * Due 4/15/19
 */
public class MainActivity extends Activity {

    private Button daphneBTN, drumBTN, hereBTN, jeebersBTN, scoobyBTN, closingBTN;
    private MediaPlayer daphneMP, graduatedMP, hereMP, jeebersMP, scoobyMP, closingMP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect all buttons
        daphneBTN = findViewById(R.id.daphneButton);
        drumBTN = findViewById(R.id.drumButton);
        hereBTN = findViewById(R.id.hereButton);
        jeebersBTN = findViewById(R.id.jeebersButton);
        scoobyBTN = findViewById(R.id.scoobyButton);
        closingBTN = findViewById(R.id.closingButton);

        //create all media players
        daphneMP = new MediaPlayer();
        daphneMP = MediaPlayer.create(this, R.raw.daphne);
        daphneMP.setLooping(true);

        graduatedMP = new MediaPlayer();
        graduatedMP = MediaPlayer.create(this, R.raw.graduated);
        graduatedMP.setLooping(true);

        hereMP = new MediaPlayer();
        hereMP = MediaPlayer.create(this, R.raw.here);
        hereMP.setLooping(true);

        jeebersMP = new MediaPlayer();
        jeebersMP = MediaPlayer.create(this, R.raw.jeeepers);
        jeebersMP.setLooping(true);

        scoobyMP = new MediaPlayer();
        scoobyMP = MediaPlayer.create(this, R.raw.scooby);
        scoobyMP.setLooping(true);

        closingMP = new MediaPlayer();
        closingMP = MediaPlayer.create(this, R.raw.closing);
        closingMP.setLooping(true);

    } //end onCreate

    //called when user clicks Play Daphne
    public void playDaphne(View view) {
        if (daphneMP.isPlaying()) {
            daphneMP.pause();

            //change button label
            daphneBTN.setText("Play Daphne");
        }
        else {
            if (graduatedMP.isPlaying()) {
                graduatedMP.pause();

                drumBTN.setText("Play Drums");
            }

            if (hereMP.isPlaying()) {
                hereMP.pause();

                hereBTN.setText("Play Drums");
            }

            if (jeebersMP.isPlaying()) {
                jeebersMP.pause();

                jeebersBTN.setText("Play Jeebers");
            }

            if (scoobyMP.isPlaying()) {
                scoobyMP.pause();

                scoobyBTN.setText("Play Scooby");
            }

            if (closingMP.isPlaying()) {
                closingMP.pause();

                closingBTN.setText("Play Closing Credits");
            }


            //play uke
                daphneMP.start();

                daphneBTN.setText("Pause");
        }
    }


    //called when user clicks Play Drums
    public void playDrums(View view) {
        if (graduatedMP.isPlaying()) {
            graduatedMP.pause();

            //change button label
            drumBTN.setText("Play Graduated");
        }
        else {
            if (daphneMP.isPlaying()) {
                daphneMP.pause();

                daphneBTN.setText("Play Daphne");
            }


            if (hereMP.isPlaying()) {
                hereMP.pause();

                hereBTN.setText("Play Here");
            }

            if (jeebersMP.isPlaying()) {
                jeebersMP.pause();

                jeebersBTN.setText("Play Jeebers");
            }

            if (scoobyMP.isPlaying()) {
                scoobyMP.pause();

                scoobyBTN.setText("Play Scooby");
            }

            if (closingMP.isPlaying()) {
                closingMP.pause();

                closingBTN.setText("Play Closing Credits");
            }
            //play drums
            graduatedMP.start();

            drumBTN.setText("Pause");
        }
    }


    //called when user clicks Play Here
    public void playHere(View view) {
        if (hereMP.isPlaying()) {
            hereMP.pause();

            //change button label
            hereBTN.setText("Play Here It Comes");
        }
        else {
            if (daphneMP.isPlaying()) {
                daphneMP.pause();

                daphneBTN.setText("Play Daphne");
            }

            if (graduatedMP.isPlaying()){
                graduatedMP.pause();
                drumBTN.setText("Play Graduated");
            }

            if (jeebersMP.isPlaying()) {
                jeebersMP.pause();

                jeebersBTN.setText("Play Jeebers");
            }

            if (scoobyMP.isPlaying()) {
                scoobyMP.pause();

                scoobyBTN.setText("Play Scooby");
            }

            if (closingMP.isPlaying()) {
                closingMP.pause();

                closingBTN.setText("Play Closing Credits");
            }
            //play drums
            hereMP.start();

            hereBTN.setText("Pause");
        }
    }

    //called when user clicks Play Jeebers
    public void playJeebers(View view) {
        if (jeebersMP.isPlaying()) {
            jeebersMP.pause();

            //change button label
            jeebersBTN.setText("Play Jeebers");
        }
        else {
            if (graduatedMP.isPlaying()) {
                graduatedMP.pause();

                drumBTN.setText("Play Graduated");
            }

            if (hereMP.isPlaying()) {
                hereMP.pause();

                hereBTN.setText("Play Here");
            }

            if (daphneMP.isPlaying()) {
                daphneMP.pause();

                daphneBTN.setText("Play Daphne");
            }

            if (scoobyMP.isPlaying()) {
                scoobyMP.pause();

                scoobyBTN.setText("Play Scooby");
            }

            if (closingMP.isPlaying()) {
                closingMP.pause();

                closingBTN.setText("Play Closing Credits");
            }


            //play uke
            jeebersMP.start();

            jeebersBTN.setText("Pause");
        }
    }


    //called when user clicks Play Scooby
    public void playScooby(View view) {
        if (scoobyMP.isPlaying()) {
            scoobyMP.pause();

            //change button label
            scoobyBTN.setText("Play Scooby");
        }
        else {
            if (graduatedMP.isPlaying()) {
                graduatedMP.pause();

                drumBTN.setText("Play Graduated");
            }

            if (hereMP.isPlaying()) {
                hereMP.pause();

                hereBTN.setText("Play Here");
            }

            if (daphneMP.isPlaying()) {
                daphneMP.pause();

                daphneBTN.setText("Play Daphne");
            }

            if (closingMP.isPlaying()) {
                closingMP.pause();

                closingBTN.setText("Play Closing Credits");
            }


            //play uke
            scoobyMP.start();

            scoobyBTN.setText("Pause");
        }
    }

    //called when user clicks Play Closing
    public void playClosing(View view) {
        if (closingMP.isPlaying()) {
            closingMP.pause();

            //change button label
            closingBTN.setText("Play Closing Credits");
        }
        else {
            if (graduatedMP.isPlaying()) {
                graduatedMP.pause();

                drumBTN.setText("Play Graduated");
            }

            if (hereMP.isPlaying()) {
                hereMP.pause();

                hereBTN.setText("Play Here");
            }

            if (daphneMP.isPlaying()) {
                daphneMP.pause();

                daphneBTN.setText("Play Daphne");
            }


            //play uke
            closingMP.start();

            closingBTN.setText("Pause");
        }
    }


}
