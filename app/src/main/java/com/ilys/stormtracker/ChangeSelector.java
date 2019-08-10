package com.ilys.stormtracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ChangeSelector extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.change_selector_layout, container, false);

        View manaCost = root.findViewById(R.id.one);
        manaCost.setOnClickListener(v -> clicked(1));

        return root;
    }

    public void clicked(int i)
    {
        getTargetFragment()
                .onActivityResult(getTargetRequestCode(), Activity.RESULT_OK, new Intent().putExtra("CHANGE",i));
    }


}
