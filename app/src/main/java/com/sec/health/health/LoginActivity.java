package com.sec.health.health;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private Button btnLogin;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title.setText("登录");
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void initView() {
        super.initView();
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
