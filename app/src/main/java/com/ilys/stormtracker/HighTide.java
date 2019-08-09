package com.ilys.stormtracker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class HighTide extends Fragment {

    TextView stormCountView, manaCountView, highTideCountView;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root =inflater.inflate(R.layout.high_tide_layout, container, false);

        stormCountView = root.findViewById(R.id.stormCount);
        manaCountView = root.findViewById(R.id.manaCount);
        highTideCountView = root.findViewById(R.id.highTideCount);
        highTideCountView.setText("1");

        View stormButtonView = root.findViewById(R.id.stormButton);
        stormButtonView.setOnClickListener(v -> stormButtonClicked());
        View manaButtonView = root.findViewById(R.id.manaButton);
        manaButtonView.setOnClickListener(v -> manaButtonClicked());


        View stormButtonPlusView=root.findViewById(R.id.stormButtonPlus);
        stormButtonPlusView.setOnClickListener(v -> adjustStormCount(1));
        View stormButtonMinusView=root.findViewById(R.id.stormButtonMinus);
        stormButtonMinusView.setOnClickListener(v -> adjustStormCount(-1));

        View manaButtonPlusView = root.findViewById(R.id.manaButtonPlus);
        manaButtonPlusView.setOnClickListener(v -> adjustManaCount(1));
        View manaButtonMinusView = root.findViewById(R.id.manaButtonMinus);
        manaButtonMinusView.setOnClickListener(v -> adjustManaCount(-1));

        View highTideButtonPlusView = root.findViewById(R.id.highTideButtonPlus);
        highTideButtonPlusView.setOnClickListener(v -> adjustHighTideCount(1));
        View highTideButtonMinusView = root.findViewById(R.id.highTideButtonMinus);
        highTideButtonMinusView.setOnClickListener(v -> adjustHighTideCount(-1));








        return root;
    }

    public void stormButtonClicked()
    {
        adjustStormCount(1);
    }

    public void manaButtonClicked()
    {
        String highTideCountString = (String)highTideCountView.getText();
        int highTideCountInt = Integer.parseInt(highTideCountString);
        String manaCountString = (String)manaCountView.getText();
        int manaCountInt = Integer.parseInt(manaCountString);
        manaCountInt+=highTideCountInt;

        manaCountView.setText(""+manaCountInt);
    }

    public void adjustHighTideCount(int i)
    {
        String s = (String)highTideCountView.getText();
        int count = Integer.parseInt(s);
        count+=1;
        highTideCountView.setText(""+count);
    }

    public void adjustStormCount(int i)
    {
        String s = (String)stormCountView.getText();
        int count = Integer.parseInt(s);
        count+=i;
        stormCountView.setText(""+count);
    }
    public void adjustManaCount(int i)
    {
        String s = (String)manaCountView.getText();
        int count = Integer.parseInt(s);
        count+=i;
        manaCountView.setText(""+count);
    }
}
