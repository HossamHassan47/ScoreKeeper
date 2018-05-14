package com.wordpress.hossamhassan47.scorekeeper.activities;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.wordpress.hossamhassan47.scorekeeper.R;
import com.wordpress.hossamhassan47.scorekeeper.fragments.AddNewMatchFragment;
import com.wordpress.hossamhassan47.scorekeeper.fragments.NoticeDialogListener;

public class MainActivity extends AppCompatActivity implements NoticeDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // baseball
        LinearLayout baseball = findViewById(R.id.linear_layout_baseball);
        baseball.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AddNewMatchFragment fragment = new AddNewMatchFragment();
                Bundle bundle = new Bundle();
                bundle.putString("gameType", "baseball");
                fragment.setArguments(bundle);
                fragment.show(getSupportFragmentManager(), "dialog_AddNewMatchFragment");

            }
        });

        // american football
        LinearLayout americanFootball = findViewById(R.id.linear_layout_american_football);
        americanFootball.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AddNewMatchFragment fragment = new AddNewMatchFragment();
                Bundle bundle = new Bundle();
                bundle.putString("gameType", "american_football");
                fragment.setArguments(bundle);
                fragment.show(getSupportFragmentManager(), "dialog_AddNewMatchFragment");
            }
        });

        // football
        LinearLayout football = findViewById(R.id.linear_layout_football);
        football.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AddNewMatchFragment fragment = new AddNewMatchFragment();
                Bundle bundle = new Bundle();
                bundle.putString("gameType", "football");
                fragment.setArguments(bundle);
                fragment.show(getSupportFragmentManager(), "dialog_AddNewMatchFragment");
            }
        });
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {

    }
}
