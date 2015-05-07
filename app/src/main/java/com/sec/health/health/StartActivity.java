package com.sec.health.health;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDoc;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btnDoc = (Button) findViewById(R.id.btn_doc);
        btnDoc.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_doc:
                intent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
