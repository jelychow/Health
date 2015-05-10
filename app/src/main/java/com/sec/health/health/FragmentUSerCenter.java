package com.sec.health.health;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sec.health.health.userdata.UserDataActivity;


public class FragmentUSerCenter extends Fragment implements View.OnClickListener{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private TextView tvUserInfo;
    private View im_modify;
    private TextView tv_star,tv_my_wallet,tv_my_integration,tv_self_inspection;
    private TextView tv_collection;
    private OnFragmentInteractionListener mListener;
    private Intent intent;
    private View tv_disease_data;


    public static FragmentUSerCenter newInstance(String param1, String param2) {
        FragmentUSerCenter fragment = new FragmentUSerCenter();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentUSerCenter() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_center, container, false);
        tvUserInfo = (TextView) view.findViewById(R.id.tv_user_info);
        im_modify = view.findViewById(R.id.im_modify);
        tv_star = (TextView) view.findViewById(R.id.tv_star);
        tv_disease_data = view.findViewById(R.id.tv_disease_data);
        tv_collection = (TextView) view.findViewById(R.id.tv_collection);
        tv_my_wallet = (TextView) view.findViewById(R.id.tv_my_wallet);
        tv_my_integration = (TextView) view.findViewById(R.id.tv_my_integration);
        tv_self_inspection = (TextView) view.findViewById(R.id.tv_self_inspection);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvUserInfo.setOnClickListener(this);
        im_modify.setOnClickListener(this);
        tv_star.setOnClickListener(this);
        tv_disease_data.setOnClickListener(this);
        tv_collection.setOnClickListener(this);
        tv_my_wallet.setOnClickListener(this);
        tv_my_integration.setOnClickListener(this);
        tv_self_inspection.setOnClickListener(this);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_user_info:
                mListener.onFragmentInteraction(v);
                break;
            case R.id.im_modify:
                intent = new Intent(getActivity(), UserDataActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_star:
                mListener.onFragmentInteraction(v);
                break;
            case R.id.tv_disease_data:
                mListener.onFragmentInteraction(v);
                break;
            case R.id.tv_collection:
                mListener.onFragmentInteraction(v);
                break;
            case R.id.tv_my_wallet:
                mListener.onFragmentInteraction(v);
                break;
            case R.id.tv_my_integration:
            mListener.onFragmentInteraction(v);
            break;
            case R.id.tv_self_inspection:
                mListener.onFragmentInteraction(v);
                break;
            default:
                break;

        }
    }

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(View v);
    }


}
