package com.sec.health.health;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class PlusOneFragment extends Fragment {

    Button mPlusOneButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);

        //Find the +1 button
        mPlusOneButton = (Button) view.findViewById(R.id.plus_one_button);

        return view;
    }


}
