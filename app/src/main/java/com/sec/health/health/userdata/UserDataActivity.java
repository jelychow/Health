package com.sec.health.health.userdata;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.sec.health.health.R;

public class UserDataActivity extends AppCompatActivity implements PatientDataFragment.UserInfo {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    LayoutInflater inflater;
    LinearLayout userContainer;
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
        userContainer = (LinearLayout) findViewById(R.id.user_container);
        currentFragment = new PatientDataFragment();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        initFragment();
    }


    private void initFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.user_container, currentFragment, "userdata1").commit();
    }

    public void changeFrament(Fragment fragment, String fragmentTag) {

        if (fragment == currentFragment) {
            return;
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (!fragment.isAdded()) {
            fragmentTransaction.hide(currentFragment).add(R.id.user_container, fragment, fragmentTag).commit();
        } else {
            fragmentTransaction.hide(currentFragment).show(fragment).commit();
        }
        currentFragment = fragment;

    }

    @Override
    public void toNext(View v) {
        changeFrament(new UserInfo2Fragment(), "userdata2");
    }
}
