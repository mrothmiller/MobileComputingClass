package com.example.maurice.exsqueezeme;

import android.app.Activity;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Maurice on 9/29/2016.
 */


public class SettingsTab extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View settingsView = inflater.inflate(R.layout.fragment_settings, container, false);
        Button BTN_Scan = (Button) settingsView.findViewById(R.id.BTN_Scan);
//        BTN_Scan.setOnClickListener(BTN_ScanListener);
        return settingsView;
    }


//    private OnClickListener BTN_ScanListener = new OnClickListener()
//    {
//        public void onClick(View v)
//        {
//        }

//    };
//Ending brace of the Outer Class (SettingsTab)
}
