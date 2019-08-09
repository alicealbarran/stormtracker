package com.ilys.stormtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        View startHighTideButton = findViewById(R.id.startHighTideButton);
        startHighTideButton.setOnClickListener(this::startHighTide);

    }

    public void startHighTide(View v)
    {
        v.setVisibility(View.GONE);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.stormFragment, new HighTide())
                .commit();
    }
}
