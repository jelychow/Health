package com.sec.health.health;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;


public class TestActivity extends Activity implements View.OnClickListener, DrawerLayout.DrawerListener, FragmentUSerCenter.OnFragmentInteractionListener {

    private TextView test,test2;
    private Button btnDoc,btnPatient;
    private LinearLayout container;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    LayoutInflater inflater;
    private Fragment currentFragment;
    private DrawerLayout mDrawerLayout;
    private ImageView imClose;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
    }

    private void initView() {
        container = (LinearLayout) findViewById(R.id.left_container);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        imClose = (ImageView) findViewById(R.id.image_close);
        test = (TextView) findViewById(R.id.test);
        test.setOnClickListener(this);
        test2 = (TextView) findViewById(R.id.test2);
        test2.setOnClickListener(this);
        btnDoc = (Button) findViewById(R.id.btn_doc);
        btnPatient = (Button) findViewById(R.id.btn_patient);
        btnDoc.setOnClickListener(this);
        btnPatient.setOnClickListener(this);
        imClose.setOnClickListener(this);
        inflater = getLayoutInflater();
        currentFragment = new FragmentUSerCenter();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        mDrawerLayout.setDrawerListener(this);
        initFragment();
    }

    private void initFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.left_container, currentFragment, "test").commit();
    }

    @Override
    public void onClick(View v) {
        container.setVisibility(View.VISIBLE);
        switch (v.getId()) {
            case R.id.test:
                changeFrament(new FragmentUSerCenter(), "test");
                break;
            case R.id.test2:

//                PlusTwoFragment fragmentw = new PlusTwoFragment();
                changeFrament(new PlusTwoFragment(), "test2");
//                fragmentTransaction.replace(R.id.left_container, fragmentw);
//                fragmentTransaction.commit();
                break;
            case R.id.image_close:
                container.setVisibility(View.GONE);
                mDrawerLayout.closeDrawer(Gravity.LEFT);
                break;
            case R.id.btn_doc:
                intent = new Intent(TestActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void changeFrament(Fragment fragment, String fragmentTag) {

        if (fragment == currentFragment) {
            return;
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (!fragment.isAdded()) {
            fragmentTransaction.hide(currentFragment).add(R.id.left_container, fragment, fragmentTag).commit();
        } else {
            fragmentTransaction.hide(currentFragment).show(fragment).commit();
        }
        currentFragment = fragment;

    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    @Override
    public void onDrawerOpened(View drawerView) {

    }

    @Override
    public void onDrawerClosed(View drawerView) {
        container.setVisibility(View.GONE);
    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }

    @Override
    public void onFragmentInteraction(View v) {
       switch (v.getId()){
           case R.id.tv_user_info:
               changeFrament(new UserInfoFragment(), "userinfo");
               break;
        }
    }
}
