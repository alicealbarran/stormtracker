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

        View changeOne = root.findViewById(R.id.change1);
        changeOne.setOnClickListener(v -> clicked(-1));

        View changeTwo= root.findViewById(R.id.change2);
        changeTwo.setOnClickListener(v -> clicked(-2));

        View changeThree = root.findViewById(R.id.change3);
        changeThree.setOnClickListener(v -> clicked(-3));

        View changeFour = root.findViewById(R.id.change4);
        changeFour.setOnClickListener(v -> clicked(-4));

        View changeFive = root.findViewById(R.id.change5);
        changeFive.setOnClickListener(v -> clicked(-5));

        View changeSix= root.findViewById(R.id.change6);
        changeSix.setOnClickListener(v -> clicked(-6));

        View changeSeven = root.findViewById(R.id.change7);
        changeSeven.setOnClickListener(v -> clicked(-7));

        View changeEight= root.findViewById(R.id.change8);
        changeEight.setOnClickListener(v -> clicked(-8));

        View changeZero= root.findViewById(R.id.change0);
        changeZero.setOnClickListener(v -> clicked(0));

        return root;
    }

    public void clicked(int i)
    {
        getTargetFragment()
                .onActivityResult(getTargetRequestCode(), Activity.RESULT_OK, new Intent().putExtra("CHANGE",i));
    }


}
