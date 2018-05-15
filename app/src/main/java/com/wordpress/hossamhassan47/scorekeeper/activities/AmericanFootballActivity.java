package com.wordpress.hossamhassan47.scorekeeper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.hossamhassan47.scorekeeper.R;

public class AmericanFootballActivity extends AppCompatActivity {

    String teamAName;
    String teamBName;

    int teamAScore = 0;

    int teamBScore = 0;

    TextView txtTeamAScore;
    TextView txtTeamBScore;

    TextView txtTeamAName;
    TextView txtTeamBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_football);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set Team A Name
        teamAName = getIntent().getExtras().getString("teamA");
        txtTeamAName = findViewById(R.id.text_view_team_a_name);
        txtTeamAName.setText(teamAName);

        // Set Team B Name
        teamBName = getIntent().getExtras().getString("teamB");
        txtTeamBName = findViewById(R.id.text_view_team_b_name);
        txtTeamBName.setText(teamBName);

        // Team A Score Rums
        txtTeamAScore = findViewById(R.id.text_view_team_a_score_runs);
        txtTeamAScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore++;
                txtTeamAScore.setText(teamAScore + "");
            }
        });

        // Team B Score Rums
        txtTeamBScore = findViewById(R.id.text_view_team_b_score_runs);
        txtTeamBScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore++;
                txtTeamBScore.setText(teamBScore + "");
            }
        });

        // Score Points for Team A
        ImageView btnPointsA6 = findViewById(R.id.image_view_points_a_6);
        btnPointsA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 6;
                txtTeamAScore.setText(teamAScore + "");
            }
        });

        ImageView btnPointsA3 = findViewById(R.id.image_view_points_a_3);
        btnPointsA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 3;
                txtTeamAScore.setText(teamAScore + "");
            }
        });

        ImageView btnPointsA2 = findViewById(R.id.image_view_points_a_2);
        btnPointsA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 2;
                txtTeamAScore.setText(teamAScore + "");
            }
        });

        ImageView btnPointsA1 = findViewById(R.id.image_view_points_a_1);
        btnPointsA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 1;
                txtTeamAScore.setText(teamAScore + "");
            }
        });

        // Score Points for Team B
        ImageView btnPointsB6 = findViewById(R.id.image_view_points_b_6);
        btnPointsB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 6;
                txtTeamBScore.setText(teamBScore + "");
            }
        });

        ImageView btnPointsB3 = findViewById(R.id.image_view_points_b_3);
        btnPointsB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 3;
                txtTeamBScore.setText(teamBScore + "");
            }
        });

        ImageView btnPointsB2 = findViewById(R.id.image_view_points_b_2);
        btnPointsB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 2;
                txtTeamBScore.setText(teamBScore + "");
            }
        });

        ImageView btnPointsB1 = findViewById(R.id.image_view_points_b_1);
        btnPointsB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 1;
                txtTeamBScore.setText(teamBScore + "");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_reset) {
            Reset();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void Reset() {
        teamAScore = 0;
        teamBScore = 0;

        txtTeamAScore.setText("0");
        txtTeamBScore.setText("0");
    }

}
