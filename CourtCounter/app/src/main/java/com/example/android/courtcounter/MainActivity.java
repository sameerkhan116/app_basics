package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */

    public void updateThree(View view) {
        score += 3;
        displayForTeamA(score);
    }

    public void updateTwo(View view) {
        score += 2;
        displayForTeamA(score);
    }

    public void updateFree(View view) {
        score += 1;
        displayForTeamA(score);
    }

    public void updateThreeB(View view) {
        scoreb += 3;
        displayForTeamB(scoreb);
    }

    public void updateTwoB(View view) {
        scoreb += 2;
        displayForTeamB(scoreb);
    }

    public void updateFreeB(View view) {
        scoreb += 1;
        displayForTeamB(scoreb);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        score = 0;
        scoreb = 0;
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
