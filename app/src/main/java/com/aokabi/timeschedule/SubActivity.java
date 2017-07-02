package com.aokabi.timeschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();
        if (intent != null) {
            String str = intent.getStringExtra("sendString");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
    }
}
