package com.sec.health.health;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sec.health.health.diagosis.MyDiagnosis;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiagnosisFragment extends Fragment {

    private Button btn_appoint;
    public DiagnosisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_diagnosis, container, false);
        btn_appoint = (Button) view.findViewById(R.id.btn_appoint);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyDiagnosis.class);
                startActivity(intent);
            }
        });
    }
}
