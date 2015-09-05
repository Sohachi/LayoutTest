package com.ametice.layouttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();

        String str = intent.getStringExtra("key");

        Toast.makeText(this,str,Toast.LENGTH_LONG).show();

    }




}