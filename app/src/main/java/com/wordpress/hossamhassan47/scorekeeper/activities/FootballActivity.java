package com.wordpress.hossamhassan47.scorekeeper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.wordpress.hossamhassan47.scorekeeper.R;

public class FootballActivity extends AppCompatActivity {

    String teamAName;
    String teamBName;

    int teamAScoreGoals = 0;
    int teamAScoreFouls = 0;

    int teamBScoreGoals = 0;
    int teamBScoreFouls = 0;

    TextView txtTeamAScoreGoals;
    TextView txtTeamBScoreGoals;
    TextView txtTeamAScoreFouls;
    TextView txtTeamBScoreFouls;

    TextView txtTeamAName;
    TextView txtTeamBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
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
        txtTeamAScoreGoals = findViewById(R.id.text_view_team_a_score_goals);
        txtTeamAScoreGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreGoals++;
                txtTeamAScoreGoals.setText(teamAScoreGoals + "");
            }
        });

        // Team B Score Rums
        txtTeamBScoreGoals = findViewById(R.id.text_view_team_b_score_goals);
        txtTeamBScoreGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreGoals++;
                txtTeamBScoreGoals.setText(teamBScoreGoals + "");
            }
        });

        // Team A Score Outs
        txtTeamAScoreFouls = findViewById(R.id.text_view_team_a_score_fouls);
        txtTeamAScoreFouls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreFouls++;
                txtTeamAScoreFouls.setText(teamAScoreFouls + "");
            }
        });

        // Team B Score Outs
        txtTeamBScoreFouls = findViewById(R.id.text_view_team_b_score_fouls);
        txtTeamBScoreFouls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreFouls++;
                txtTeamBScoreFouls.setText(teamBScoreFouls + "");
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
        teamAScoreFouls = 0;
        teamAScoreGoals = 0;
        teamBScoreFouls = 0;
        teamBScoreGoals = 0;

        txtTeamAScoreGoals.setText("0");
        txtTeamAScoreFouls.setText("0");
        txtTeamBScoreGoals.setText("0");
        txtTeamBScoreFouls.setText("0");
    }

}
