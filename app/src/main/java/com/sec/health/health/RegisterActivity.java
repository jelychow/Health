package com.sec.health.health;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegisterActivity extends BaseActivity implements View.OnClickListener{

    private Button btnNext;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnNext = (Button) findViewById(R.id.button_next);
        btnNext.setOnClickListener(this);
        title.setText("登录");
    }

    @Override
    public void initView() {
        super.initView();
        setContentView(R.layout.activity_register);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_next:
                intent = new Intent(RegisterActivity.this,RegisterOkActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
