package com.sec.health.health;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/5/6.
 */
public class BaseActivity extends AppCompatActivity {
    public TextView title;
    public Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        title = (TextView) findViewById(R.id.text_title);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //this is what we want
        toolbar.setNavigationIcon(R.drawable.ic_menu_back);

    }

    public void initView(){

    }
}
