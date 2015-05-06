package com.sec.health.health;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class RegisterOkActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title.setText("注册完成");
    }

    @Override
    public void initView() {
        super.initView();
        setContentView(R.layout.activity_register_ok);
    }
}
