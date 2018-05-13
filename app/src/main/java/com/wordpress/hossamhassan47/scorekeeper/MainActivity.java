package com.wordpress.hossamhassan47.scorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btnAmericanFootball = findViewById(R.id.button_american_football);
        //btnAmericanFootball.getBackground().setAlpha(50);

        // baseball
        LinearLayout baseball = findViewById(R.id.linear_layout_baseball);
        baseball.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Baseball", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(MainActivity.this, CupsActivity.class);
                //startActivity(i);
            }
        });

        // american football
        LinearLayout americanFootball = findViewById(R.id.linear_layout_american_football);
        americanFootball.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "American Football", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(MainActivity.this, CupsActivity.class);
                //startActivity(i);
            }
        });

        // football
        LinearLayout football = findViewById(R.id.linear_layout_football);
        football.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Football", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(MainActivity.this, CupsActivity.class);
                //startActivity(i);
            }
        });
    }
}
