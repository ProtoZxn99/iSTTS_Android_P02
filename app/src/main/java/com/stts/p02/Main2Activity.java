package com.stts.p02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String user = i.getStringExtra("user");
        String pass = i.getStringExtra("pass");

        ((TextView)findViewById(R.id.textView3)).setText(user+" "+pass);
    }
}
