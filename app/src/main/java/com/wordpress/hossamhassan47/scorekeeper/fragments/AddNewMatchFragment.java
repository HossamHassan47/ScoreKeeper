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
import android.widget.Toast;

import com.wordpress.hossamhassan47.scorekeeper.R;

public class AddNewMatchFragment extends DialogFragment {

    NoticeDialogListener mListener;
    String strGameType;


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

        // Player 1
        //spinnerPlayer1 = view.findViewById(R.id.spinner_player_1);

        builder.setTitle(getResources().getString(R.string.dialog_team_details))
                .setView(view)
                .setPositiveButton(getResources().getString(R.string.dialog_ok), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        //Player selectedPlayer1 = (Player) spinnerPlayer1.getSelectedItem();
                        //Player selectedPlayer2 = (Player) spinnerPlayer2.getSelectedItem();

//                        if (selectedPlayer1.playerId == selectedPlayer2.playerId) {
//                            Toast.makeText(getActivity(), "Players should be different, try again.", Toast.LENGTH_SHORT).show();
//                            return;
//                        }

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
