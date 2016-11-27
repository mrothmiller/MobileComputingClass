package com.example.maurice.exsqueezeme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;


/**
 * Created by Maurice on 9/29/2016.
 */

public class HistoryTab extends Fragment {

    int force = 0;
    int[] savedForces;
    int i = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View HistoryView = inflater.inflate(R.layout.fragment_history, container, false);

        NumberPicker np = (NumberPicker) HistoryView.findViewById(R.id.numberPicker);
        Button BTN_Save = (Button) HistoryView.findViewById(R.id.BTN_Save);

        np.setMinValue(0);
        np.setMaxValue(40);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Set the force to the value selected
                force = newVal;
            }
        });

        return HistoryView;
    }

    public void saveClick(int newForce)
    {
        if (!(i < 8))
        {
            i = 0;
        }
        savedForces[i] = newForce;
    }



}
