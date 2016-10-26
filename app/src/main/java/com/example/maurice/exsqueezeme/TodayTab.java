package com.example.maurice.exsqueezeme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Maurice on 9/29/2016.
 */

public class TodayTab extends Fragment {

    TextView TV_currentGoal;
    TextView TV_currentRep;
    int docGoal;
//    TodayTab tt = new TodayTab();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View todayView = inflater.inflate(R.layout.fragment_today, container, false);
        TextView TV_currentGoal = (TextView) todayView.findViewById(R.id.TV_currentGoal);
//        TV_currentGoal.setText(tt.getGoal());
//        TV_currentRep = (TextView) todayView.findViewById(R.id.currentRep);
        Button BTN_sync = (Button) todayView.findViewById(R.id.BTN_Sync);
        Button BTN_save = (Button) todayView.findViewById(R.id.BTN_Save);
        return todayView;

    }

    //Create the method that goes and grabs the goals for the patient
    public int getGoal()
    {
        int goal =100;
        /*
         *Place logic to grab the exercise goal from the server
         */
        /*
         *docGoal should go and grab the goal set by the Doctor
         */
         if(!(docGoal == goal))
         {
             docGoal = goal;
         }
      return docGoal;
    }

    public void syncData(View v)
    {

    }
    public void saveData(View v)
    {

    }


}
