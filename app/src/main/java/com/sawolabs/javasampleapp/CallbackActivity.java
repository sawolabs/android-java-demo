package com.sawolabs.javasampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sawolabs.androidsdk.util.Constants;


public class CallbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback);
        Toast.makeText(this,"Logged in successfully",Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String message = intent.getStringExtra(Constants.LOGIN_SUCCESS_MESSAGE);
        Log.i("payload:",message);
    }
}