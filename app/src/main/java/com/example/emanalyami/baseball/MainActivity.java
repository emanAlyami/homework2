package com.example.emanalyami.baseball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int fouelA = 0;
    int fouelB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseScoreA(View v) {
        scoreA++;
        displayScoreA(scoreA);

    }

    public void displayScoreA(int totalAScore) {
        TextView scoreAText = (TextView) findViewById(R.id.score);
        scoreAText.setText(String.valueOf(totalAScore));

    }

    public void increaseFouelA(View v) {
        fouelA++;
        displayFouelA(fouelA);

    }

    public void displayFouelA(int totalAFouel) {
        TextView fouelAText = (TextView) findViewById(R.id.fouel);
        fouelAText.setText(String.valueOf(totalAFouel));
    }

    /*
    *For Team B
    */

    public void increaseScoreB(View v) {
        scoreB++;
        displayScoreB(scoreB);

    }

    public void displayScoreB(int totalBScore) {
        TextView scoreBText = (TextView) findViewById(R.id.scoreb);
        scoreBText.setText(String.valueOf(totalBScore));

    }

    public void increaseFouelB(View v) {
        fouelB++;
        displayFouelB(fouelB);

    }

    public void displayFouelB(int totalBFouel) {
        TextView fouelBText = (TextView) findViewById(R.id.fouelb);
        fouelBText.setText(String.valueOf(totalBFouel));
    }

    /*
    Reset All Global Variables
     */

    public void resetAllValues(View v) {
        scoreA = 0;
        scoreB = 0;
        fouelA = 0;
        fouelB = 0;

        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayFouelA(fouelA);
        displayFouelB(fouelB);
    }
}
