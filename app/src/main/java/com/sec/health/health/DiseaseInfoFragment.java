package com.sec.health.health;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sec.health.health.userdata.UserDataActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiseaseInfoFragment extends Fragment implements View.OnClickListener {

    private Button btnIml;
    private Intent intent;
    public DiseaseInfoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disease_info, container, false);
        btnIml = (Button) view.findViewById(R.id.btn_implement);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnIml.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_implement:
                intent = new Intent(getActivity(), UserDataActivity.class);
                startActivity(intent);
                break;
        }
    }
}
