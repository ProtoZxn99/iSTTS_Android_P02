package com.stts.p02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText txtuser, txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser = findViewById(R.id.editText);
        txtpass = findViewById(R.id.editText2);
    }

    public void btnLoginClick(View v){
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("user",txtuser.getText().toString());
        i.putExtra("pass",txtpass.getText().toString());
        startActivity(i);
    }

    public void btnSendClick(View v){
        Uri u = Uri.parse("smsto:08991269638");
        Intent i = new Intent(Intent.ACTION_SENDTO, u);
        i.putExtra("sms_body",(new Random().nextInt(1000))+1000+"");
        startActivity(i);
    }
}
