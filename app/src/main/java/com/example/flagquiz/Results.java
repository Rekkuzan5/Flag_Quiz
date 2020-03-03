package com.example.flagquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView resultsText;
    public int amountCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent mIntent =  getIntent();
        amountCorrect = mIntent.getIntExtra("score", 0);

        getResults();
    }

    private void getResults() {
        //int result = amountCorrect * 10;
        resultsText = findViewById(R.id.viewResults);
        resultsText.setText("Your Score is: \n" + amountCorrect + " out of 10");

        if (amountCorrect >= 7) {
            MediaPlayer mediaPlayer= MediaPlayer.create(Results.this,R.raw.applause4);
            mediaPlayer.start();
        }
        else {
            MediaPlayer mediaPlayer= MediaPlayer.create(Results.this,R.raw.boo3);
            mediaPlayer.start();
        }
    }
}
