package com.wordpress.hossamhassan47.scorekeeper.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.wordpress.hossamhassan47.scorekeeper.R;

public class AddNewMatchFragment extends DialogFragment {

    NoticeDialogListener mListener;
    String strGameType;
    EditText txtTeamA;
    EditText txtTeamB;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mListener = (NoticeDialogListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement NoticeDialogListener");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_add_new_match, null);

        strGameType = getArguments().getString("gameType");

        // Team A
        txtTeamA = view.findViewById(R.id.edit_text_team_a);

        // Team B
        txtTeamA = view.findViewById(R.id.edit_text_team_b);

        builder.setTitle(getResources().getString(R.string.dialog_team_details))
                .setView(view)
                .setPositiveButton(getResources().getString(R.string.dialog_ok), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        String teamA = txtTeamA.getText().toString();
                        String teamB = txtTeamB.getText().toString();

                        if (teamA == null || teamA.isEmpty()) {
                            Toast.makeText(getActivity(), "Please enter Team A.", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if (teamB == null || teamB.isEmpty()) {
                            Toast.makeText(getActivity(), "Please enter Team B.", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if (strGameType == "baseball") {

                        } else if (strGameType == "american_football") {

                        } else if (strGameType == "football") {

                        }

                        //Intent i = new Intent(MainActivity.this, CupsActivity.class);
                        //startActivity(i);

                        // Send the positive button event back to the host activity
                        Toast.makeText(getActivity(), strGameType, Toast.LENGTH_SHORT).show();

                        mListener.onDialogPositiveClick(AddNewMatchFragment.this);
                    }
                })
                .setNegativeButton(getResources().getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        AddNewMatchFragment.this.getDialog().cancel();
                    }
                });

        // Create the AlertDialog object and return it
        return builder.create();
    }
}
