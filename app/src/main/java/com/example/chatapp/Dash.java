package com.example.chatapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.annotations.Nullable;

public class Dash extends Fragment {

    CardView TechM;
    CardView Vacubluery;

    public Dash() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_dash, container, false);

        CardView TechM = (CardView) v.findViewById(R.id.Tech_mag);
        CardView Vacubulery = (CardView) v.findViewById(R.id.Card_Vacublery);

        TechM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), com.example.chatapp.Sholk.class);
                i.putExtra("some", "somedata");
                startActivity(i);
            }
        });
        Vacubulery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), com.example.chatapp.Vacubulery.class);
                i.putExtra("some", "somedata");
                startActivity(i);

            }
        });
        return v;
    }
}