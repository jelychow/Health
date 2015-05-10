package com.sec.health.health;

import android.os.Bundle;


public class IntegrationMallActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        title.setText("积分商城");
    }

    @Override
    public void initView() {
        super.initView();
        setContentView(R.layout.activity_integration_mall);
    }
}
