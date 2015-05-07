package com.sec.health.health;

import android.app.Activity;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class TestActivity extends Activity implements View.OnClickListener{

    private TextView test;
    private TextView test2;
    private LinearLayout container;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    LayoutInflater inflater;
    private Fragment currentFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        test = (TextView) findViewById(R.id.test);
        test.setOnClickListener(this);
        test2 = (TextView) findViewById(R.id.test2);
        test2.setOnClickListener(this);
        inflater = getLayoutInflater();
        currentFragment = new PlusOneFragment();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        initFragment();
    }


    private void initFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.left_container, currentFragment, "test").commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.test:
                changeFrament(new PlusOneFragment(),"test");
                break;
            case R.id.test2:

//                PlusTwoFragment fragmentw = new PlusTwoFragment();
                changeFrament(new PlusTwoFragment(),"test2");
//                fragmentTransaction.replace(R.id.left_container, fragmentw);
//                fragmentTransaction.commit();
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

}
