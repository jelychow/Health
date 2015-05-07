package com.sec.health.health;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnNext;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnNext = (Button) findViewById(R.id.button_next);
        btnNext.setOnClickListener(this);
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
