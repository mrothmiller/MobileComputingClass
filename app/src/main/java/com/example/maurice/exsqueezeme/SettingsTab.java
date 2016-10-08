package com.example.maurice.exsqueezeme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Maurice on 9/29/2016.
 */


public class SettingsTab extends Fragment {

    Button sButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View settingsView = inflater.inflate(R.layout.fragment_settings, container, false);
        sButton = (Button) settingsView.findViewById(R.id.syncButton);
        return settingsView;

        sButton.setOnClickListener(FindDevices());
    }

    public int FindDevices()
    {

    }
}
