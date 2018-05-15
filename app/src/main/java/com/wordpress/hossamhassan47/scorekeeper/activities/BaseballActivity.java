package com.wordpress.hossamhassan47.scorekeeper.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wordpress.hossamhassan47.scorekeeper.R;
import com.wordpress.hossamhassan47.scorekeeper.fragments.AddNewMatchFragment;

public class BaseballActivity extends AppCompatActivity {

    String teamAName;
    String teamBName;

    int teamAScoreRuns = 0;
    int teamAScoreOuts = 0;

    int teamBScoreRuns = 0;
    int teamBScoreOuts = 0;

    TextView txtTeamAScoreRuns;
    TextView txtTeamBScoreRuns;
    TextView txtTeamAScoreOuts;
    TextView txtTeamBScoreOuts;

    TextView txtTeamAName;
    TextView txtTeamBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);
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
        txtTeamAScoreRuns = findViewById(R.id.text_view_team_a_score_runs);
        txtTeamAScoreRuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreRuns++;
                txtTeamAScoreRuns.setText(teamAScoreRuns + "");
            }
        });

        // Team B Score Rums
        txtTeamBScoreRuns = findViewById(R.id.text_view_team_b_score_runs);
        txtTeamBScoreRuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreRuns++;
                txtTeamBScoreRuns.setText(teamBScoreRuns + "");
            }
        });

        // Team A Score Outs
        txtTeamAScoreOuts = findViewById(R.id.text_view_team_a_score_outs);
        txtTeamAScoreOuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreOuts++;
                txtTeamAScoreOuts.setText(teamAScoreOuts + "");
            }
        });

        // Team B Score Outs
        txtTeamBScoreOuts = findViewById(R.id.text_view_team_b_score_outs);
        txtTeamBScoreOuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreOuts++;
                txtTeamBScoreOuts.setText(teamBScoreOuts + "");
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
        teamAScoreOuts = 0;
        teamAScoreRuns = 0;
        teamBScoreOuts = 0;
        teamBScoreRuns = 0;

        txtTeamAScoreRuns.setText("0");
        txtTeamAScoreOuts.setText("0");
        txtTeamBScoreRuns.setText("0");
        txtTeamBScoreOuts.setText("0");
    }
}
